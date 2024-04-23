package ee.tlu.proovikontrolltoo;

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
