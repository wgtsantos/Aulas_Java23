/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author Instrutor
 */
public class Veiculo {
    
    private String nome;
    private String marca;
    private double preco;
    
    public Veiculo () {
        // Construtor implícito
    }
 
    public Veiculo(String nome, String marca, double preco) {
    
        this.nome = nome;
        this.marca = marca;   // Construtor Explícito
        this.preco = preco;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
