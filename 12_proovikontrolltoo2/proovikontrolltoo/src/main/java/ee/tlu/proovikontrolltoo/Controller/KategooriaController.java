package ee.tlu.proovikontrolltoo.Controller;

import ee.tlu.proovikontrolltoo.Entity.Kategooria;
import ee.tlu.proovikontrolltoo.Entity.Toode;
import ee.tlu.proovikontrolltoo.Repository.KategooriaRepository;
import ee.tlu.proovikontrolltoo.Repository.ToodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class KategooriaController {

    @Autowired
    KategooriaRepository kategooriaRepository; //  <-- saame andmebaasi funktsioone teha
    @Autowired
    private ToodeRepository toodeRepository;


    @GetMapping("kategooriad")
    public List<Kategooria> getKategooriad() {
        return kategooriaRepository.findAll();
    }

    @PostMapping("kategooriad")
    public List<Kategooria> postKategooria(@RequestBody Kategooria kategooria) {
        kategooriaRepository.save(kategooria);
        return kategooriaRepository.findAll();
    }

    @DeleteMapping("kategooriad/{id}")
    public List<Kategooria> deleteKategooria(@PathVariable Long id) {
        kategooriaRepository.deleteById(id);
        return kategooriaRepository.findAll();
    }

    @GetMapping("kategooria-tooted/{id}")
    public List<Toode> getKategooriaTooted(@PathVariable Long id) {
        return toodeRepository.findByKategooria_Id(id);
    }

    @GetMapping("kategooria-tooted-summa/{id}")
    public double sumKategooriaTooted(@PathVariable Long id) {
//        double sum = 0;
//        for (Toode t : toodeRepository.findByKategooria_Id(id)) {
//            sum += t.getHind();
//        }
//        return sum;

        return toodeRepository.findByKategooria_Id(id).stream().mapToDouble(e -> e.getHind()).sum();
    }
}
