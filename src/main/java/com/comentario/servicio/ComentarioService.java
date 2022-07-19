
package com.comentario.servicio;

import com.comentario.ServicioInterfaz.ComentarioServicioInter;
import com.comentario.models.Comentario;
import com.comentario.repositorio.IComentario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ComentarioService  implements ComentarioServicioInter{
    @Autowired IComentario iComentario;

    @Override
    public List<Comentario> verComentario() {
       List<Comentario> comentario = iComentario.findAll();
       return comentario;
    }

    @Override
    public Comentario agregarComentario(Comentario comentario) {
       Comentario _comentario = iComentario.save(comentario);
       return _comentario;
    }

    @Override
    public void borrarComentario(Long id) {
        iComentario.deleteById(id);
    }

    @Override
    public Comentario buscarComentario(Long id) {
        Comentario comentario = iComentario.findById(id).orElse(null);
        return comentario;
    }

  

    
}
