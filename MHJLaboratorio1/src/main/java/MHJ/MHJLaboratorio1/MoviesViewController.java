package MHJ.MHJLaboratorio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesViewController {
    @GetMapping("/movies")
    public ModelAndView GetMovies() {
        ModelAndView m = new ModelAndView("listMovies");
        m.addObject("movies", MoviesController.movies);
        return m;
    }

    @GetMapping("/movies/new")
    public ModelAndView CreateMovie() {
        ModelAndView m = new ModelAndView("detailsMovies");
        m.addObject("movies", MoviesController.moviesMyList);
        return m;
    }

    @GetMapping("/movies/edit/{id}")
    public ModelAndView CreateMovie(@PathVariable("id") int id) {
        ModelAndView m = new ModelAndView("detailsMovies");
        m.addObject("movies", MoviesController.FindMovieByID(id));
        return m;
    }

    @GetMapping("movies/detail/{id}")
    public ModelAndView DetailsMovie(@PathVariable("id") int id) {
        ModelAndView m = new ModelAndView("detailsMovies");
        Movies i = MoviesController.FindMovieByID(id);
        m.addObject("movie", i);
        return m;
    }

    @GetMapping("/movies/miLista")
    public ModelAndView GetMoviesLista() {
        ModelAndView m = new ModelAndView("miLista");
        m.addObject("movies", MoviesController.movies);
        return m;
    }
}
