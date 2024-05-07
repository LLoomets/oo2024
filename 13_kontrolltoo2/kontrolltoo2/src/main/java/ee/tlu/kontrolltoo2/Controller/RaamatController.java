package ee.tlu.kontrolltoo2.Controller;

import ee.tlu.kontrolltoo2.Entity.Novell;
import ee.tlu.kontrolltoo2.Entity.Raamat;
import ee.tlu.kontrolltoo2.Repository.NovellRepository;
import ee.tlu.kontrolltoo2.Repository.RaamatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RaamatController {

    @Autowired
    RaamatRepository raamatRepository;
    @Autowired
    private NovellRepository novellRepository;

    @GetMapping("raamatud")
    public List<Raamat> getRaamatud() {
        return raamatRepository.findAll();
    }

    @PostMapping("raamatud")
    public List<Raamat> postRaamat(@RequestBody Raamat raamat) {
        raamatRepository.save(raamat);
        return raamatRepository.findAll();
    }

    @GetMapping("raamatud/{id}")
    public List<Novell> getNovellid(@PathVariable Long id){
        return novellRepository.findByRaamat_Id(id);
    }

    @GetMapping("raamatute-kogumaksusmus")
    public double sumRaamatuteMaksusmus() {
        double sum = 0;
        for (Raamat t : raamatRepository.findAll()) {
            sum += t.getMaksumus();
        }
        return sum;

    }

    @GetMapping("raamatute-kogumaksusmus/{valuuta}")
    public double sumRaamatudTeineValuuta(@PathVariable double valuuta) {
        double sum = 0;
        for (Raamat t : raamatRepository.findAll()) {
            sum += t.getMaksumus();
        }
        return sum*valuuta;

    }

    @GetMapping("pikim-raamat")
    public Raamat getPikimRaamat() {
        return raamatRepository.findFirstByLehekulgedeArvNotNullOrderByLehekulgedeArvAsc();
    }

    @GetMapping("tahemarkide-summa/{id}")
    public int getTahemarkideSumma(@PathVariable Long id) {
        List<Novell> novellid = novellRepository.findByRaamat_Id(id);
        int summa = 0;
        for (Novell novell : novellid) {
            summa += novell.getSisu();
        }
        return summa;
    }
}
