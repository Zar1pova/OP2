import DAO.*;
import entities.Doctor;
import entities.Patient;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*PatientDAO patientDAO = new DBPatientDAO();
        Patient p = new Patient(3, "ПППП");
        DoctorDAO doctorDAO = new DBDoctorDAO();
        Doctor d = new Doctor(1, "ЛЛЛ");
        d.setDoctor_fio("ОООО");
        doctorDAO.update(d);

        p.setBirthdate("1992-01-01");
        p.setDate_of_application("2021-04-01");
        p.setClinic_id(1);
        p.setDiagnosis_id(1);
        p.setDoctor_id(1);
        p.setTreatment_id(1);
        patientDAO.update(p);*/
        UserService userService = new UserService();
        UserService.getAll();
    }
}
