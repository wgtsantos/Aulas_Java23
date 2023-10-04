/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author Instrutor
 */
public abstract class Hardware {
    
    private int potenciaWatts;
    
    public Hardware () { 
        
    }
    
    public Hardware(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }
   
    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }
        
    public abstract void inicializar();
    
    public static void inicializarHardware(Hardware componente) {
             
      componente.inicializar();
           
    }
    
    public static int calcularConsumo(Hardware cpu, Hardware ssd, Hardware vga) {
        
       int total = cpu.getPotenciaWatts() + ssd.getPotenciaWatts() + vga.getPotenciaWatts();
        
       return total;
    }
    
    public static int calcConsumo(Hardware... componente) {
        
      int total = 0;
      
        for (Hardware hardware : componente) {
            
            inicializarHardware(hardware);
            total += hardware.getPotenciaWatts();
        }
        
        return total;
        
    }
    
}
