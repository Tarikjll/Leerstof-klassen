package be.odisee;

public class ScopeRunner {

    public static void main(String[] args) {

        Scope sc = new Scope();

        sc.someAction('a');
        System.out.printf("de waarde van het attribuut is: %d%n",
                                                    sc.getEenInteger());

        sc.someAction('7');
        System.out.printf("de waarde van het attribuut is: %d%n",
                                                    sc.getEenInteger());
    }
}
