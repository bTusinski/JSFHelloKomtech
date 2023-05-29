import entity.PracownicyEntity;
import org.hibernate.cfg.Configuration;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int id;

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        IEmployeeDao dao = new EmployeeDao();
        EmployeeDao emp = new EmployeeDao();
        PracownicyEntity employee =new PracownicyEntity();

        emp.CreateEmployee("imie", "nazwisko", 21, "tel", "mail@mail.com");

//        emp.UpdateEmployee();
//
//        emp.ShowAllEmployee();
//
//        emp.ShowEmployeeById();
//
//        emp.ShowEmployeeByEmail();

        //emp.DeleteEmployee();




    }
}
