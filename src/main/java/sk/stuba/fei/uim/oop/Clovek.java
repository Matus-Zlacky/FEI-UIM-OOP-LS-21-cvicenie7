package sk.stuba.fei.uim.oop;

import lombok.Data;

import java.util.List;

@Data
public class Clovek {
    private String meno;
    private String adresa;
    private double vyska;
    private double vaha;
    private int vek;
    private List<Clovek> kamarati;
}
