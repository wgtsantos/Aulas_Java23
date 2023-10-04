/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Plataforma;

/**
 *
 * @author Instrutor
 */
public class Plataform implements Plataforma {
    
    private String nome;

    public Plataform(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
}
