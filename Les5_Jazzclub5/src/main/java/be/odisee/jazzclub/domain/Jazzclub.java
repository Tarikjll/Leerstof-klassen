package be.odisee.jazzclub.domain;

import java.util.ArrayList;
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
    private Bekendmaking bekendmaking = null;

    /**
     * Constructor - zorgt voor een ledenlijst en een authenticator
     *
     * REQ0001 Correcte lidnummer-paswoordcombinaties zijn bekend
     *
     */
    public Jazzclub() {
        ledenLijst = new ArrayList<Lid>();
        ledenLijst.add(new Lid(1,"FrankPW"));
        ledenLijst.add(new Lid(2,"AnissaPW"));
        ledenLijst.add(new Lid(3,"HansPW"));

        authenticator = new Authenticator();
    }

    public List<Lid> getLedenLijst() {
        return ledenLijst;
    }

    /**
     * Zoek het lid op via zijn lidnummer
     * @param lidnummer dat opgezocht moet worden
     * @return het gezochte Lid-object of null indien niet gevonden
     */
    public Lid getLidById(int lidnummer) {
        for (Lid lid : ledenLijst) {
            if (lid.getLidnummer() == lidnummer) {
                return lid;
            }
        }
        return null;
    }

    public Authenticator getAuthenticator() {
        return authenticator;
    }

    public boolean authenticeer(int lidnummer, String paswoord) {
        boolean resultLogin = authenticator.authenticeer(new Poging(lidnummer, paswoord), ledenLijst);
        if (resultLogin) {
            this.bekendmaking = new Bekendmaking(authenticator.getLaatsteGeauthenticeerdeLid());
        }
        return resultLogin;
    }
}
