package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    private int aantalOptredens = 4;

    public static void main(String[] args) {
        // Sequentie - Voorbeeld
        // 1. Variabelen toewijzen
        String bandNaam = "The Blue Notes";
        String contactEmail = "bluenotes@jazz.be";

        // 2. Gegevens tonen
        System.out.println("Bandnaam: " + bandNaam);
        System.out.println("Contact: " + contactEmail);


        // Array van een primitief type - voorbeeld
        int[] duurOptredens1 = new int[5];
        duurOptredens1[0] = 30;
        duurOptredens1[1] = 30;
        duurOptredens1[2] = 60;
        duurOptredens1[3] = 80;
        duurOptredens1[4] = 90;

        System.out.printf("duurOptredens1[2]: %d%n", duurOptredens1[2]);

        int[] duurOptredens2 = {30, 30, 60, 80, 90};
        System.out.printf("duurOptredens2[3]: %d%n", duurOptredens2[3]);


        // Array van objecten - voorbeeld
        Optreden[] optredens = new Optreden[5];
        optredens[0] = new Optreden(30);
        optredens[1] = new Optreden(45);


        // Vergelijken van arrays en meerdimensionale arrays - voorbeeld
        System.out.printf("duurOptredens1 == duurOptredens2 geeft %b%n", duurOptredens1 == duurOptredens2);
        System.out.printf("duurOptredens1.equals(duurOptredens2) geeft %b%n", duurOptredens1.equals(duurOptredens2));
        System.out.printf("Arrays.equals(duurOptredens1, duurOptredens2) geeft %b%n", Arrays.equals(duurOptredens1, duurOptredens2));

        // duurOptredens11 en duurOptredens12 zijn tweedimensionale arrays
        int[][] duurOptredens11 = {
                {30, 5}, {30, 2}, {60, 4}, {80, 3}, {90, 2}
        };
        int[][] duurOptredens12 = {
                {30, 5}, {30, 2}, {60, 4}, {80, 3}, {90, 2}
        };

        System.out.printf("duurOptredensDag1 == duurOptredensDag2 geeft %b%n", duurOptredens11 == duurOptredens12);
        System.out.printf("duurOptredensDag1.equals(duurOptredensDag2) geeft %b%n", duurOptredens11.equals(duurOptredens12));
        System.out.printf("Arrays.equals(duurOptredensDag1, duurOptredensDag2) geeft %b%n", Arrays.equals(duurOptredens11, duurOptredens12));
        System.out.printf("Arrays.deepEquals(duurOptredensDag1, duurOptredensDag2) geeft %b%n", Arrays.deepEquals(duurOptredens11, duurOptredens12));


        // ArrayList - voorbeeld
        // verschillende types objecten kunnen samen in een ArrayList
        ArrayList randoms = new ArrayList();
        randoms.add(1);
        randoms.add("Tekst");
        randoms.add(new Date());

        // ArrayList met enkel integers
        ArrayList<Integer> optredensAL = new ArrayList<Integer>();

        optredensAL.add(30);
        optredensAL.add(30);
        optredensAL.add(60);
        optredensAL.add(80);
        optredensAL.add(90);
        System.out.println("De arraylist optredensAL ziet er zo uit: " + optredensAL);
        System.out.printf("Het vierde element is %d%n", optredensAL.get(3));


        // Herhaling - slecht voorbeeld
        // houdt het aantal verkochte tickets bij
        int aantalVerkochteTickets = 0;

        // we willen het aantal verkochte tickets 10x verhogen
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;
        aantalVerkochteTickets++;

        System.out.printf("Het huidig aantal verkochte tickets is: %d%n", aantalVerkochteTickets);


        // Herhaling - while-do voorbeeld
        // declaratie en initialisatie van hulpteller
        int i = 0;

        // we willen het aantal verkochte tickets 10x verhogen
        while (i < 10) {
            aantalVerkochteTickets++;
            i++;
        }


        // Herhaling - do-while voorbeeld
        // declaratie en initialisatie hulpvariabele
        int j = 0;

        // we willen het aantal pogingen 10x verhogen
        do {
            aantalVerkochteTickets++;
            j++;
        }
        while(j<10);


        // Herhaling - for-loop voorbeeld
        /* we willen het aantal verkochte tickets 10x verhogen
        int i = 0 is de declaratie en initialisatie van de lusteller
        i < 10 is wat elke iteratie gecontroleerd wordt
        i++ is de aanpassing voor de controle in de volgende iteratie
         */
        for(int k = 0; k < 10; k++){
            aantalVerkochteTickets++;
        }


        // Herhaling - foreach-loop voorbeeld
        ArrayList<Integer> optredens1 = new ArrayList<Integer>();

        optredens1.add(30);
        optredens1.add(45);
        optredens1.add(60);
        optredens1.add(80);
        optredens1.add(90);

        for(int optreden: optredens1) {
            System.out.printf("het volgende element is %d%n", optreden);
        }

        int[] optredens2 = {35, 40, 65, 85, 95};
        for(int optreden: optredens2) {
            System.out.printf("het volgende element is %d%n", optreden);
        }
    }

    /**
     * Toont dat de band een VIP-status heeft als ze minstens 5 keer hebben opgetreden.
     */
    public void checkVipToegangIf() {
        if (aantalOptredens >= 5) {
            System.out.println("VIP-toegang verleend aan de band.");
        }
    }

    /**
     * Toont of dat de band een VIP-status heeft op basis van het aantal optredens.
     */
    public void checkVipToegangIfElse() {
        if (aantalOptredens >= 5) {
            System.out.println("VIP-toegang verleend aan de band.");
        } else {
            System.out.println("Nog geen toegang tot de VIP-lounge.");
        }
    }

    /**
     * Berekent de totale vergoeding voor een optreden op basis van de duur,
     * met behulp van een if-else structuur.
     *
     * Er worden bonussen toegepast afhankelijk van de duur:
     * - 30 minuten: geen bonus
     * - 60 minuten: 10% bonus
     * - Andere duur: 20% bonus
     */
    public void berekenVergoedingIfElse() {
        int duurOptreden = 50;
        double vergoedingPerMinuut = 2.5;
        double totaleVergoeding = 0.0;

        if (duurOptreden == 30) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut;
        } else if (duurOptreden == 60) {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.1;
        } else {
            totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.2;
        }

        System.out.println("Totale vergoeding voor het optreden: €" + totaleVergoeding);
    }

    /**
     * Berekent de totale vergoeding voor een optreden op basis van de duur,
     * met behulp van een switch-structuur.
     *
     * Er worden bonussen toegepast afhankelijk van de duur:
     * - 30 minuten: geen bonus
     * - 60 minuten: 10% bonus
     * - Andere duur: 20% bonus
     */
    public void berekenVergoedingSwitch() {
        int duurOptreden = 50;
        double vergoedingPerMinuut = 2.5;
        double totaleVergoeding = 0.0;

        switch (duurOptreden) {
            case 30:
                totaleVergoeding = duurOptreden * vergoedingPerMinuut;
                break;
            case 60:
                totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.1;
                break;
            default:
                totaleVergoeding = duurOptreden * vergoedingPerMinuut * 1.2;
                break;
        }

        System.out.println("Totale vergoeding voor het optreden: €" + totaleVergoeding);
    }

    /**
     * Toont of dat de band een VIP-status heeft op basis van het aantal optredens.
     */
    public String checkVipToegangZonderTernaireOperator() {
        if (aantalOptredens >= 5) {
            return "VIP-toegang verleend aan de band.";
        } else {
            return "Nog geen toegang tot de VIP-lounge.";
        }
    }

    /**
     * Toont of dat de band een VIP-status heeft op basis van het aantal optredens.
     */
    public String checkVipToegangMetTernaireOperator() {
        return aantalOptredens >= 5 ? "VIP-toegang verleend aan de band." : "Nog geen toegang tot de VIP-lounge.";
    }


}