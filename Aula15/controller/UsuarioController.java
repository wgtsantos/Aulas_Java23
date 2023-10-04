/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import view.Tela_Gerenciar;

/**
 *
 * @author Instrutor
 */
public class UsuarioController {
    
    ArrayList<Usuario> user = new ArrayList<>();
    
    public ArrayList Users() {
        
        user.add(new Usuario("Maria Silva", "Maria", "123456"));
        user.add(new Usuario("Hudson Carlos", "Hudson", "abc123"));
        user.add(new Usuario("Rafael Moreira", "Rafael", "789456"));
        user.add(new Usuario("Leticia Souza", "Leticia", "user456"));
        
        return user;
        
    }
    
    public void ListarUsers(Tela_Gerenciar tg) {
                
        DefaultTableModel model = (DefaultTableModel) tg.jTable1.getModel();
        
        this.Users();
        
        Object rowData[] = new Object[4];
        
        for(Usuario usuario : user ) {
            
            rowData[0] = 1;
            rowData[1] = usuario.getNome();
            rowData[2] = usuario.getLogin();
            rowData[3] = usuario.getSenha();
            
            model.addRow(rowData);
        }
        
    }
    
    public void AdicionarUser(String nome, String login, String senha){

        user.add(new Usuario(nome, login, senha));
        
    }
    
    public boolean Login(String login, String senha) {
        
        boolean check = false;
        
        for (Usuario usuario : user) {
            
            if (usuario.getLogin().equals(login) && 
                usuario.getSenha().equals(senha)) {
                
                check = true;
                
            }
            
        }
        
        return check;
    }
    
}
