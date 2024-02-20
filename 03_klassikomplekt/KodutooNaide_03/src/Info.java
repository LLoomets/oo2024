public class Info {
    String nimetus;
    int ram;
    String graafikaKaar;

    public Info(String nimetus, int ram, String graafikaKaar) {
        this.nimetus = nimetus;
        this.ram = ram;
        this.graafikaKaar = graafikaKaar;
    }

    public void muudaNimetus(String uusNimetus) {
        nimetus = uusNimetus;
    }
}
