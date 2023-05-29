import entity.PracownicyEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class EmployeeDao implements IEmployeeDao {

    public void CreateEmployee(String pracImie, String pracNazwisko, int pracWiek, String pracNrTelefonu, String pracEmail) {

        Session session = HibernateUtil.getSession();
        Transaction transaction = null;
        String query = "insert into Pracownicy values(?,?,?,?,?)";

        try {

            transaction = session.beginTransaction();
            PracownicyEntity emp = new PracownicyEntity();

            emp.setPracImie(pracImie);
            emp.setPracNazwisko(pracNazwisko);
            emp.setPracWiek(pracWiek);
            emp.setPracNrTelefonu(pracNrTelefonu);
            emp.setPracEmail(pracEmail);

            session.save(emp);
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public int UpdateEmployee(PracownicyEntity emp) {
        if (emp.getPracId() <= 0)
            return 0;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "update PracownicyEntity set pracImie = :pracImie, pracNazwisko = :pracNazwisko, pracWiek =: pracWiek, pracNrTelefonu =: pracNrTelefonu, pracEmail = :pracEmail where pracId = :pracId";
        Query query = session.createQuery(hql);
        query.setParameter("Imie", emp.getPracImie());
        query.setParameter("Nazwisko", emp.getPracNazwisko());
        query.setParameter("Wiek", emp.getPracWiek());
        query.setParameter("Nr Telefonu", emp.getPracNrTelefonu());
        query.setParameter("E-mail", emp.getPracEmail());
        int rowCount = query.executeUpdate();

        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }

    public int DeleteEmployee(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "delete from PracownicyEntity where pracId = :id";
        Query query = session.createQuery(hql);
        query.setParameter("pracId", id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }

    public int ShowEmployeeById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "select * from PracownicyEntity where pracId = :id";
        Query query = session.createQuery(hql);
        query.setParameter("pracId", id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }

    public List<PracownicyEntity> ShowAllEmployee() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from PracownicyEntity ");
        List<PracownicyEntity> emp = query.list();
        session.close();
        return emp;
    }

    public void ShowEmployeeByEmail(String email) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "select * from Pracownicy where prac_email = " + "'" + email + "'";
        Query query = session.createQuery(hql);
        query.setParameter("pracEmail", email);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();

    }
}