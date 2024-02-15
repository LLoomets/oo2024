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
    }

}