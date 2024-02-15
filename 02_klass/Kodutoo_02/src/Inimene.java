public class Inimene {

    String inimeseNimi;
    int inimeseVanus;
    double inimeseKaal;
    double inimesePikkusMeetrites;

    public Inimene(String inimeseNimi, int inimeseVanus, double inimeseKaal, double inimesePikkusMeetrites) {
        this.inimeseNimi = inimeseNimi;
        this.inimeseVanus = inimeseVanus;
        this.inimeseKaal = inimeseKaal;
        this.inimesePikkusMeetrites = inimesePikkusMeetrites;
    }

    public String inimeseNooruseMaaramine(){
        if (inimeseVanus >= 65){
            return "Pensionär";
        } else if (inimeseVanus >= 40){
            return "Keskealine";
        } else if (inimeseVanus >= 20){
            return "Täiskasvanu";
        } else if (inimeseVanus >= 12) {
            return "Teismeline";
        } else {
            return "Junsu";
        }
    }

    public double inimeseBMIArvutus() {
        return inimeseKaal / (inimesePikkusMeetrites * inimesePikkusMeetrites);
    }
}
