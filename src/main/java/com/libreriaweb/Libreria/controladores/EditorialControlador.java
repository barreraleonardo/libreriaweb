
package com.libreriaweb.Libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
    
    
   @GetMapping("/guardar")
   public String guardar(){
       return "cargar-editorial";
   }
    
}
