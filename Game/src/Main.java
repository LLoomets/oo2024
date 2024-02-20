import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //saab enda sisse terve hunniku funktsioone ja muutujaid
        Random random = new Random();

        Maailm maailm = new Maailm(5,10);
        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);

        Ese m66k = new Ese("Mõõk",10,1, random, maailm);
        Ese haamer = new Ese("Haamer",5,3, random, maailm);
        Ese saabas = new Ese("Saabas",1,5, random, maailm);
        List<Ese> esemed = new ArrayList<>();
        //List<Integer> taisarvulised;
        //List<String> s6nalised
        esemed.add(m66k);
        esemed.add(haamer);
        esemed.add(saabas);


        // import java.util.Scanner;
        //klass new liidesega (new suuralgustähega())
        Scanner scanner = new Scanner(System.in); // järgmine tund selgitame täpsemalt

        maailm.prindiKaart(mangija, draakon, ork, esemed);
        String sisend = scanner.nextLine();

        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // .equals --> ==         !m.equals() --> !=
            maailm.prindiKaart(mangija, draakon, ork, esemed);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
        }

    } // main(args)

/*    private static int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }*/
} //Main ()


//String sona = "Liisi";
//char esitaht = 'L';
//int taisarv = 123123;
//long andmebaasiId = 324234243;
//byte pilt = 126;
//println() uus rida
//printf() sama rida