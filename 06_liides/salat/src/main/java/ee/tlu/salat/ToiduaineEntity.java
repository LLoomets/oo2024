package ee.tlu.salat;

// jpa moodulist pärinev. Hibernate
// kui räägite chatgpt-ga -> import javax.persistence.Table
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter //  <- kõikidele elementidele get funktsioon
@AllArgsConstructor
@Table(name = "toiduaine") // nimetuse vahetus - vabatahtlik
@Entity // vajalik andmebaasi panekuks
@NoArgsConstructor // andmebaasi panekuks
public class ToiduaineEntity {
    @Id // alati unikaalne - kustutamiseks, võtmiseks, muutmiseks
    String nimetus;
    int valk;
    int rasv;
    int sysivesik;


//    public ToiduaineEntity(String nimetus, int valk, int rasv, int sysivesik) {
//        this.nimetus = nimetus;
//        this.valk = valk;
//        this.rasv = rasv;
//        this.sysivesik = sysivesik;
//    }
}
