public class Inimene {

    String inimeseNimi;
    int inimeseSunniAasta;
    double inimeseKaal;
    double inimesePikkusMeetrites;

    public Inimene(String inimeseNimi, int inimeseSunniAasta, double inimeseKaal, double inimesePikkusMeetrites) {
        this.inimeseNimi = inimeseNimi;
        this.inimeseSunniAasta = inimeseSunniAasta;
        this.inimeseKaal = inimeseKaal;
        this.inimesePikkusMeetrites = inimesePikkusMeetrites;
    }

    public String inimesePolvkonnadMaaramine(){
        if (inimeseSunniAasta >= 2013){
            return "Põlvkond alfa";
        } else if (inimeseSunniAasta >= 1997){
            return "Põlvkond Z";
        } else if (inimeseSunniAasta >= 1981){
            return "Põlvkond Y / millenniumi põlvkond";
        } else if (inimeseSunniAasta >= 1965) {
            return "Põlvkond X";
        } else if (inimeseSunniAasta >= 1946) {
            return "Beebibuumer";
        } else if (inimeseSunniAasta >= 1928) {
            return "Vaikne põlvkond";
        } else if (inimeseSunniAasta >= 1901) {
            return "Parim põlvkond (G.I. põlvkond)";
        } else {
            return "Kadunud põlvkond";
        }
    }

    public double inimeseBMIArvutus() {
        return inimeseKaal / (inimesePikkusMeetrites * inimesePikkusMeetrites);
    }
}
