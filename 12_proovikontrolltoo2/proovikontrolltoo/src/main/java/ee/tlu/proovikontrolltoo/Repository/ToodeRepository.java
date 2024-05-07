package ee.tlu.proovikontrolltoo.Repository;

import ee.tlu.proovikontrolltoo.Entity.Toode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToodeRepository extends JpaRepository<Toode, Long> {
    // Toode või List<Toode>

    List<Toode> findByHindBetween(double hindStart, double hindEnd); // jpa buddy Find Collection alt lood

    // max hinnaga toote leidmine
    Toode findFirstByHindNotNullOrderByHindDesc(); // find instance, toodecontroller sees



    // Toode sisaldab kindalt tähte või tähe rida, Sisestad o ja leiab kõik mille sees o,
    // sisestad piim leiab kõik millel piim, aga SUUR ja väike täht on erinevad
    List<Toode> findByNimiContains(String nimi); // toodecontroller sees



    // Leiab tooted, mis sisaldavad sisestatud tähte
    List<Toode> findByNimiStartsWith(String nimi); // toodecontroller sees



    // Tahame listi toodetest, kategooria id järgi
    List<Toode> findByKategooria_Id(Long id); // KategooriaController sees, vahet ei ole kus



}
