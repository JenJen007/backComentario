
package com.comentario.repositorio;

import com.comentario.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentario extends JpaRepository<Comentario,Long> {
    
}
