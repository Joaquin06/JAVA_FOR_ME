/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;

import pe.egcc.app.model.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoService {
 
    PagoDto pago=new PagoDto();
    
    
   public double procesar(double horasxdia,int dias,double pagoxhora) {
        return (horasxdia*dias*pagoxhora);

        
    }
    
    
}
