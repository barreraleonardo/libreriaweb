
package com.libreriaweb.Libreria.servicios;

import com.libreriaweb.Libreria.entidades.Autor;
import com.libreriaweb.Libreria.repositorios.AutorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    //Crear autor
    public void crearAutor(String nombre){
     Autor autor = new Autor();
     autor.setNombre(nombre);
     autor.setAlta(true);
     autorRepositorio.save(autor);
    }
    
    //Listar autores
     public List listaAutores(){
     return autorRepositorio.findAll();
    }
     
     //Alta
     public void alta(String id){
     Autor autor = new Autor();  
     autor=autorRepositorio.getById(id);
         if (autor.isAlta()) {
             autor.setAlta(false);
         }else{
             autor.setAlta(true);
         }
         autorRepositorio.save(autor);
    }
     
    
}
