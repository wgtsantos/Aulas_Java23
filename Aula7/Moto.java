/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author Instrutor
 */
public class Moto extends Veiculo{
    
    private int cilindrada;
    
    public Moto() {
        super();
    }
    
    public Moto(int cilindrada, String nome, String marca, double preco) {
        super(nome, marca, preco);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
