
package com.libreriaweb.Libreria.repositorios;

import com.libreriaweb.Libreria.entidades.Autor;
import com.libreriaweb.Libreria.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, String>{
    
}
