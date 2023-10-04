/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

import javax.swing.JOptionPane;

/**
 *
 * @author Instrutor
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, total;
        
        try {
            
            num1 = Integer.valueOf(JOptionPane.showInputDialog(null,
                "Informe o primeiro número: ", "Calcular Números",
                JOptionPane.INFORMATION_MESSAGE));
        
            num2 = Integer.valueOf(JOptionPane.showInputDialog(null,
                "Informe o segundo número: ", "Calcular Números",
                JOptionPane.INFORMATION_MESSAGE));
        
            total = num1 + num2;
            
            JOptionPane.showMessageDialog(null, "O resultado é " + total,
               "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,
                    "Por Favor, informe somente números inteiros!!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        
        
        
    }
    
}
