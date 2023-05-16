package entities;

public class Patient extends Doctor{
    private String fio;
    private int diagnosis_id;
    private int treatment_id;
    private int clinic_id;
    private int id;
    public enum gender {m, f;}
    private String birthdate;
    private String date_of_application;
    private int doctor_id;

    public Patient(int id, String fio) {
        super();
        this.id = id;
        this.fio = fio;
        this.birthdate = birthdate;
        this.date_of_application = date_of_application;
        this.diagnosis_id = diagnosis_id;
        this.treatment_id = treatment_id;
        this.doctor_id = doctor_id;
        this.clinic_id = clinic_id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDate_of_application() {
        return date_of_application;
    }
    public void setDate_of_application(String date_of_application) {
        this.date_of_application = date_of_application;
    }

    public int getDiagnosis_id() {
        return diagnosis_id;
    }
    public void setDiagnosis_id(int diagnosis_id) {
        this.diagnosis_id = diagnosis_id;
    }

    public int getTreatment_id() {
        return treatment_id;
    }
    public void setTreatment_id(int treatment_id) {
        this.treatment_id = treatment_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getClinic_id() {
        return clinic_id;
    }
    public void setClinic_id(int clinic_id) {
        this.clinic_id = clinic_id;
    }
}
