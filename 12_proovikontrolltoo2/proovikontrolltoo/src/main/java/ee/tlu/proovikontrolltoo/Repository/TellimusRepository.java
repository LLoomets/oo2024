package ee.tlu.proovikontrolltoo.Repository;

import ee.tlu.proovikontrolltoo.Entity.Tellimus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TellimusRepository extends JpaRepository<Tellimus, Long> {
}
