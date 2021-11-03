
package com.libreriaweb.Libreria.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
public class PortalControlador {
    
  
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/buscarLibro")
    public String buscarLibro(){
        return "buscarLibro.html";
    }
    
    @PostMapping("/guardarLibro")
    public String registrar(@RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados){
        
        return "index.html";
        
    } 
    
}
