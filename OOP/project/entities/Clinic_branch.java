package entities;

public class Clinic_branch {
    private static int id;
    private static String clinic;

    public Clinic_branch(int id, String clinic) {
        this.id = id;
        this.clinic = clinic;
    }

    public static int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static String getClinic() {
        return clinic;
    }
    public void setClinic(String clinic) {
        this.clinic = clinic;
    }
}
