package be.odisee.jazzclub;

import java.util.List;

/**
 * Organisatie met leden die voor concerten kunnen reserveren.
 *
 * De Jazzclub kan de authenticator vragen om na te gaan of een poging tot bekendmaking lukt.
 */
public class Jazzclub {

    private List<Lid> ledenLijst;

    private Authenticator authenticator;

     // REQ0005 Het is bekend welk lid zich succesvol bekend gemaakt heeft
    private Bekendmaking bekendmaking;

    /**
     * Constructor - zorgt voor een ledenlijst en een authenticator
     *
     * REQ0001 Correcte lidnummer-paswoordcombinaties zijn bekend
     *
     */
    public Jazzclub() {
    }
}
