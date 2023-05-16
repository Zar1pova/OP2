package DAO;
import entities.Clinic_branch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBClinic_BranchDAO {
    public void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/project";
        String username = "postgres";
        String password = "12345";
    }
    public int update (Clinic_BranchDAO cb) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Clinic_branch\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, Clinic_branch.getId());
            ps.setString(2, Clinic_branch.getClinic());
            ps.execute();
            affectedrows = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public int delete(Clinic_BranchDAO cb) {
        Connection conn = DBConnectionSingleton.getConn();
        int affectedrows = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM \"Clinic_branch\" WHERE id = ?"

            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedrows;
    }
    public boolean create(Clinic_BranchDAO cb) {
        Connection conn = DBConnectionSingleton.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE \"Clinic_branch\" SET clinic = ?" + "WHERE id = ?"
            );
            ps.setInt(1, Clinic_branch.getId());
            ps.setString(2, Clinic_branch.getClinic());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
