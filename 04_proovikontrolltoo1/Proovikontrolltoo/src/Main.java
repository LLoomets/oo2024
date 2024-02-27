import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double keskmine = arvutaAritmeetilineKeskmine(4, 7, 8);
        System.out.println(keskmine);

        List<Double> arvud = new ArrayList<>();
        arvud.add(4.0);
        arvud.add(7.0);
        arvud.add(8.0);
        List<Double> libisevadKeskmised = arvutaLibisevKeskmine(arvud);
        System.out.println(libisevadKeskmised);

        Keskmine keskmine1 = new Keskmine(arvud);
        List<Double> libisevKeskmine2 = keskmine1.saaArvudKeskmistest();
        System.out.println(libisevKeskmine2);
        keskmine1.lisaArv(10.0);
        List<Double> libisevKeskmine3 = keskmine1.saaArvudKeskmistest();
        System.out.println(libisevKeskmine3);

    }

    // private static --> kui funktsioon kutsutakse mainis
    // public --> loon funktsiooni teises klassis

    private static double arvutaAritmeetilineKeskmine(double arv1, double arv2, double arv3){
        //double aritmeetilineKeskmine = (arv1 + arv2 + arv3) / 3;
        //return aritmeetilineKeskmine; võimalus pikemalt kirjutada
        return (arv1 + arv2 + arv3) / 3;
    }

    private static List<Double> arvutaLibisevKeskmine(List<Double> arvud){
        List<Double> arvudKeskmised = new ArrayList<>();

        for (int i = 0; i < arvud.size() - 2; i++) {
            double summa = arvud.get(i) + arvud.get(i + 1) + arvud.get(i + 2);
            double libisevKeskmine = summa / 3;
            arvudKeskmised.add(libisevKeskmine);
        }
        return arvudKeskmised;
    }
}