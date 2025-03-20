package Greenest;

public abstract class Växt {

    protected String namn;
    protected String vätska;

    public Växt(String namn, String vätska) {
        this.namn = namn;
        this.vätska = vätska;
    }

    public abstract String matInfo();

    public String getNamn() {
        return namn;
    }


}
