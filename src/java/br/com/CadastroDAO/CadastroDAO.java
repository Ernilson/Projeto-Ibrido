/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CadastroDAO;

import br.com.Model.CadastroModel;
import br.com.Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author eupen
 */
public class CadastroDAO {
     private SessionFactory connection = new HibernateUtil().getConnection();
    private Session session;

    public CadastroDAO() {
        session = connection.openSession();
    }
    
     public boolean salvar(CadastroModel cad) {
        try {
            Transaction tx = session.beginTransaction();
            session.save(cad);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
             closeConnections();
        }
    }

    public boolean alterar(CadastroModel dto) {

        try {
            Transaction tx = session.beginTransaction();
            session.update(dto);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            closeConnections();
        }
    }
    public void alter(CadastroModel dto){
        try {
            Transaction tx = session.beginTransaction();
            session.update(dto);
            tx.commit();
        } catch (Exception e) {
             closeConnections();
        }
    }

    public boolean remover(CadastroModel dto) {
        try {
            Transaction tx = session.beginTransaction();
            session.delete(dto);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            closeConnections();
        }
    }   
    
    public List findAll() {
        
		try {			
			return session.createCriteria(CadastroModel.class).list();
		} finally {
			//Fechamos a sessão
			closeConnections();
		}
	}    
    public void closeConnections() {
        session.close();
        connection.close();
    }

    public void excluir(int idd) {
       try {
            Transaction tx = session.beginTransaction();
            session.delete(idd);
            tx.commit();
           
        } catch (Exception e) {
            
        } finally {
            closeConnections();
        }
    }
}
