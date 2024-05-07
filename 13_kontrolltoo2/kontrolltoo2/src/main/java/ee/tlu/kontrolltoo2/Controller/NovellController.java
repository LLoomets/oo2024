package ee.tlu.kontrolltoo2.Controller;


import ee.tlu.kontrolltoo2.Entity.Novell;
import ee.tlu.kontrolltoo2.Repository.NovellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class NovellController {

    @Autowired
    NovellRepository novellRepository;

    @GetMapping("novellid")
    public List<Novell> getTooted() {
        return novellRepository.findAll();
    }

    @PostMapping("novellid")
    public List<Novell> postToode(@RequestBody Novell novell) {
        if (novell.getSisu() >= 10) {
            novellRepository.save(novell);

        }
        return novellRepository.findAll();
    }

    @DeleteMapping("novellid/{id}")
    public List<Novell> deleteToode(@PathVariable Long id) {
        novellRepository.deleteById(id);
        return novellRepository.findAll();
    }

    // kõige vanem
    @GetMapping("vanim-novell")
    public Novell vanimNovell() {
        return novellRepository.findFirstByAastaNotNullOrderByAastaAsc();
    }

    // kõige lühem
    @GetMapping("luhim-novell")
    public Novell luhimNovell() {
        return novellRepository.findFirstBySisuNotNullOrderBySisuAsc();
    }

    @GetMapping("novellid-uuemad/{aasta}")
    public List<Novell> uuemadNovellid (@PathVariable int aasta) {
        return novellRepository.findByAastaGreaterThan(aasta);
    }

}
