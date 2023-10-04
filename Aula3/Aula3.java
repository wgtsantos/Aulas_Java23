/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

    String nome;
    int nota1, nota2, nota3;
    double result;

     System.out.println("Informe o nome do aluno: ");
     nome = ler.nextLine();

     System.out.println("Informe a Nota 1 do aluno: ");
     nota1 = ler.nextInt();

     System.out.println("Informe a Nota 2 do aluno: ");
     nota2 = ler.nextInt();

     System.out.println("Informe a Nota 3 do aluno: ");
     nota3 = ler.nextInt();

     result = (nota1 + nota2 + nota3)/3;

     if (result >= 7) {

       System.out.println("O aluno " + nome + " foi aprovado com a nota " + result);

     } else if (result >= 4 && result <= 6){

       System.out.println("O aluno " + nome + " está de recuperação com a nota " + result);   
     
     } else {
         
       System.out.println("O aluno " + nome + " foi reprovado com a nota " + result);  
     }

        
        
    }
    
}
