package MHJ.MHJLaboratorio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
    public static ArrayList<Movies> movies = new ArrayList(Arrays.asList(new Movies(1, "High School Musical", 2012),
            new Movies(2, "Burlesque", 1997), new Movies(3, "Superman", 1990), new Movies(4, "Solo en Casa", 1999),
            new Movies(5, "La chica de la curva", 2015), new Movies(6, "La huerfana", 2016),
            new Movies(7, "Los chicos del Maiz", 2009)));

    @GetMapping("Movies")
    public List<Movies> GetMovies() {
        return movies;
    }

}