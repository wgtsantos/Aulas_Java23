/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author Instrutor
 */
public class Produto {
    
    String nome; // Variavel Publica
    private String marca;
    private int qtde;
    private double valor;
    private double total;
    
    
    public void Produto(String nome, String marca, double valor) {
        
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Valor: " + valor);
        
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

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
        
    public void somaTotal() {
        
       double t = this.getValor() * this.getQtde();
        
       System.out.println("Total: " + Math.floor(t)); 
       
    }
    
    public void alterarValor(double altVar) {
        
       double novoValor = altVar; 
       this.valor = novoValor;
        
    }
    
    public void altQtde(int qt) {
        
        this.qtde += qt;
           
        if (this.qtde < 0) {
               
               System.out.println("Produto esgotado!!!");
 
        }
    }
    
    public void desconto(double des) {
        
        double result = this.valor - (this.valor * des);
        this.valor = result;
        
    }
    
}
