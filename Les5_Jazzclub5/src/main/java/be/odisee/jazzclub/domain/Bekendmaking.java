package be.odisee.jazzclub.domain;

/**
 * Een Bekendmaking verwijst naar een succesvolle authenticatie van een lid.
 */
public class Bekendmaking {

    Lid lid;

    public Bekendmaking(Lid lid) {
        this.lid = lid;
    }
}
