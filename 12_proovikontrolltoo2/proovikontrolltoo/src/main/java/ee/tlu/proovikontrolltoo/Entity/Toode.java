package ee.tlu.proovikontrolltoo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Toode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimi;
    private double hind;
    private boolean aktiivne;

    @ManyToOne // paneme Kategooria Toode külge
    private Kategooria kategooria;

    // {
    // nimi: "asd,
    // "hind": 123,
    // "aktiivne": true,
    // "kategooria": {"id": 2}
    // }
}
