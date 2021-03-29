package sk.stuba.fei.uim.oop;

import java.util.List;

public class Main {

    private final static String GREETING = "Ahoj svet";

    public static void main(String[] args) {
        Clovek c = new Clovek();
        c.setAdresa("adresa");
        c.setMeno("meno");
        c.setVaha(80.0);
        c.setVyska(180.0);
        c.setVek(20);
        c.setKamarati(List.of(new Clovek()));

        System.out.println(c.toString());
    }

    protected void ahoj() {
        System.out.println(Main.GREETING);
    }


}
