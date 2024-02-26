public class Main {
    public static void main(String[] args) {

        Toode toode1 = new Toode("Diivan", 599.99);
        Toode toode2 = new Toode("Voodi", 499.99);

        Tellimus tellimus1 = new Tellimus(toode1, 49.99);
        Tellimus tellimus2 = new Tellimus(toode2, 39.99);

        double toode1KoguSumma = tellimus1.arvutaKoguHind();
        System.out.println(toode1KoguSumma + " €");
        double toode2KoguSumma = tellimus2.arvutaKoguHind();
        System.out.println(toode2KoguSumma + " €");

        toode1.muudaTooteNimi("Televiisor");
        System.out.println(toode1.tooteNimi);

        toode2.muudaTooteNimi("Söögilaud");
        System.out.println(toode2.tooteNimi);
    }
}