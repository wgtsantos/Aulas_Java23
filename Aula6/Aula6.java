/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6;

/**
 *
 * @author Instrutor
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        
        p1.Produto("Placa Mãe", "Asus", 340.99);
        
        p1.nome = "Memória Ram 16GB"; // Variavel publica
       // p1.getNome("Memória Ram 16GB"); // Variavel Privada
        p1.setMarca("Corsair");
        p1.setQtde(40);
        p1.setValor(250.98);
        p1.setTotal(0);
        
        p1.alterarValor(360.88);
        p1.altQtde(-1);
        p1.desconto(0.5);
        
        System.out.println("Nome do Produto: " + p1.getNome());
        System.out.println("Marca do Produto: " + p1.getMarca());
        System.out.println("Quantidade: " + p1.getQtde());
        System.out.println("Valor do Produto: " + p1.getValor());
        p1.somaTotal();
        
        
        
    }
    
}
