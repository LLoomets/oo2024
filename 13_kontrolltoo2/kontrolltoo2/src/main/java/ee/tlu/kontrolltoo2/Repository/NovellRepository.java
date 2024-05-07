package ee.tlu.kontrolltoo2.Repository;

import ee.tlu.kontrolltoo2.Entity.Novell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NovellRepository extends JpaRepository<Novell, Long> {

    Novell findFirstByAastaNotNullOrderByAastaAsc();
    Novell findFirstBySisuNotNullOrderBySisuAsc();

    List<Novell> findByAastaGreaterThan(int aasta);

    List<Novell> findByRaamat_Id(Long id);

}
