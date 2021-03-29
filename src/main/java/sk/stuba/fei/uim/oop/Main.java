package sk.stuba.fei.uim.oop;

import java.util.List;

public class Main {

    private final static String GREETING = "Ahoj svet";

    public static void main(String[] args) {
        new Okno();
    }

    protected void ahoj() {
        System.out.println(Main.GREETING);
    }


}
