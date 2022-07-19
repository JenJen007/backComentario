
package com.comentario.ServicioInterfaz;

import com.comentario.models.Comentario;
import java.util.List;


public interface ComentarioServicioInter {
    
    public List<Comentario> verComentario();
    
    public Comentario agregarComentario(Comentario comentario);
    
    public void borrarComentario(Long id);
    
    public Comentario buscarComentario(Long id);
    
    
   
}
