package MHJ.MHJLaboratorio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // los URLS hay que cambiarlos por que estan un poco pochos, pero los
    // modificaremos mas adelante :)
    @GetMapping("Movies/movies/id/{id}")
    public Movies MovieById(@PathVariable("id") int id) {
        return FindMovieByID(id);
    }

    // este también
    @GetMapping("Movies/movies/title/{title}")
    public Movies movieByTitle(@PathVariable("title") String title) {
        return FindMovieByTitle(title);
    }

    // y por último...pero no por ello menos importante, también
    @GetMapping("Movies/movies/year/{year}")
    public Movies MovieByYear(@PathVariable("year") int year) {
        return FindMovieByYear(year);
    }

    private Movies FindMovieByID(int id) {
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    private Movies FindMovieByTitle(String title) {
        for (Movies movie : movies) {
            if (movie.getTitle() == title) {
                return movie;
            }
        }
        return null;
    }

    private Movies FindMovieByYear(int year) {
        for (Movies movie : movies) {
            if (movie.getYear() == year) {
                return movie;
            }

        }
        return null;
    }

    @PostMapping("/Movies")
    public Movies AddMovie(@RequestBody Movies newMovie) {
        movies.add(newMovie);
        return newMovie;
    }

    @PutMapping("/Movies/{id}")
    public Movies UpdateMovie(@PathVariable("id") int id, @RequestBody Movies updateMovie) {
        Movies m = FindMovieByID(id);
        m.setTitle(updateMovie.getTitle());
        return m;
    }
    
    @DeleteMapping("/Movies/{id}")
    public Movies DeleteMovie(@PathVariable("id") int id) {
        Movies m = FindMovieByID(id);
        movies.remove(m);
        return null;
    }
}