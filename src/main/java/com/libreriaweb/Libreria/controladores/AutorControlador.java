
package com.libreriaweb.Libreria.controladores;

import com.libreriaweb.Libreria.entidades.Autor;
import com.libreriaweb.Libreria.servicios.AutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("/cargarAutor")
    public String cargar(){
        return "cargar-autor";
    }
    
    @GetMapping("/listarAutor")
        public String lista(ModelMap modelo){
        List<Autor> autoresLista = autorServicio.listaAutores();
        modelo.addAttribute("autores", autoresLista);
        return "listarAutor";
    }
        
        @PostMapping("/alta")
        public String alta(ModelMap modelo, @RequestParam String id){
        autorServicio.alta(id);
        List<Autor> autoresLista = autorServicio.listaAutores();
        modelo.addAttribute("autores", autoresLista);
        return "/listarAutor";
    }
    
    @PostMapping("/guardarAutor")
    public String cargar(@RequestParam String nombre){
        autorServicio.crearAutor(nombre);
        return "cargar-autor";
}
  
    
}
