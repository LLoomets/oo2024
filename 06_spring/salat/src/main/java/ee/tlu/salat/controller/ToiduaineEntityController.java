package ee.tlu.salat.controller;

import ee.tlu.salat.entity.ToiduaineEntity;
import ee.tlu.salat.repository.ToiduaineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")  // see ütleb mis rakendus mulle ligi pääseb

public class ToiduaineEntityController {

    // ["Kartul", "Vorst"];
    // [{nimi: "Kartul", valk: 0}, {nimi: "Vorst"}]

    ToiduaineRepository toiduaineRepository; // ühendan Repository, et saaks ligi andmebaasi päringutele
    // imitatsioon: ToiduaineRepository toiduaineRepository = new ToiduaineRepository();

    // Dependency Injection
    public ToiduaineEntityController(ToiduaineRepository toiduaineRepository) {
        this.toiduaineRepository = toiduaineRepository;
    }

//    @Autowired
//    ToiduaineRepository toiduaineRepository;

    //List<ToiduaineEntity> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    // localhost:8080/api/toiduained
    @GetMapping("toiduained")
    public List<ToiduaineEntity> saaToiduained() {
        return toiduaineRepository.findAll();
    }

    // localhost:8080/api/toiduained/Kartul/50/15/25
    @PostMapping("toiduained/{nimi}/{valk}/{rasv}/{sysivesik}")
    public List<ToiduaineEntity> lisaToiduaine(
             @PathVariable String nimi,
             @PathVariable int valk,
             @PathVariable int rasv,
             @PathVariable int sysivesik
            ) {
        if (valk + rasv + sysivesik > 100) {
            return toiduaineRepository.findAll();
        }
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduaineRepository.save(toiduaine);
        return toiduaineRepository.findAll();
    }

    @PostMapping("toiduained")
    public List<ToiduaineEntity> lisaToiduaine(@RequestBody ToiduaineEntity toiduaineEntity) {
        if (toiduaineEntity.getValk() + toiduaineEntity.getRasv() + toiduaineEntity.getSysivesik() > 100) {
            return toiduaineRepository.findAll();
        }
        //ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduaineRepository.save(toiduaineEntity);
        return toiduaineRepository.findAll();
    }

    @DeleteMapping("toiduained/{nimi}")
    public List<ToiduaineEntity> kustutaToiduaine(@PathVariable String nimi) {
        toiduaineRepository.deleteById(nimi);
        return toiduaineRepository.findAll();
    }

    // localhost:8080/api/toiduained/Vorst/15/30/5 <-- PathVariable
    // localhost:8080/api/toiduained?index=0&nimi=Vorst&valk=15&rasv=30&sysivesik=5 <-- RequestParam
    @PutMapping("toiduained")
    public List<ToiduaineEntity> muudaToiduaine(
            @RequestParam int index,
            @RequestParam String nimi,
            @RequestParam int valk,
            @RequestParam int rasv,
            @RequestParam int sysivesik
    ) {
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        //toiduaine.set(index, toiduaine);
        toiduaineRepository.save(toiduaine); // <-- sama mis POST
        // Hibermate kontrollib, kas on juba sellise primaarvõtmega element andmebaasis
        return toiduaineRepository.findAll();
    }

    @GetMapping("toiduained/{nimi}")
    public ToiduaineEntity saaYksToiduaine(@PathVariable String nimi) {
        return toiduaineRepository.findById(nimi).get();
    }

    @GetMapping("toiduainete-koguarv")
    public int toiduaineteKoguarv() {
        return toiduaineRepository.findAll().size();
    }

    @GetMapping("toiduaine-valk-min/{minValk}")
    public List<ToiduaineEntity> toiduaineMinValk(@PathVariable int minValk) {
        return toiduaineRepository.findAllByValkGreaterThan(minValk);
    }

    @GetMapping("toiduaine-sysivesik/{min}/{max}")
    public List<ToiduaineEntity> toiduainedSysivesik(@PathVariable int min, @PathVariable int max) {
        return toiduaineRepository.findAllBySysivesikBetween(min, max);
    }

}

// PathVariable DELETE (get)
// RequestParam GET
// RequestBody POST / PUT
