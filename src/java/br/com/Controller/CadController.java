/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;

import br.com.CadastroDAO.CadastroDAO;
import br.com.Model.CadastroModel;
import br.com.Utils.HibernateUtil;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author eupen
 */
@RestController
public class CadController {

    private SessionFactory connection = new HibernateUtil().getConnection();
    private Session session;
    ModelAndView mav = new ModelAndView();
    int idd;

    public CadController() {
        session = connection.openSession();
    }

    @RequestMapping("index.htm")
    public ModelAndView home() {
        return new ModelAndView("redirect:/add.htm");
    }

    // Metodo para chamar a nova pagina de cadastro
    @RequestMapping(value = "add.htm", method = RequestMethod.GET)
    public ModelAndView NovoCadastro() {
        mav.addObject(new CadastroModel());
        mav.setViewName("add");
        return mav;
    }

    // Metodo para adicionar dados na tabela cadastro
    @RequestMapping(value = "add.htm", method = RequestMethod.POST)
    public ModelAndView Cadastro(CadastroModel cm) {
        CadastroDAO cdao = new CadastroDAO();
        cdao.salvar(cm);
        return new ModelAndView("redirect:/Lista.htm");
    }

    //Metodo para Listar dados do banco
    @RequestMapping("Lista.htm")
    public String Listar(Model m, CadastroModel cm) {
        CadastroDAO cdao = new CadastroDAO();
        try {
            m.addAttribute("lista", cdao.findAll());
        } catch (Exception e) {
        }
        return "Lista";
    }
    //Metodo para carregar os registros com os dados da tabela para edição
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Carrega_Editacao(HttpServletRequest rq) {
        idd = Integer.parseInt(rq.getParameter("id"));
     Object  lista =  session.createCriteria(CadastroModel.class)
                .add(Restrictions.idEq(idd)).uniqueResult();
        mav.addObject("lista", lista);
        mav.setViewName("editar");
        return mav;
    }
    
    // Metodo para fazer o update dos registros da tabela cadastro
    @RequestMapping(value = "editar.htm", method =RequestMethod.POST)
    public ModelAndView Editar(Model m, CadastroModel cm){
        CadastroDAO cdao = new CadastroDAO();
        boolean idd = Boolean.getBoolean("id");
        try {           
            idd = cdao.alterar(cm);           
//            m.addAttribute("editar", cdao.alterar(cm));
        } catch (Exception e) {
            e.printStackTrace();
        }
      return new ModelAndView("redirect:/Lista.htm");      
    }
    
    //Metodo para apagar registros da tabela cadastro
    @RequestMapping("apagar.htm")
    public ModelAndView apagar(HttpServletRequest request, CadastroModel cm) {  
        CadastroDAO cdao = new CadastroDAO();
        cdao.remover(cm);
        return new ModelAndView("redirect:/Lista.htm");
        
    }
    
}
