
package com.libreriaweb.Libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
    
    @GetMapping("/cargarAutor")
    public String cargar(){
        return "cargar-autor";
    }
    
}
