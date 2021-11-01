
package com.libreriaweb.Libreria.servicios;

import com.libreriaweb.Libreria.entidades.Libro;
import com.libreriaweb.Libreria.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    public void crearLibro(Long isbn, String titulo, Integer anio, Integer Ejemplares){
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(Ejemplares);
        
        libroRepositorio.save(libro);
        
    }
}
