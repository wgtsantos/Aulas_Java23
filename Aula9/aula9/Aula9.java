/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula9;

import Classes.Game_Data;
import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Game_Data gd = new Game_Data();
      
      String categoria, plataforma;
      int opt;
      
      Scanner ler = new Scanner(System.in);
      Scanner l = new Scanner(System.in);
      
      System.out.println("-------------- Banco de dados de Jogos Digitais ---------------");
      System.out.println("-------------- O que deseja visualizar: -----------------------");
      System.out.println("1-Visualizar todos os Jogos -----------------------------------");
      System.out.println("2-Visualizar Jogos por Plataforma -----------------------------");
      System.out.println("3-Visualizar Jogos por Categoria ------------------------------");
      System.out.print("=> ");
      opt = ler.nextInt();
      
        switch (opt) {
            case 1:
                gd.ListarJogos();
                break;
                
            case 2:
                System.out.print("Informe a Plataforma: ");
                plataforma = l.nextLine();
                gd.ListarJogosPorPlataforma(plataforma);
                break;
                
            case 3:
                System.out.print("Informe a Categoria: ");
                categoria = l.nextLine();
                gd.ListarJogosPorCategoria(categoria);
                break;
                
            default:
                System.out.print("Opção Inválida!!");
        }
               
    }

    
}
