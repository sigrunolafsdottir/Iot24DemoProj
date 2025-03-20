package Greenest;

public class Palm extends Växt {

    private double längd;

    public Palm(String namn, double längd) {
        super(namn, "Kranvatten");
        this.längd = längd;
    }

    @Override
    public String matInfo(){
        return "Palmen "+namn + " "+ 0.5*längd +" "+ vätska;
    }

    @Override
    public String toString() {
        return "Palm{" +
                "längd=" + längd +
                ", namn='" + namn + '\'' +
                ", vätska='" + vätska + '\'' +
                '}';
    }
}
