package ee.tlu.Kodutoo04;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ManguEntityController {
    List<ManguEntity> manguAndmed = new ArrayList<>();

    // saa mäng
    @GetMapping("mangu-andmed")
    public List<ManguEntity> saaManguAndmed() {
        return manguAndmed;
    }

    // lisa mäng
    // localhost:8080/api/mangu-andmed/Korvpall/10/52/30
    // localhost:8080/api/mangu-andmed/Jalgpall/22/32/2
    @PostMapping("mangu-andmed/{nimi}/{mangijateArv}/{kestus}/{punktiskoor}")
    public List<ManguEntity> lisaMang(
            @PathVariable String nimi,
            @PathVariable int mangijateArv,
            @PathVariable int kestus,
            @PathVariable int punktiskoor
    ) {
        ManguEntity andmed = new ManguEntity(nimi, mangijateArv, kestus, punktiskoor);
        manguAndmed.add(andmed);
        return manguAndmed;
    }

    // kustuta mäng
    // localhost:8080/api/mangu-andmed/0
    @DeleteMapping("mangu-andmed/{index}")
    public List<ManguEntity> kustutaMang(@PathVariable int index) {
        manguAndmed.remove(index);
        return manguAndmed;
    }

    // muuda mängu
    // localhost:8080/api/mangu-andmed?index=0&nimi=UNO&mangijateArv=4&kestus=30&punktiskoor=123
    @PutMapping("mangu-andmed")
    public List<ManguEntity> muudaMangu(
            @RequestParam int index,
            @RequestParam String nimi,
            @RequestParam int mangijateArv,
            @RequestParam int kestus,
            @RequestParam int punktiskoor
    ) {
        ManguEntity andmed = new ManguEntity(nimi, mangijateArv, kestus, punktiskoor);
        manguAndmed.set(index, andmed);
        return manguAndmed;
    }

    // punktiskooride kogusumma
    @GetMapping("mangu-andmed/punktiskoori-kogusumma")
    public int punktiskooriKogusumma() {
        int summa = 0;
        for(ManguEntity andmed : manguAndmed) {
            summa += andmed.punktiskoor;
        }
        return summa;
    }

    // mängu numbriliste andmete kogusumma
    @GetMapping("mangu-andmed/kogusumma")
    public int manguAndmeteKogusumma() {
        int summa = 0;
        for(ManguEntity andmed : manguAndmed) {
            summa += andmed.mangijateArv + andmed.kestus + andmed.punktiskoor;
        }
        return summa;
    }
}
