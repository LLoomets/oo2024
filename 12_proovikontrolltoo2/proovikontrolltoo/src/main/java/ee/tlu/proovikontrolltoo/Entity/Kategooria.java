package ee.tlu.proovikontrolltoo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Kategooria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimi;

    //@ManyToMany // uus tabel, kategooria külge paneme toote, tekib tabel Kategooria_Toode
    //List<Toode> tooted;

}

// Tellimuste sees on tooted
// Vanemate all on lapsed

// Kategooriate all on tooted
// 1. Kategooriat lisades lisada kõik tooted koos temaga
// 2. Kategooriat lisades on tühi array
//      Eraldi API otspunkt millega saab toodet sisestada
// 3. Toodet lisades lisame ka kategooria
