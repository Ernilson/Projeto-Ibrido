/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Utils;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author eupen
 */
public class HibernateUtil {

 
    //public SessionFactory connection = getConnection();
   public  SessionFactory connection = getConnection();
    //  private static final SessionFactory sessionFactory;
    public SessionFactory getConnection() {
        Configuration conf = new Configuration().configure();
        StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
        SessionFactory session = conf.buildSessionFactory(build.build());
        return session;
    }
    public Session openSession() {
        return connection.openSession();
    }
    public void closeSession() {
        connection.close();
    }

}
