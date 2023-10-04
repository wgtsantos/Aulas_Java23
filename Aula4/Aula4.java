/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;

/**
 *
 * @author Instrutor
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] carros = {"Fusca", "Chevete", "Variant", "Opala"};
        
        int[] numeros = {4, 23, 5, 9, 20};
        
       // System.out.println(carros[2]);
      //  System.out.println(numeros[3]);
      
        for (int i = 0; i < carros.length; i++) {
            
            System.out.println(carros[i]); 
        }

        System.out.println("-------------------------------------------");        
        
       for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
        }
        
    }
    
}
