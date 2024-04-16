package ee.tlu.Kodutoo04;

import lombok.Getter;

@Getter
public class ManguEntity {
    String nimi;
    int mangijateArv;
    int kestus;
    int punktiskoor;

    public ManguEntity(String nimi, int mangijateArv, int kestus, int punktiskoor) {
        this.nimi = nimi;
        this.mangijateArv = mangijateArv;
        this.kestus = kestus;
        this.punktiskoor = punktiskoor;
    }
}
