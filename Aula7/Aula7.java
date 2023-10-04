/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

// import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner ler = new Scanner(System.in);       
        
       /* 
        Veiculo v1 = new Veiculo();
        System.out.println("Digite: ");
        String nome = ler.next();
        Veiculo v1 = new Veiculo(nome, "chevrolet", 99889.00);
        v1.nome = "Chevete";
        System.out.println(v1.getNome()); */
       
       Carro c1 = new Carro();
       Moto m1 = new Moto();
       
       c1.setNome("Corsa");
       m1.setNome("Honda");
       
       Particular p1 = new Particular();
       Empresa e1 = new Empresa();
       
       p1.setCliente("Marta rocha");
       e1.setNome_empresa("FIEMG");
       
       System.out.println("O veículo: " + c1.getNome() + " pertence ao cliente: " + p1.getCliente());
       
        
    }
    
}
