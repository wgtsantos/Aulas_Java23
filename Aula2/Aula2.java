/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num1, num2, total;
        
        System.out.println("Informe um número: ");
        num1 = ler.nextInt();
        
        System.out.println("Informe outro número: ");
        num2 = ler.nextInt();
        
        total = num1 + num2;
        
        System.out.println("A soma dos números é " + total);
        
    }
    
}
