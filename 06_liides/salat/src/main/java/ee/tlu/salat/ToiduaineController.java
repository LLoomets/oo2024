package ee.tlu.salat;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ToiduaineController {
    List<String> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    // localhost:8080/saa-toiduained ---> []
    @GetMapping("toiduained")
    public List<String> saaToiduained() {
        return toiduained;
    }

    // PostMappingut ei saa brauseris teha
    // localhost:8080/toiduained/kartul POST (postmanis)
    @PostMapping("toiduained/{toiduaine}")
    public List<String> lisaToiduaine(@PathVariable String toiduaine) {
        toiduained.add(toiduaine);
        return toiduained;
    }

    // DeleteMappingut ei saa brauseris teha
    // localhost:8080/toiduained/0 DELETE
    @DeleteMapping("toiduained/{index}")
    public List<String> kustutaToiduaine(@PathVariable int index) {
        toiduained.remove(index);
        return toiduained;
    }

    // DeleteMappingut ei saa brauseris teha
    // localhost:8080/toiduained/Sink PUT
    @PutMapping("toiduained/{index}/{newValue}")
    public List<String> muudaToiduaine(@PathVariable int index, @PathVariable String newValue) {
        toiduained.set(index, newValue);
        return toiduained;
    }

    @GetMapping("toiduained/{index}")
    public String saaYksToiduaine(@PathVariable int index) {
        return toiduained.get(index);
    }
    // CRUD --> Create, Read, Update, Delete



    // localhost:8080/tere/nimi
    @GetMapping("tere/{nimi}")
    public String hello(@PathVariable String nimi) {
        return "Tere " + nimi + "!";
    }

    // localhost:8080/korruta/1/3
    @GetMapping("korruta/{arv1}/{arv2}")
    public int multiply(@PathVariable int arv1, @PathVariable int arv2) {
        return arv1 * arv2;
    }
}

// 404 - URL ehk API otspunkt on vale
// 4xx - Front-endi viga
// 5xx - Back-endi viga (serveripoolne viga)