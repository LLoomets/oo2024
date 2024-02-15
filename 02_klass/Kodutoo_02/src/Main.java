public class Main {
    public static void main(String[] args) {

        Auto esimeneAuto = new Auto("Toyota","Avensis",2006);
        Auto teineAuto = new Auto("Toyota","Yaris",2017);

        String esimeseAutoOlek = esimeneAuto.autoOlek();
        System.out.println(esimeseAutoOlek);
        String teiseAutoOlek = teineAuto.autoOlek();
        System.out.println(teiseAutoOlek);

        int esimeseAutoVanus = esimeneAuto.kauaAutoTeelOlnud();
        System.out.println(esimeseAutoVanus + " aastat teel olnud");
        int teiseAutoVanus = teineAuto.kauaAutoTeelOlnud();
        System.out.println(teiseAutoVanus + " aastat teel olnud");

        System.out.println();

        Inimene esimeneInimene = new Inimene("Mart", 45, 85.3, 1.83);
        Inimene teineInimene = new Inimene("Kadri", 15, 51.2, 1.62);

        String esimeseInimeseNoorus = esimeneInimene.inimeseNooruseMaaramine();
        System.out.println(esimeseInimeseNoorus);
        String teiseInimeseNoorus = teineInimene.inimeseNooruseMaaramine();
        System.out.println(teiseInimeseNoorus);

        double esimeseInimeseBMI = esimeneInimene.inimeseBMIArvutus();
        System.out.println(Math.round(esimeseInimeseBMI * 100.0) / 100.0);
        double teiseInimeseBMI = teineInimene.inimeseBMIArvutus();
        System.out.println(Math.round(teiseInimeseBMI * 100.0) / 100.0);
    }

}