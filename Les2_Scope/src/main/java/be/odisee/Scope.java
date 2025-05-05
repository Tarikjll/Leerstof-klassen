package be.odisee;

public class Scope
{
    // een attribuut
    private int eenInteger;

    public void someAction(char eenChar)
    {
        // een locale variabele
        long eenLong;

        if (Character.isDigit(eenChar))
        {
            // nog een locale variabelen, maar kijk in welk blok!
            float eenFloat;
            eenInteger = 10;
            eenLong = 1000;
            eenFloat = 1.5f;
            printWaarden(eenInteger, eenLong, eenFloat);
        }
        else
        {
            // eenFloat mag/moet opnieuw gedecareerd worden,
            // want we zitten in een nieuw {}-blok
            float eenFloat;
            eenInteger = 20;
            eenLong = 2000;
            eenFloat = 3.5f;
            printWaarden(eenInteger, eenLong, eenFloat);
        }
    }

    public int getEenInteger() {
        return eenInteger;
    }

    private void printWaarden(int deInt, long deLong, float deFloat) {
        System.out.printf("Waarden van de int, long en float: %d, %d, %s%n",
                                                        deInt, deLong, deFloat);
    }
}
