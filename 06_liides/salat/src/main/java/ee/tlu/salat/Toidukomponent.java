package ee.tlu.salat;

// Mis koosneb toiduainest ja temaga seotud kogusest toidu sees
// Teen klassikomplekti -> Kartul+omadused ja mitu grammi

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // <-- lombok constructor, kõikide elementide constructor
@Getter
public class Toidukomponent {

    ToiduaineEntity toiduaine;
    int kogus;
}
