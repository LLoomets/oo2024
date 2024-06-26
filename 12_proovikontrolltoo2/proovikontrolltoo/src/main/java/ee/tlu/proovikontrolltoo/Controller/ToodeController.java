package ee.tlu.proovikontrolltoo.Controller;

import ee.tlu.proovikontrolltoo.Entity.Toode;
import ee.tlu.proovikontrolltoo.Repository.ToodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class ToodeController {

    @Autowired
    ToodeRepository toodeRepository;

    @GetMapping("tooted")
    public List<Toode> getTooted() {
        return toodeRepository.findAll();
    }

    @PostMapping("tooted")
    public List<Toode> postToode(@RequestBody Toode toode) {
        toodeRepository.save(toode);
        return toodeRepository.findAll();
    }

    @DeleteMapping("tooted/{id}")
    public List<Toode> deleteToode(@PathVariable Long id) {
        toodeRepository.deleteById(id);
        return toodeRepository.findAll();
    }

    @GetMapping("toode-hind-vahemik/{min}/{max}")
    public List<Toode> toodeHindVahemik(@PathVariable double min, @PathVariable double max) {
        return toodeRepository.findByHindBetween(min, max);
    }

    @GetMapping("max-hinnaga-toode")
    public Toode maxHinnagaToode() {
        return toodeRepository.findFirstByHindNotNullOrderByHindDesc();
    }

    @GetMapping("toode-sisaldab/{nimi}")
    public List<Toode> leiaToodeSisaldab(@PathVariable String nimi){
        return toodeRepository.findByNimiContains(nimi);
    }

    @GetMapping("toode-esimenetaht/{nimi}")
    public List<Toode> toodeEsimeseTahega(@PathVariable String nimi) {
        return toodeRepository.findByNimiStartsWith(nimi);
    }
}
