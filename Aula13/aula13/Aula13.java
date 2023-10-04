/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

import Classes.Calcular;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author Instrutor
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       UIManager.put("OptionPane.minimumSize", new Dimension(500, 200));
              
       try {
       
       UIManager.put("OptionPane.messageFont",
               new FontUIResource(new Font("Consolas", Font.BOLD, 22)));
               
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
