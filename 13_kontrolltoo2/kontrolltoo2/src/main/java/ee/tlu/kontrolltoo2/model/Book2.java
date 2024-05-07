package ee.tlu.kontrolltoo2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book2 {
    public int id;
    public String title;
    public String author;
    public Object publication_year;
    public ArrayList<String> genre;
    public String description;
    public String cover_image;
}
