/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author Instrutor
 */
public class SSD extends Hardware {

    public SSD(int potenciaWatts) {
        super(potenciaWatts);
    }
    
    @Override
    public void inicializar() {
        
        System.out.print("SSD inicializado com Sucesso!");
        System.out.println(" - Seu consumo é de " + getPotenciaWatts() + "W");
    }
    
    
    
}
