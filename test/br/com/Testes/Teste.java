/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Testes;

import br.com.CadastroDAO.CadastroDAO;
import br.com.Model.CadastroModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernilson Daniel L S
 */
public class Teste {
    public static void main(String[] args) throws Exception {
        CadastroModel cm = new CadastroModel();
        CadastroDAO cdao = new CadastroDAO();
        
        cm.setId(13);
//        cm.setNome("Novo");
//        cm.setEnder("Recanto");
//        cm.setFone("777");
//        cm.setEmail("daniel@teste.com");
        
        cdao.remover(cm);
 //----------------------------------------//---------------------       
//       List<CadastroModel> lsficha = cdao.findAll();
//        
//        for (CadastroModel ficha : lsficha) {
//            System.out.println("achei" + ficha.getNome());
//            }
//            
// --------------------------------------//--------------------------------


        }
    
      
            
        
              
   
}
