import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //saab enda sisse terve hunniku funktsioone ja muutujaid
        Random random = new Random();

        Maailm maailm = new Maailm(5,10); // instantsi tegemine new
        System.out.println(maailm);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        List<Tegelane> tegelased = new ArrayList<>();
        tegelased.add(mangija);
        tegelased.add(draakon);
        tegelased.add(ork);

        Ese m66k = new Ese("Mõõk",10,1, random, maailm);
        Ese haamer = new Ese("Haamer",5,3, random, maailm);
        Ese saabas = new Ese("Saabas",1,5, random, maailm);
        List<Ese> esemed = new ArrayList<>();
        //List<Integer> taisarvulised;
        //List<String> s6nalised
        esemed.add(m66k);
        esemed.add(haamer);
        esemed.add(saabas);

        Soiduk auto = new Soiduk(50, "Auto", random, maailm);
        Soiduk k2ru = new Soiduk(5, "Käru", random, maailm);
        Soiduk veok = new Soiduk(30, "Veok", random, maailm);
        List<Soiduk> soidukid = new ArrayList<>();
        soidukid.add(auto);
        soidukid.add(k2ru);
        soidukid.add(veok);


        // import java.util.Scanner;
        //klass new liidesega (new suuralgustähega())
        Scanner scanner = new Scanner(System.in);

        maailm.prindiKaart(tegelased, esemed, soidukid);
        String sisend = scanner.nextLine();

        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // .equals --> ==         !m.equals() --> !=
            maailm.prindiKaart(tegelased, esemed, soidukid);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
            for (Ese e : esemed){ // e on suvaline muutuja nimi
                if (mangija.xCoord == e.xCoord && mangija.yCoord == e.yCoord) {
                       mangija.ese = e;
                    System.out.println("Korjasid üles eseme: " + e.nimetus);
                       break;
                }
            }
            //for (Soiduk s : soidukid){}
            for (Soiduk s : soidukid) {
                if (mangija.xCoord == s.xCoord && mangija.yCoord == s.yCoord) {
                    mangija.soiduk = s;
                    System.out.println("Ronisid sõidukisse: " + s.nimetus);
                    break;
                }
            }

            // JavaScript: esemed.forEach(e => {if (e.xCoord && e.yCoord)})
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