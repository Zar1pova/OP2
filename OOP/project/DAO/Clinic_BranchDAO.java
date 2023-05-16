package DAO;
import entities.Clinic_branch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Clinic_BranchDAO {
    int update (Clinic_BranchDAO cb);
    int delete(Clinic_BranchDAO cb) ;
    boolean create(Clinic_BranchDAO cb);
}