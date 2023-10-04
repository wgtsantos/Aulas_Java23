/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import Classes.Calcular;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutor
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
       // Calcular calc = new Calcular(); 
        
        try {
            
       /* calc.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o primeiro número: ", "Calcular Número",
                JOptionPane.INFORMATION_MESSAGE)));
        
        calc.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null,
               "Informe o primeiro número: ", "Calcular Número",
               JOptionPane.INFORMATION_MESSAGE))); */
       
       int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o primeiro número: ", "Calcular Número",
                JOptionPane.INFORMATION_MESSAGE));
        
       int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
               "Informe o primeiro número: ", "Calcular Número",
               JOptionPane.INFORMATION_MESSAGE));
        
        Calcular calc = new Calcular(n1, n2);
        
        JOptionPane.showMessageDialog(null,
                "Resultado é: " + calc.somar(), "Resultado", 
                JOptionPane.INFORMATION_MESSAGE);

            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,
                    "Por Favor! Digite somente Números Inteiros!", "ERROOR",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
