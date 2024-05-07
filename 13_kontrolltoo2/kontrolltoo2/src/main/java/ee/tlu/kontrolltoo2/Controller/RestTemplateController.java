package ee.tlu.kontrolltoo2.Controller;

import ee.tlu.kontrolltoo2.model.Book;
import ee.tlu.kontrolltoo2.model.Book2;
import ee.tlu.kontrolltoo2.model.Root;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class RestTemplateController {

    @GetMapping("saa-raamatuid-poest")
    public List<Root> raamatudPoest() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Root> response = restTemplate.exchange("https://api.itbook.store/1.0/search/mongodb", HttpMethod.GET, null, Root.class);

        return Arrays.asList(response.getBody());
    }

    @GetMapping("saa-raamatute-pealkirjad-poest")
    public List<String> raamatutePealkirjadPoest() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Root> response = restTemplate.exchange("https://api.itbook.store/1.0/search/mongodb", HttpMethod.GET, null, Root.class);

        List<String> pealkirjad = new ArrayList<>();

        // Käsitlege iga raamatut tsüklis ja lisage pealkirjad loendisse
        for (Book book : response.getBody().getBooks()) {
            pealkirjad.add(book.getTitle());
        }

        return pealkirjad;
    }

    // sisestatakse raamatu nimi ning leitakse üles õige raamat.
    //@GetMapping("saa-raamatud-poest/{title}")


    //@GetMapping("koige-vanem-raamat")

    @GetMapping("saa-raamatud")
    public List<Book2> getRaamatud() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Book2> response = restTemplate.exchange("https://api.itbook.store/1.0/search/mongodb", HttpMethod.GET, null, Book2.class);

        return Arrays.asList(response.getBody());
    }

}
