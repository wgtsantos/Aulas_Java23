/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Categoria;
import Interfaces.Desconto;
import Interfaces.Jogo;
import Interfaces.Plataforma;

/**
 *
 * @author Instrutor
 */
public class JogoDigital implements Jogo, Desconto{
    
    private String nome;
    private double preco;
    private double descpreco;
    private Categoria categoria;
    private Plataforma plataforma;
    
    public JogoDigital() {
        
    }
    
    public JogoDigital(String nome, double preco, Categoria categoria, double descpreco, Plataforma plataforma) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descpreco = descpreco;
        this.plataforma = plataforma;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public Plataforma getPlataforma() {
        return plataforma;
    }

    @Override
    public double aplicarDesconto(double preco) {
        
        // Calcular o Desconto do preco do jogo (340.00 - (340.00 * 20%) 
        
        double precoDescontado = preco - (preco * (this.descpreco /100.0));
        return precoDescontado;
        
    }  
       
    
}
