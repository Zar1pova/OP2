package DAO;

import entities.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDoctorDAO implements DoctorDAO {
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
    public int update (Doctor d) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Doctor\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, d.getId());
            ps.setString(2, d.getDoctor_fio());
            ps.execute();
            affectedrows = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public int delete(Doctor d) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM \"Doctor\" WHERE id = ?"

            );
            ps.setInt(1, d.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public boolean create(Doctor d) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Clinic_branch\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, d.getId());
            ps.setString(2, d.getDoctor_fio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

