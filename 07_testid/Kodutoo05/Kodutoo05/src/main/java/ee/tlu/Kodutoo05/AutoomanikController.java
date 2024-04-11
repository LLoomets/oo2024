package ee.tlu.Kodutoo05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class AutoomanikController {

    @Autowired
    AutoomanikRepository autoomanikRepository;

    @GetMapping("autoomanikud")
    public List<Autoomanik> getAutoomanik() {
        return autoomanikRepository.findAll();
    }

    @DeleteMapping("autoomanikud/{id}")
    public List<Autoomanik> deleteAutoomanik(@PathVariable Long id) {
        autoomanikRepository.deleteById(id);
        return autoomanikRepository.findAll();
    }

    @PostMapping("autoomanikud")
    public List<Autoomanik> postAutoomanik(@RequestBody Autoomanik autoomanik) {
        autoomanikRepository.save(autoomanik);
        return autoomanikRepository.findAll();
    }
}
