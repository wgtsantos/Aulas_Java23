/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        Scanner lerS = new Scanner(System.in);
        
        // String[] nomes = new String[10000];
        // int[] idades = new int[10000];
        
        List<String> nomes = new ArrayList();
        List<Integer> idades = new ArrayList();
        
        int sair = 0;
        int i = 0;
        
        while (sair == 0) {          
            
            System.out.println("Informe o nome do cliente: ");
            nomes.add(i, lerS.nextLine());
            
            System.out.println("Informe a idade do cliente: ");
            idades.add(i, ler.nextInt());
            
            System.out.println("Deseja cadastrar outro cliente? 0-Sim  1-Não: ");
            sair = ler.nextInt();
            
            i++; // i = i + 1
            
        }
        
        int ok = 0;
        
        System.out.println("Você cadastrou " + nomes.size() + " Clientes.");
        System.out.println("Deseja visualizar os clientes cadastrados? 1.SIM - 0.NÃO");
        ok = ler.nextInt();
        
        if (ok == 1) {
            
            for (int j = 0; j < nomes.size(); j++) {

              System.out.println("Cliente 0" + j + ": " + nomes.get(j)); 
              System.out.println("Idade: " + idades.get(j));
              System.out.println("------------------------------------------");
              
            }
            
        } else {
            System.out.println("Sistema Finalizado!");
        }
    }
    
}
