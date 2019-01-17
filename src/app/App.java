/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashSet;
import java.util.Set;
import model.CorreoElectronico;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sandra
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // CREAMOS UN OBJETO
        Profesor profesor = new Profesor(7, "Sara", "Barrera", "Salas");
        Set<CorreoElectronico> correosElectronicos = new HashSet<>();
        correosElectronicos.add(new CorreoElectronico(3, "sara@yahoo.com", profesor));
        correosElectronicos.add(new CorreoElectronico(2, "sara@hotmail.com", profesor));
        correosElectronicos.add(new CorreoElectronico(1, "sara@gmail.com", profesor));

        profesor.setCorreosElectronicos(correosElectronicos);
        
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(profesor);

        //Profesor profesor2 = (Profesor) session.get(Profesor.class, 1);
       // System.out.println(profesor2);

        //profesor.setNombre("Manola");
        //session.update(profesor);
        //session.saveOrUpdate(profesor);
        
        
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();

    }

}
