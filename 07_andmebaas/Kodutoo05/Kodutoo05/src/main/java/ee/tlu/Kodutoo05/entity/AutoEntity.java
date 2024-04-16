package ee.tlu.Kodutoo05.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "auto")
@Entity
@NoArgsConstructor
public class AutoEntity {
    @Id
    private String tootja;
    private String mudel;
    private int aasta;
    private int labisoit;

//    public AutoEntity(String tootja, String mudel, int aasta, int labisoit) {
//        this.tootja = tootja;
//        this.mudel = mudel;
//        this.aasta = aasta;
//        this.labisoit = labisoit;
//    }
}
