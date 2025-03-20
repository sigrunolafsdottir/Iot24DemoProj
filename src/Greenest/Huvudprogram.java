package Greenest;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Huvudprogram {

    public Huvudprogram(){

        Kaktus igge = new Kaktus("Igge");
        Palm laura = new Palm("Laura", 5);
        Palm olof = new Palm("Olof", 1);
        KöttätandeVäxt meatLoaf = new KöttätandeVäxt("Meatloaf", 0.7);

        List<Växt> gäster = new LinkedList<>();
        gäster.add(laura);
        gäster.add(igge);
        gäster.add(olof);
        gäster.add(meatLoaf);

        String namn = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        for (int i = 0; i < gäster.size(); i++) {
            if (namn.equalsIgnoreCase(gäster.get(i).getNamn())){
                System.out.println(gäster.get(i).matInfo());
            }
        }


    }



    public static void main(String[] args) {
        Huvudprogram hp = new Huvudprogram();
    }
}
