public class Tellimus {
    Toode toode;
    double kulleriHind;

    public Tellimus(Toode toode, double kulleriHind) {
        this.toode = toode;
        this.kulleriHind = kulleriHind;
    }

    public double arvutaKoguHind() {
        return this.toode.tooteHind + this.kulleriHind;
    }
}
