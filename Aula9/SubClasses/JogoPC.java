/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubClasses;

import Classes.JogoDigital;
import Classes.Plataform;
import Interfaces.Categoria;

/**
 *
 * @author Instrutor
 */
// Subclasse representando um jogo de JogoPC
public class JogoPC extends JogoDigital {
    
    public JogoPC(String nome, double preco, double descpreco, Categoria categoria) {
        
        super(nome, preco, categoria, descpreco, new Plataform("PC Gamer"));
    }
}