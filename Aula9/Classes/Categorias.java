/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Categoria;

/**
 *
 * @author Instrutor
 */
public class Categorias implements Categoria {
    
    private String nome;

    public Categorias(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

}
