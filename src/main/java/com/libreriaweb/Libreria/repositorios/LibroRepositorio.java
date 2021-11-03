
package com.libreriaweb.Libreria.repositorios;

import com.libreriaweb.Libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String> {
   @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarPorTitulo(@Param("titulo") String titulo);
       
}



//OTRA FORMA: 
//
//@Repository
//public interface PersonaRepository extends JpaRepository<Persona, Long> {
//
//    @Query("select p from Persona p where p.nombre like %?1%")//busqueda por un solo campo
//    List<Persona> findByName(String nombre);
//
//    /**busqueda por varios campos, lo que se quiere es que cuando ingrese una letra, este se búsque  
//     * en los dos campos nombre y apellido no por separado la cual lo realiza la siguiente consulta
//
//    */
//    @Query("select p from Persona p where p.nombre = :nombre or p.apellido = :apellido")
//    List<Persona> findByNameOrLastName(@Param("nombre") String nombre, @Param("apellido") String apellido);//se quiere que reciba solo un parámetro pero que realice la búsqueda en los dos campos
//
//}
