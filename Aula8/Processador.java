/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author Instrutor
 */
public class Processador extends Hardware {
    
    public Processador(int potenciaWatts) {
        super(potenciaWatts);
    }
 
    @Override
    public void inicializar() {
       
       System.out.print("Processador inicializado com sucesso!!");
       System.out.println(" - Seu consumo é de " + getPotenciaWatts() + "W");
       
    }
    

    
}
