
package com.libreriaweb.Libreria.servicios;

import com.libreriaweb.Libreria.entidades.Libro;
import com.libreriaweb.Libreria.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    public void guardarLibro(long isnb, String titulo, Integer anio, Integer ejemplares, Integer prestados ){
        Libro libro = new Libro();
            libro.setIsbn(isnb);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(prestados);
            libro.setEjemplaresRestantes(ejemplares-prestados);
            libroRepositorio.save(libro);
    }
}
