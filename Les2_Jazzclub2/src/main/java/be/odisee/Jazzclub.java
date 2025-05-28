package be.odisee;

public class Jazzclub {

    // REQ0001 Correcte lidnummer-paswoordcombinaties zijn bekend
    private static int lidnummers[] = {1, 2, 3};
    private static String paswoorden[] = {"FrankPW", "AnissaPW", "HansPW"};

    // REQ0007 Het aantal foute bekendmakingspogingen moet bijgehouden worden
    private static int aantalFouteBekendmakingspogingen[] = {0, 0, 0};

    // REQ0008 Het is bekend hoeveel foute pogingen er waren om voor het lidnummer het juiste paswoord te geven
    private static final int MAX_AANTAL_FOUTEN = 2;
    // REQ0005 Het is bekend welk lid zich succesvol bekend gemaakt heeft
    private static int bekendgemaaktLidnummer = 0;

    /**
     * REQ0002 Het lid kan zich met lidnummer en paswoord bekend maken
     *
     * REQ0003 Indien er voordien voor dit lidnummer teveel foute pogingen gebeurden, onstaat een foutconditie
     * REQ0004 Bij succesvolle bekendmaking wordt het aantal foute pogingen voor dat lid terug op nul gezet
     * REQ0005 Het is bekend welk lid zich succesvol bekend gemaakt heeft
     * REQ0006 Bij niet succesvolle bekendmaking, wordt het aantal pogingen voor dat lidnummer verhoogd als het bestaat
     * REQ0007 Het aantal foute bekendmakingspogingen moet bijgehouden worden
     * REQ0009 Er kan vastgesteld worden of het aantal foute pogingen voor het lidnummer groter of gelijk aan het max is
     * REQ0010 Het proces kent een abnormaal einde als er teveel foute pogingen waren
     * REQ0011 Het lid kan zich opnieuw bekend maken als er nog niet teveel foute pogingen waren
     *
     * @param lidnummer van het lid
     * @param paswoord  waarmee het lidnummer zich bekend maken
     * @return true als de bekendmaking succesvol is, anders false
     */
    public static boolean bekendMaken(int lidnummer, String paswoord) {

        for (int i = 0; i < lidnummers.length; i++) {
            if (lidnummers[i] == lidnummer) {
                // REQ0009
                if (aantalFouteBekendmakingspogingen[i] >= MAX_AANTAL_FOUTEN) {
                    // REQ0003 en REQ0010
                    return false;
                } else {
                    // REQ0011
                    if (paswoorden[i].equals(paswoord)) {
                        // REQ0004
                        aantalFouteBekendmakingspogingen[i] = 0;
                        // REQ0005
                        bekendgemaaktLidnummer = lidnummer;
                        return true;
                    } else {
                        // REQ0006 en REQ0007
                        aantalFouteBekendmakingspogingen[i]++;
                        return false;
                    }
                }
            }
        }
        // We vonden het voorgestelde lidnummer niet
        return false;
    }

    private static final String MESSAGE_FORMAT = "lidnr %d en paswoord %s geeft %s%n";

    private static void printAuthenticationResult(int memberId, String password) {
        boolean isAuthenticated = bekendMaken(memberId, password);
        System.out.printf(MESSAGE_FORMAT, memberId, password,
                isAuthenticated ? "true" : "false");
    }

    public static void main(String[] args) {

        // Member 1 bekendmakingstest
        printAuthenticationResult(1, "FrankPW");
        System.out.println("-----");

        // Member 2 bekendmakingstesten
        printAuthenticationResult(2, "FrankPW");
        printAuthenticationResult(2, "AnissaPW");
        System.out.println("-----");

        // Member 3 bekendmakingstesten
        printAuthenticationResult(3, "FrankPW");
        printAuthenticationResult(3, "AnissaPW");
        printAuthenticationResult(3, "AnissaPWNogEens");
        printAuthenticationResult(3, "HansPW");
        printAuthenticationResult(3, "HansPW");
        System.out.println("-----");

        // Member 2 bekendmakingstesten - extra
        printAuthenticationResult(2, "FrankPW");
        printAuthenticationResult(2, "HansPW");
        printAuthenticationResult(2, "AnissaPW");
        System.out.println("-----");
    }

}
