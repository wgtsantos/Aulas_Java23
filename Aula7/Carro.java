/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author Instrutor
 */
public class Carro extends Veiculo{
    
    private int qtd_porta;
    private String direcao;
    
    public Carro(){
        super();
    }
    
    public Carro(int qtd_porta, String direcao, String nome, String marca, double preco){
        super(nome, marca, preco);
        this.qtd_porta = qtd_porta;
        this.direcao = direcao;
    }

    public int getQtd_porta() {
        return qtd_porta;
    }

    public void setQtd_porta(int qtd_porta) {
        this.qtd_porta = qtd_porta;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    
    
    
}
