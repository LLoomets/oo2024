package ee.tlu.salat.controller;

import ee.tlu.salat.model.Post;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class RestTemplateController {

    // https://jsonplaceholder.typicode.com/posts
    @GetMapping("saa-postitused")
    public List<Post> getPost() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
        // 1. aadress kuhu 2. meetod mida teeme(meie alati GET)
        // 3. Mida kaasa saadan (Body, Header) 4. mis objekti kujuna saame andmed
        ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Post[].class);

        return List.of(response.getBody());
    }

    @GetMapping("saa-postitused/{kasutajaId}")
    public List<Post> getUserPosts(@PathVariable int kasutajaId) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
        // 1. aadress kuhu 2. meetod mida teeme (meie alati GET)
        // 3. Mida kaasa saadan (Body, Header) 4. mis objekti kujuna saame andmed
        ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Post[].class);

        List<Post> kasutajaPostitused = new ArrayList<>();
        for (Post p : response.getBody()) {
            if (p.getUserId() == kasutajaId) {
                kasutajaPostitused.add(p);
            }
        }

        return kasutajaPostitused;
    }
}
