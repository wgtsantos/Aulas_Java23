/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author Instrutor
 */
public class Particular extends Carro{
    
    private String cliente;
    private String cpf;
    
    public Particular(){
        super();
    }
    
    public Particular(String cliente, String cpf, int qtd_porta, String direcao, String nome, String marca, double preco){
        
        super(qtd_porta, direcao,  nome,  marca, preco);
        this.cliente = cliente;
        this.cpf = cpf;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
