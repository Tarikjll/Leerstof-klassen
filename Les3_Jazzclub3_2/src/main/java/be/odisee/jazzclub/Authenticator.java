package be.odisee.jazzclub;

import java.util.List;

/**
 * De Authenticator verifieert de authenticiteit van een lid. <br/>
 *  <br/>
 * REQ0003 Indien er voordien voor dit lidnummer teveel foute pogingen gebeurden, onstaat een foutconditie <br/>
 * REQ0004 Bij succesvolle bekendmaking wordt het aantal foute pogingen voor dat lid terug op nul gezet  <br/>
 * REQ0005 Het is bekend welk lid zich succesvol bekend gemaakt heeft  <br/>
 * REQ0006 Bij niet succesvolle bekendmaking, wordt het aantal pogingen voor dat lidnummer verhoogd als het bestaat  <br/>
 * REQ0009 Er kan vastgesteld worden of het aantal foute pogingen voor het lidnummer groter of gelijk aan het max is  <br/>
 * REQ0010 Het proces kent een abnormaal einde als er teveel foute pogingen waren  <br/>
 * REQ0011 Het lid kan zich opnieuw bekend maken als er nog niet teveel foute pogingen waren  <br/>
 *
 */
public class Authenticator {

    // REQ0008 Het is bekend hoeveel foute pogingen er maximaal zijn toegestaan
    private static final int MAX_AANTAL_FOUT = 3;

    private Lid laatsteGeauthenticeerdeLid = null;

    /**
     * Authenticeert de poging van een lid.
     *
     * Zorgt voor REQ003, REQ004, REQ005, REQ006, REQ009, REQ010, REQ011
     *
     * @param poging, het lidnummer en het wachtwoord van de poging
     * @param ledenLijst, een verwijzing naar de lijst met leden = geldige lidnummer-paswoordcombinaties
     *
     * @return true als de poging is geaccepteerd, false anders
     */
    public boolean authenticeer(Poging poging, List<Lid> ledenLijst) {
        //TODO juiste code later in te vullen
        return false;
    }

    /**
     * Geeft laatste lid dat is geauthenticeerd.
     *
     * Zorgt voor REQ005
     *
     * @return het laatste lid dat is geauthenticeerd.
     */
    public Lid getLaatsteGeauthenticeerdeLid() {
        //TODO juiste code later in te vullen
        return laatsteGeauthenticeerdeLid;
    }

}
