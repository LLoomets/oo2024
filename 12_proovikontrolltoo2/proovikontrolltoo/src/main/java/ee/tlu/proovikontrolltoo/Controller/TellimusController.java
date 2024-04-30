package ee.tlu.proovikontrolltoo.Controller;

import ee.tlu.proovikontrolltoo.Entity.Tellimus;
import ee.tlu.proovikontrolltoo.Repository.TellimusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TellimusController {
    @Autowired
    TellimusRepository tellimusRepository; //  <-- saame andmebaasi funktsioone teha


    @GetMapping("tellimused")
    public List<Tellimus> getTellimus() {
        return tellimusRepository.findAll();
    }

    @PostMapping("tellimused")
    public List<Tellimus> postTellimus(@RequestBody Tellimus tellimus) {
        tellimusRepository.save(tellimus);
        return tellimusRepository.findAll();
    }

    @DeleteMapping("tellimused/{id}")
    public List<Tellimus> deleteTellimus(@PathVariable Long id) {
        tellimusRepository.deleteById(id);
        return tellimusRepository.findAll();
    }
}
