package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Oproepen van methode met actuele parameters - voorbeeld
        double total = berekenVergoeding(30, 4);

        // Parameterbinding bij primitieve typen - voorbeeld 1 zonder return
        double totalevergoeding = 0;
        System.out.printf("Totale prijs voor oproeping methode %.2f%n", totalevergoeding);
        berekenVergoedingPrimitiveSlecht(30, 4, totalevergoeding);
        System.out.printf("Totale prijs na oproeping methode %.2f%n", totalevergoeding);

        // Parameterbinding bij primitieve typen - voorbeeld 1 met return
        totalevergoeding = 0;
        System.out.printf("Totale prijs voor oproeping methode %.2f%n", totalevergoeding);
        totalevergoeding = berekenVergoeding(30, 4);
        System.out.printf("Totale prijs na oproeping methode %.2f%n", totalevergoeding);

        // Parameterbinding bij referentietypen - voorbeeld
        Afrekening afrekening = new Afrekening(30);
        System.out.printf("Totale prijs voor oproeping methode %.2f%n", afrekening.totalePrijs);
        berekenPrijs(afrekening, 4);
        System.out.printf("Totale prijs na oproeping methode %.2f%n", afrekening.totalePrijs);

        String invoer = "42";
        int getal = Integer.parseInt(invoer);

        String datumString = "2025-05-03";
        LocalDate datum = LocalDate.parse(datumString);
    }

    public double berekenVergoeding(int duurOptreden) {
        double vergoedingPerMinuut = 2.5;

        if (duurOptreden <= 30) {
            return duurOptreden * vergoedingPerMinuut;
        } else if (duurOptreden == 60) {
            return duurOptreden * vergoedingPerMinuut * 1.1;
        } else {
            return duurOptreden * vergoedingPerMinuut * 1.2;
        }
    }

    public static double berekenVergoeding(int duurOptreden, double vergoedingPerMinuut) {
        if (duurOptreden <= 30) {
            return duurOptreden * vergoedingPerMinuut;
        } else if (duurOptreden == 60) {
            return duurOptreden * vergoedingPerMinuut * 1.1;
        } else {
            return duurOptreden * vergoedingPerMinuut * 1.2;
        }
    }

    public double berekenVergoeding1ReturnStatement(int duurOptreden, double vergoedingPerMinuut) {
        double totaleVergoeding = 0;
        if (duurOptreden <= 30) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut;
        } else if (duurOptreden == 60) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.1;
        } else {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.2;
        }
        return totaleVergoeding;
    }

    public static void berekenVergoedingPrimitiveSlecht(int duurOptreden, double vergoedingPerMinuut, double totaleVergoeding) {
        if (duurOptreden <= 30) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut;
        } else if (duurOptreden == 60) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.1;
        } else {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.2;
        }
    }

    public static void berekenPrijs(Afrekening afrekening, double prijsPerMinuut) {
        if (afrekening.duurOptreden <= 30) {
            afrekening.totalePrijs =  afrekening.duurOptreden * prijsPerMinuut;
        } else if (afrekening.duurOptreden <= 60) {
            afrekening.totalePrijs = afrekening.duurOptreden * prijsPerMinuut * 0.9;
        } else {
            afrekening.totalePrijs = afrekening.duurOptreden * prijsPerMinuut * 0.8;
        }
    }
}

