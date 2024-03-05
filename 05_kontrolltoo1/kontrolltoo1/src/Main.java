import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //Esimene punkt
        Arvud arvud = new Arvud(3.0, 5.0);

        double tulemus = arvud.arvutaRuutjuur();
        System.out.println("Omavahel korrutatud arvude juur: " + tulemus);

        //Teine punkt
        List<Double> numbrid = new ArrayList<>();
        numbrid.add(4.0);
        numbrid.add(7.0);
        numbrid.add(8.0);
        numbrid.add(1.0);

        Arvud mitmeArvuObjekt = new Arvud();

        double mitmeArvuTulemus = mitmeArvuObjekt.arvutaMitmeArvuRuutjuur(numbrid);
        System.out.println("Niimitmes juur kui palju oli arve (hetkel 4): " + mitmeArvuTulemus);


        //Kolmas punkt
        List<Double> palgaAndmed = loeAndmeid();

        // Algpalga ja muutuse eraldamine
        double algnePalk = palgaAndmed.get(0);
        List<Double> aastaneMuutus = palgaAndmed.subList(1, palgaAndmed.size());

        PalgaKalkulaator kalkulaator = new PalgaKalkulaator(algnePalk, aastaneMuutus);

        kalkulaator.arvutaPalgad();
        kalkulaator.saadaPalgadFaili("palga_valjund.txt");
    }

    private static List<Double> loeAndmeid() throws IOException {
        List<Double> andmed = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("palga_andmed.txt"));
        String rida;

        while ((rida = br.readLine()) != null) {
            andmed.add(Double.parseDouble(rida));
        }

        br.close();
        return andmed;
    }

}