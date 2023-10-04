/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author Instrutor
 */
public class Empresa extends Carro{
    
    private String nome_empresa;
    private String cnpj;
    
    public Empresa() {
        super();
    }
    
    public Empresa(String nome_empresa, String cnpj, int qtd_porta, String direcao, String nome, String marca, double preco) {
        
        super(qtd_porta, direcao, nome, marca, preco);
        this.nome_empresa = nome_empresa;
        this.cnpj = cnpj;
       
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
    
    
}
