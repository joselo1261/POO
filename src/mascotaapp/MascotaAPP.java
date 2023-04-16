/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import mascotaapp.entidades.Mascota;


/**
 *
 * @author dell
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Mascota m1= new Mascota("Pepe");// Hay que poner la misma cantidad que el construcor
       
//       m1.apodo="Chiquito";
//       m1.nombre="Coquito";
//       m1.tipo="Perro";
//       m1.raza="Beagle";
//       m1.edad=14;

        
       
       //System.out.println(m1.apodo+ " "+m1.nombre+" "+m1.tipo+ " "+m1.raza+" "+m1.edad+" Años");
        
       m1.setNombre("Jose Luis");
       
    }
    
}
