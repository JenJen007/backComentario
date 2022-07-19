
package com.comentario.controller;

import com.comentario.models.Comentario;
import com.comentario.servicio.ComentarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComentarioController {
    @Autowired
    ComentarioService comentarioService;
    
    @GetMapping("comentario/")
    public List<Comentario> getComentario(){
        return comentarioService.verComentario();
    }
    
    @GetMapping("comentario/{id}")
    public Comentario getComentarioById(@PathVariable Long id){
        Comentario comentario = comentarioService.buscarComentario(id);
        return comentario;
    }
    
    @PostMapping("comentario/")
    public Comentario agregarComentario(@RequestBody Comentario comentario){
        Comentario _comentario = comentarioService.agregarComentario(comentario);
        return _comentario;
    }
    
    @DeleteMapping("comentario/{id}")
    public void  borrarComentario(@PathVariable Long id){
        comentarioService.borrarComentario(id);
       
    }
    
    @PutMapping("comentario/{id}")

public Comentario editarComentario(@PathVariable ("id") long id, @RequestBody Comentario comentario){

Comentario _comentario = comentarioService.buscarComentario(id);

_comentario.setTitulo(comentario.getTitulo());
_comentario.setTexto(comentario.getTexto());
_comentario.setCreador(comentario.getCreador());




comentarioService.agregarComentario(_comentario);
return _comentario;

}
    
    
   
}
