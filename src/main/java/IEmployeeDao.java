import entity.PracownicyEntity;

import java.util.List;

public interface IEmployeeDao {
    public void CreateEmployee(String pracImie, String pracNazwisko, int pracWiek, String pracNrTelefonu, String pracEmail);

    public int UpdateEmployee(PracownicyEntity emp);

    public int DeleteEmployee(int id);

    public List<PracownicyEntity> ShowAllEmployee();

    public int ShowEmployeeById(int id);

    public void ShowEmployeeByEmail(String email);
}
