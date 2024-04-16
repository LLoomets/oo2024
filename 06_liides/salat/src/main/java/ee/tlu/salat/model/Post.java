package ee.tlu.salat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    // veebilehelt võetud, PEAVAD OLEMA SAMAD
    private int userId;
    private int id;
    private String title;
    private String body;
}
