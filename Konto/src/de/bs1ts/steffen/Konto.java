package de.bs1ts.steffen;

import java.math.BigDecimal;

public class Konto {
    private BigDecimal kontostand = new BigDecimal(0);

    public BigDecimal einzahlen(BigDecimal betrag){
        return kontostand = kontostand.add(betrag);
    }

    public BigDecimal abheben(BigDecimal betrag){
        return kontostand = kontostand.subtract(betrag);
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontostand=" + kontostand +
                '}';
    }
}
