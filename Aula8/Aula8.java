/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula8;

/**
 *
 * @author Instrutor
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hardware cpu = new Processador(50);
        Hardware ssd = new SSD(20);
        Hardware vga = new PlacaDeVideo(250);
        
       /* cpu.inicializar();
        ssd.inicializar();
        vga.inicializar(); */
       
        /* Hardware.inicializarHardware(cpu);
        Hardware.inicializarHardware(ssd);
        Hardware.inicializarHardware(vga); */
        
       /* int teste = Hardware.calcularConsumo(cpu, ssd, vga);
        System.out.println(teste); */
       
       int t = Hardware.calcConsumo(cpu, ssd, vga);
       
        System.out.println("O consumo total dos hardwares é: " + t + "W");
        
    }
    
}
