//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Main class + enda tehtud class
        // Classis constructor
        // vähemalt 2 omadust
        // vähemalt 2 funktsiooni

        // Mainis vähemalt 2 instantsi temast
        //Mainis vähemalt 2 funktsiooni väljakutset
        // vähemalt 2 sout

        Kasutaja kasutaja = new Kasutaja("L", true,  21, 'y', 0.0);
        Kasutaja kasutaja2 = new Kasutaja("T", false,  45, 'x', 20.0);

        kasutaja.muudaAktiivne();
        System.out.println(kasutaja.aktiivne);
        double kasutaja2Raha = kasutaja2.lisaRaha(500.0);
        System.out.println(kasutaja2Raha);

        Tellimus tellimus1 = new Tellimus("L", 145.0,"Tool");
        Tellimus tellimus2 = new Tellimus("S", 13.3,"Laud");

        double dollarites = tellimus1.tellimuseKoguSummaDollarites();
        System.out.println(dollarites);

        tellimus2.tellijaNimeVahetus("Y");
        System.out.println(tellimus2.tellija);
    }
}