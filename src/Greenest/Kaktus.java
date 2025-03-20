package Greenest;

public class Kaktus extends Växt {

    public Kaktus(String namn) {
        super(namn, "Mineralvatten");
    }

    @Override
    public String matInfo(){
        return "Kaktusen "+namn + " ska ha 2 cl "+ vätska;
    }

    @Override
    public String toString() {
        return "Kaktus{" +
                "namn='" + namn + '\'' +
                ", vätska='" + vätska + '\'' +
                '}';
    }
}
