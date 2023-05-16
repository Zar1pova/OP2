package entities;

public class Treatment {
    private static int id;
    private static String treatment_name;
    private static int price;

    public Treatment(int id, String treatment_name) {
        this.id = id;
        this.treatment_name = treatment_name;
    }

    public static int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static String getTreatment_name() {
        return treatment_name;
    }
    public void setTreatment_name(String treatment_name) {
        this.treatment_name = treatment_name;
    }

    public static int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}