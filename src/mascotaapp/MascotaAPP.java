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
       
        Mascota m1= new Mascota("Pepe","Copito","Perro","Blanco",12,true,"Caniche Toy");// Hay que poner la misma cantidad que el construcor
        
       
//  m1.apodo="Chiquito";
//  m1.nombre="Coquito";
//  m1.tipo="Perro";
//  m1.raza="Beagle";
//  m1.edad=14;
//  System.out.println(m1.apodo+ " "+m1.nombre+" "+m1.tipo+ " "+m1.raza+" "+m1.edad+" Años");
        
       m1.setNombre("Copito"); // Aca le cambiamos el nombre que originalmente se asigno en la linea 22
       m1.setTipo("Beagle");
       System.out.println(m1.toString()); // Antes de aplicar metodo pasear
       
       m1.pasear(100);
              
        System.out.println(m1.getNombre());
        System.out.println(m1); // Usando el toString
        System.out.println(m1.toString()); // Usando el toString igual al anterior
        
       
    }
    
    
}
