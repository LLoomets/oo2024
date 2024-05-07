package ee.tlu.kontrolltoo2.Repository;

import ee.tlu.kontrolltoo2.Entity.Novell;
import ee.tlu.kontrolltoo2.Entity.Raamat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaamatRepository extends JpaRepository<Raamat, Long> {

    Raamat findFirstByLehekulgedeArvNotNullOrderByLehekulgedeArvAsc();
}
