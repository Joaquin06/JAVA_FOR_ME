/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.model.Estudiante;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
            
        Estudiante est01= new Estudiante();
        
        
        System.out.println(est01);
        System.out.println("------------------------------");
      
        
        
        est01.setApellido("Huauya");
        est01.setNombre("Joaquin");
        est01.setEdad(22);
        est01.setEmail("joaquin@gmail.com");
        est01.setCasado(true);
        
        System.out.println("Nombre: "+est01.getNombre());
        System.out.println("------------------------------");
        System.out.println(est01);
        
        
        
        
    }

    
 
    
}
