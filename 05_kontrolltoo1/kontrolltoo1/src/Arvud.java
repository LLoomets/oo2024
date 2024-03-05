import java.util.ArrayList;
import java.util.List;

public class Arvud {

    double arv1;
    double arv2;
    List<Double> numbrid;

    public Arvud(double arv1, double arv2) {
        this.arv1 = arv1;
        this.arv2 = arv2;
        this.numbrid = new ArrayList<>();
    }

    public Arvud() {
        this.numbrid = new ArrayList<>();
    }

    //Esimene punkt
    public double arvutaRuutjuur() {
        double tulemus = Math.sqrt(arv1 * arv2);
        return tulemus;
    }

    //Teine punkt
    public double arvutaMitmeArvuRuutjuur(List<Double> numbrid){
        double mitmeArvuKorrutis = 1.0;
        for (double number : numbrid) {
            mitmeArvuKorrutis *= number;
        }

        double mitmeArvuTulemus = Math.pow(mitmeArvuKorrutis, 1.0 / numbrid.size());
        return mitmeArvuTulemus;

    }

}
