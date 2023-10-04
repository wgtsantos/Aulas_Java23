/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

import javax.swing.JOptionPane;

/**
 *
 * @author Instrutor
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, total;
        
        num1 = Integer.valueOf(JOptionPane.showInputDialog(null, 
                "Informe o primero número:", "Somar Números",
                JOptionPane.INFORMATION_MESSAGE));
        
        num2 = Integer.valueOf(JOptionPane.showInputDialog(null, 
                "Informe o segundo número: ", "Somar Números",
                JOptionPane.INFORMATION_MESSAGE));
        
        total = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + 
                total, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
