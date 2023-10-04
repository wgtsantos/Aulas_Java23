/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import SubClasses.JogoMobile;
import SubClasses.JogoPC;
import SubClasses.JogoPlaystation;
import SubClasses.JogoXbox;
import java.util.ArrayList;

/**
 *
 * @author Instrutor
 */
public class Game_Data {
    
    private ArrayList<JogoDigital> games = new ArrayList<>();
    
    // JogoDigital game = new JogoDigital("God of War", 200.00, "Mitologia", 10);
    // JogoDigital[] games = new JogoDigital[10];
    
    public ArrayList Games() {
              
        getGames().add(new JogoPlaystation("God of War - Ragnarok", 200.00, 10, new Categorias("Mitologia")));
        getGames().add(new JogoXbox("Need For Speed - Heat", 189.00, 15, new Categorias("Corrida")));
        getGames().add(new JogoPC("Mortal Kombat 1", 499.00, 5, new Categorias("Luta")));
        getGames().add(new JogoPC("Call of Dutty - WarZone", 99.00, 10, new Categorias("FPS")));
        getGames().add(new JogoPC("Street Fighter 6", 259.90, 16, new Categorias("Luta")));
        getGames().add(new JogoXbox("GTA V", 59.00, 21, new Categorias("Mundo Aberto")));
        getGames().add(new JogoPlaystation("FIFA 23", 189.90, 19, new Categorias("Esporte")));
        getGames().add(new JogoMobile("Super Mario Bros 3", 18.00, 8, new Categorias("Aventura")));
        getGames().add(new JogoPlaystation("Red Dead Redenption 2", 250.00, 17, new Categorias("Mundo Aberto")));
        getGames().add(new JogoXbox("Forza Horizon 5", 389.00, 25, new Categorias("Corrida")));
        getGames().add(new JogoPC("The King of Fighters XVI", 199.00, 9, new Categorias("Luta")));
        getGames().add(new JogoPC("Raibow Six Siege", 279.00, 12, new Categorias("FPS")));
        getGames().add(new JogoPC("Guilty Gear - Strive", 99.90, 16, new Categorias("Luta")));
        getGames().add(new JogoXbox("Assasin's Creed - Odissey", 159.00, 21, new Categorias("Mundo Aberto")));
        getGames().add(new JogoPlaystation("F1 - 2023", 189.90, 19, new Categorias("Esporte")));
        getGames().add(new JogoMobile("Zelda 3 MObile", 18.00, 8, new Categorias("Aventura")));
        
        return getGames();
        
    }

    public ArrayList<JogoDigital> getGames() {
        return games;
    }

    public void setGames(ArrayList<JogoDigital> games) {
        this.games = games;
    }
    
    public void ListarJogos() {
        
        /* System.out.println("Jogo: "+ game.getNome());
        System.out.println("Preço: R$" + game.getPreco());
        System.out.println("Categoria: " + game.getCategoria());
        System.out.println("Desconto preço a Vista: " + game.aplicarDesconto(game.getPreco())); */
        
        this.Games();
        
        System.out.println("Jogos Cadastrados: ------------------");
              
        double total = 0, totalD = 0;
               
        for (JogoDigital game : games) {
            
         System.out.println("---------------------------------------------");
         System.out.println(""); 
         
         System.out.println("Jogo: "+ game.getNome());
         System.out.println("Preço: R$" + game.getPreco());
         System.out.println("Categoria: " + game.getPlataforma().getNome());
         System.out.println("Categoria: " + game.getCategoria().getNome());
         System.out.println("Desconto preço a Vista: " + game.aplicarDesconto(game.getPreco()));
                  
         System.out.println(""); 
         System.out.println("---------------------------------------------");

         total += game.getPreco();
         totalD += game.aplicarDesconto(game.getPreco());
         
        }
        
        System.out.println("Quantidade de Jogos: " + games.size());
        System.out.println("Valor total dos Jogos: " + Math.floor(total));
        System.out.println("Valor total dos Jogos com Desconto: " + Math.floor(totalD));
        
    }
    
    public void ListarJogosPorPlataforma(String plataforma) {
        
        String p = plataforma;
        int cont = 0;
        
        this.Games();
        
        System.out.println("Jogos de " + p + " Cadastrados: ------------------");
              
        double total = 0, totalD = 0;
               
        for (JogoDigital game : games) {
            
         if(game.getPlataforma().getNome().equals(p)) {
            
         System.out.println("---------------------------------------------");
         System.out.println(""); 
         
         System.out.println("Jogo: "+ game.getNome());
         System.out.println("Preço: R$" + game.getPreco());
         System.out.println("Categoria: " + game.getCategoria().getNome());
         System.out.println("Desconto preço a Vista: " + game.aplicarDesconto(game.getPreco()));
                  
         System.out.println(""); 
         System.out.println("---------------------------------------------");

         total += game.getPreco();
         totalD += game.aplicarDesconto(game.getPreco());
         cont++;
         
         }
         
        }
        
        System.out.println("Quantidade de Jogos: " + cont);
        System.out.println("Valor total dos Jogos: " + Math.floor(total));
        System.out.println("Valor total dos Jogos com Desconto: " + Math.floor(totalD));
        
    }
    
    public void ListarJogosPorCategoria(String categoria) {
        
        String cat = categoria;
        int cont = 0;
        
        this.Games();
        
        System.out.println("Jogos da Categoria " + cat + " Cadastrados: ------------------");
              
        double total = 0, totalD = 0;
               
        for (JogoDigital game : games) {
            
         if(game.getCategoria().getNome().equals(cat)) {
            
         System.out.println("---------------------------------------------");
         System.out.println(""); 
         
         System.out.println("Jogo: "+ game.getNome());
         System.out.println("Preço: R$" + game.getPreco());
         System.out.println("Categoria: " + game.getCategoria().getNome());
         System.out.println("Desconto preço a Vista: " + game.aplicarDesconto(game.getPreco()));
                  
         System.out.println(""); 
         System.out.println("---------------------------------------------");

         total += game.getPreco();
         totalD += game.aplicarDesconto(game.getPreco());
         cont++;
         
         }
         
        }
        
        System.out.println("Quantidade de Jogos: " + cont);
        System.out.println("Valor total dos Jogos: " + Math.floor(total));
        System.out.println("Valor total dos Jogos com Desconto: " + Math.floor(totalD));
    }
    
}
