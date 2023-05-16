package DAO;
import entities.Diagnosis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Diagnosic_id {
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
    static int update (int id, String diagnosis) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Diagnosis\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, Diagnosis.getId());
            ps.setString(2, Diagnosis.getDiagnosis());
            ps.execute();
            affectedrows = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    static int delete(int id) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM \"Diagnosis\" WHERE id = ?"

            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    static boolean create(int id, String clinic) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Clinic_branch\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, Diagnosis.getId());
            ps.setString(2, Diagnosis.getDiagnosis());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}