package entities;

public class Diagnosis {
    private static int id;
    private static String diagnosis;

    public Diagnosis(int id, String diagnosis){
        this.id = id;
        this.diagnosis = diagnosis;
    }

    public static int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
