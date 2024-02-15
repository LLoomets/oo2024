public class Auto {

    String tootja;
    String mudel;
    int tootmisAasta;

    public Auto(String tootja, String mudel, int tootmisAasta) {
        this.tootja = tootja;
        this.mudel = mudel;
        this.tootmisAasta = tootmisAasta;
    }

    public String autoOlek(){
        if (tootmisAasta >= 2010) {
            return "Täitsa uus auto";
        } else if (tootmisAasta >= 2000) {
            return "No veel sõidab";
        } else {
            return "Ikka päris vana auto juba";
        }
    }

    public int kauaAutoTeelOlnud(){
        int praeguAasta = 2024;
        return praeguAasta - tootmisAasta;
    }


}
