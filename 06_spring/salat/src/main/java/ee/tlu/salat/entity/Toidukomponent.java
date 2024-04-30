package ee.tlu.salat.entity;

// Mis koosneb toiduainest ja temaga seotud kogusest toidu sees
// Teen klassikomplekti -> Kartul+omadused ja mitu grammi

import ee.tlu.salat.entity.ToiduaineEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor // <-- lombok constructor, kõikide elementide constructor
@Getter
@NoArgsConstructor
@Entity
public class Toidukomponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne // kui kustutatakse toiduaine, siis kustuvad ka temaga seotud toidukomponendid
    ToiduaineEntity toiduaine;

    //@ManyToOne
    //Toit toit;

//    @ManyToMany
//    List<ToiduaineEntity> toiduained;
    int kogus;

    // {id: 5, {toiduaine: "Vorst"}, kogus: 100 }
}
