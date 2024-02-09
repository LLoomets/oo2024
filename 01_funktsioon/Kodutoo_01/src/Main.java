import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        //funktsioon 1
        String esimeneArv = arvuOlek(20);
        System.out.println(esimeneArv);
        String teineArv = arvuOlek(13);
        System.out.println(teineArv);
        String kolmasArv = arvuOlek(2024);
        System.out.println(kolmasArv);

        //funktsioon 2
        double esimeneFahrenheit = muudaCelsiusFahrenheitiks(-9.5);
        System.out.println(Math.round(esimeneFahrenheit * 100.0)/100.0 + " F");
        double teineFahrenheit = muudaCelsiusFahrenheitiks(23);
        System.out.println(Math.round(teineFahrenheit * 100.0)/100.0 + " F");
        double kolmasFahrenheit = muudaCelsiusFahrenheitiks(0);
        System.out.println(Math.round(kolmasFahrenheit * 100.0)/100.0 + " F");

        //funktsioon 3
        char esimeneHinne = leiameSaadudHinde(92);
        System.out.println(esimeneHinne);
        char teineHinne = leiameSaadudHinde(45);
        System.out.println(teineHinne);
        char kolmasHinne = leiameSaadudHinde(74);
        System.out.println(kolmasHinne);
    }

    //funktsioon 1, kas arv on paaris või paaritu
    private static String arvuOlek(int arv) {
        if (arv % 2 == 0) {
            return "On paarisarv";
        } else {
            return "On paaritu arv";
        }
    }

    //funktsioon 2, celsiuse arvutamine fahrenheit-ks
    private static double muudaCelsiusFahrenheitiks(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //funktsioon 3, hinde kirjeldus
    private static char leiameSaadudHinde(int protsent) {
        if (protsent >= 91) {
            return 'A';
        } else if (protsent >= 81) {
            return 'B';
        } else if (protsent >= 71) {
            return 'C';
        } else if (protsent >= 61) {
            return 'D';
        } else if (protsent >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

