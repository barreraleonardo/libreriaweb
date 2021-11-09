
package com.libreriaweb.Libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libro")
public class LibroControlador {
    
    @GetMapping("/guardar")
    public String cargar(){
        return "cargar-libro";
        
       
    }
    
    @PostMapping("/guardarLibro")
    public String registrar(@RequestParam long isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares){
        System.out.println("ISBN= " + isbn);
        System.out.println("TITULO= " + titulo);
        return "cargar-libro.html";
        
    } 
    
    
}
