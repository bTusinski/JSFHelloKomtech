import entity.PracownicyEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;


public class HibernateUtil {

    private static HibernateUtil instance=new HibernateUtil();
    private SessionFactory sessionFactory;

    public static HibernateUtil getInstance(){
        return instance;
    }

    private HibernateUtil(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();

        return session;
    }
}