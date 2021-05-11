package de.bs1ts.steffen;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Konto konto = new Konto();
        konto.einzahlen(new BigDecimal(100));
        konto.abheben(new BigDecimal("52.99"));
        System.out.println(konto);
    }
}
