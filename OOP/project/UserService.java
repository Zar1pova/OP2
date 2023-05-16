import DAO.DBConnectionSingleton;
import DAO.DBPatientDAO;
import DAO.PatientDAO;
import entities.Diagnosis;
import entities.Patient;

import java.sql.*;
import java.util.List;


public class UserService extends DBPatientDAO {
    String url = "jdbc:postgresql://localhost:5432/project";
    String username = "postgres";
    String password = "12345";
    public static List<Patient> getAll() {
        return null;
    }
}
