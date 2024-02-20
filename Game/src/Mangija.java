import java.util.Random;

public class Mangija {
    int xCoord; // deklareerin (loob + mälukoht)
    int yCoord; // parem klõps -> refactor -> rename ja muudab kõikjal
    char symbol;
    Suund suund;
    Ese ese; // klassikomplekt, algväärtus null

    // counstructor alati public (klassil saab valida), sama nimetusega kui klass
    public Mangija(Random random, int kaardiKorgus, int kaardiLaius) {
        xCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        yCoord = saaKoordinaat(random, kaardiKorgus);
        symbol = 'x';
        suund = Suund.YLES;
    }

    public void liigu(String sisend, Maailm maailm){
        switch (sisend) {
            case "w" -> suund = Suund.YLES;
            case "s" -> suund = Suund.ALLA;
            case "a" -> suund = Suund.VASAKULE;
            case "d" -> suund = Suund.PAREMALE;
        } // <-- switch() kinniminek
        switch (suund) {
            case YLES -> {
                if(yCoord > 1) yCoord--;
            }
            case ALLA -> {
                if(yCoord < maailm.kaardiKorgus - 1) yCoord++;
            }
            case VASAKULE -> {
                if(xCoord > 1) xCoord--;
            }
            case PAREMALE -> {
                if(xCoord < maailm.kaardiLaius - 1) xCoord++;
            }
        } // <-- switch() kinniminek
    } // <-- liigu() kinniminek

    // klassides ei käi static
    private int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }
} // <-- Mangija kinniminek
