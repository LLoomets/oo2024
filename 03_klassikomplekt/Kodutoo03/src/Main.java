public class Main {
    public static void main(String[] args) {

        Toode toode1 = new Toode("Diivan", 599.99);
        Tellimus tellimus = new Tellimus(toode1, 49.99);

        double toode1KoguSumma = tellimus.arvutaKoguHind();
        System.out.println(toode1KoguSumma + " €");

        toode1.muudaTooteNimi("Televiisor");
        System.out.println(toode1.tooteNimi);
    }
}