package entities;

public class Doctor {
    private int id;
    private String doctor_fio;

    public Doctor(int id, String doctor_fio){
        this.id = id;
        this.doctor_fio = doctor_fio;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDoctor_fio(String doctor_fio) {
        this.doctor_fio = doctor_fio;
    }
    public String getDoctor_fio() {
        return doctor_fio;
    }
}
