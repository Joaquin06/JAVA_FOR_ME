/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 *
 * @author Alumno
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String email;

    
 
    
    /*
    Constructor por defecto
    */

    public Estudiante() {
    
        nombre="Gigo";
        apellido="hhhhh";
        edad=24;
        email="mail@gmail.com";
        casado=true;
        
      
    }
    
       /*Constructor adicional*/
    
    public Estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.email = email;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
            System.err.println("Chau objeto!!!");
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
    
        String repo="";
        
        repo +="Nombre: " + nombre +"\n";
        repo +="Apellido: " + apellido +"\n";
        repo +="Email: " + email +"\n";
        repo +="Edad: " + edad +"\n";
        repo +="Estado: " + casado +"\n";
    
        
        
        return repo; //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
  
    
    
}
