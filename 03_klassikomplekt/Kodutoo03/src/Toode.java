public class Toode {
    String tooteNimi;
    double tooteHind;

    public Toode(String tooteNimi, double tooteHind) {
        this.tooteNimi = tooteNimi;
        this.tooteHind = tooteHind;
    }

    public void muudaTooteNimi(String uusNimi) {
        tooteNimi = uusNimi;
    }
}
