package ee.tlu.proovikontrolltoo.Repository;

import ee.tlu.proovikontrolltoo.Entity.Kategooria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategooriaRepository extends JpaRepository<Kategooria, Long> {
}
