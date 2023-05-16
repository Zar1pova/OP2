package DAO;
import entities.Patient;
import java.sql.*;

public interface PatientDAO {
    boolean getByUsername(String fio);
    int update (Patient p);
    int delete(int id);
    boolean create(Patient p);
}