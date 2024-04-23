package ee.tlu.proovikontrolltoo;

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
}
