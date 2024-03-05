import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PalgaKalkulaator {
    double algnePalk;
    List<Double> aastaneMuutus;
    List<Double> palgad;
    List<Double> tostetudPalgad;

    public PalgaKalkulaator(double algnePalk, List<Double> aastaneMuutus) {
        this.algnePalk = algnePalk;
        this.aastaneMuutus = aastaneMuutus;
        this.palgad = new ArrayList<>();
        this.tostetudPalgad = new ArrayList<>();
    }

    public void arvutaPalgad() throws IOException {
        double praegunePalk = algnePalk;
        double tostetudPalk = algnePalk;

        for (int i = 0; i < aastaneMuutus.size(); i++) {
            praegunePalk *= (1 + aastaneMuutus.get(i));
            tostetudPalk *= (1 + 2 * aastaneMuutus.get(i));

            palgad.add(praegunePalk);
            tostetudPalgad.add(tostetudPalk);
        }
    }

    public void saadaPalgadFaili(String failiNimi) throws IOException {
        PrintWriter pw = new PrintWriter(failiNimi);
        pw.print("Aasta\tTava palk\tTõstetud palk\n");

        for (int i = 0; i < palgad.size(); i++) {
            pw.print((i + 1) + "\t" + palgad.get(i) + "\t" + tostetudPalgad.get(i) + "\n");
        }
        pw.close();
    }
}
