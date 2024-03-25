package ee.tlu.Kodutoo05;

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
    String tootja;
    String mudel;
    int aasta;
    int labisoit;

//    public AutoEntity(String tootja, String mudel, int aasta, int labisoit) {
//        this.tootja = tootja;
//        this.mudel = mudel;
//        this.aasta = aasta;
//        this.labisoit = labisoit;
//    }
}
