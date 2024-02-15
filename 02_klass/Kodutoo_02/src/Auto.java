public class Auto {

    String tootja;
    String mudel;
    int aasta;

    public Auto(String tootja, String mudel, int aasta) {
        this.tootja = tootja;
        this.mudel = mudel;
        this.aasta = aasta;
    }

    public String autoVanuseMaaramine(){
        if (aasta >= 2010) {
            return "Täitsa uus auto";
        } else if (aasta >= 2000) {
            return "No veel sõidab";
        } else {
            return "Ikka päris vana auto juba";
        }
    }


}
