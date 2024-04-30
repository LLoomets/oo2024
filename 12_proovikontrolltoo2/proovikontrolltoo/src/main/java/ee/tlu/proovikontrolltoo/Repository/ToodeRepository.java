package ee.tlu.proovikontrolltoo.Repository;

import ee.tlu.proovikontrolltoo.Entity.Toode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToodeRepository extends JpaRepository<Toode, Long> {
    // Toode või List<Toode>

    List<Toode> findByHindBetween(double hindStart, double hindEnd); // jpa buddy Find Collection alt lood

    Toode findFirstByHindNotNullOrderByHindDesc(); // find instance

    List<Toode> findByNimiContains(String nimi);

    List<Toode> findByNimiStartsWith(String nimi);

    // Tahame listi toodetest, kategooria id järgi
    List<Toode> findByKategooria_Id(Long id); // KategooriaController sees, vahet ei ole kus



}
