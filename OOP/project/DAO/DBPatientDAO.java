package DAO;

import entities.Patient;

import java.sql.*;

public class DBPatientDAO implements PatientDAO {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/project";
        String username = "postgres";
        String password = "12345";
    }

    @Override
    public boolean getByUsername(String fio) {
        return false;
    }

    public int update (Patient p) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"patient\" SET fio = ?," + "birthdate = ?," + "date_of_application = ?," + "diagnosis_id = ?," + "treatment_id = ?," + "doctor_id = ?," + "clinic_id = ?" + "WHERE id = ?"
            );
                    ps.setInt(8, p.getId());
                    ps.setString(1, p.getFio());
                    ps.setString(2, p.getBirthdate());
                    ps.setString(3, p.getDate_of_application());
                    ps.setInt(4, p.getDiagnosis_id());
                    ps.setInt(5, p.getTreatment_id());
                    ps.setInt(6, p.getDoctor_id());
                    ps.setInt(7, p.getClinic_id());
                    ps.execute();
            affectedrows = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public int delete(int id) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM \"patient\" WHERE id = ?"

            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public boolean create(Patient p) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO \"users\" (username, pwd, fio, birthdate) VALUES (?, ?, ?, ?)");
            ps.setInt(1, p.getId());
            ps.setString(2, p.getFio());
            ps.setString(3, p.getBirthdate());
            ps.setString(4, p.getDate_of_application());
            ps.setInt(5, p.getDiagnosis_id());
            ps.setInt(6, p.getTreatment_id());
            ps.setInt(7, p.getDoctor_id());
            ps.setInt(8, p.getClinic_id());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}