public class Tellimus {
    String tellija;
    double tellimuseKoguSumma;
    String tellitavEse;

    public Tellimus(String tellija, double tellimuseKoguSumma, String tellitavEse) {
        this.tellija = tellija;
        this.tellimuseKoguSumma = tellimuseKoguSumma;
        this.tellitavEse = tellitavEse;
    }

    public double tellimuseKoguSummaDollarites() {
        return tellimuseKoguSumma * 1.07;
    }

    public void tellijaNimeVahetus(String tellijaUusNimi) {
        tellija = tellijaUusNimi;
    }
}
