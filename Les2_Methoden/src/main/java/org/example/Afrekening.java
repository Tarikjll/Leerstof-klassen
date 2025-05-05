package org.example;

import java.time.LocalDate;

public class Afrekening {
    public int duurOptreden;
    public LocalDate datumAfrekening;
    public double totalePrijs;

    public Afrekening(int duurOptreden) {
        this.duurOptreden = duurOptreden;
        datumAfrekening = LocalDate.now();
        totalePrijs = 0;
    }
}

