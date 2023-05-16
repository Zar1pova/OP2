package DAO;

import entities.Treatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface TreatmentDAO {
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
    int update (int id, String treatment_name);
    int delete(int id);
    boolean create(int id, String doctor_fio);
}