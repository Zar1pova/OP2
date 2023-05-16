package DAO;
import entities.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface DoctorDAO {
    static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/project";
        String username = "postgres";
        String password = "12345";
    }
    int update (Doctor d);
    int delete(Doctor d);
    boolean create(Doctor d);
    }
