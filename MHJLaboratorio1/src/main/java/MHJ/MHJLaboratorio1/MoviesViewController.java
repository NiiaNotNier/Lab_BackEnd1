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
        m.addObject("movies", new Movies());
        return m;
    }

    @GetMapping("/movies/edit/{id}")
    public ModelAndView CreateMovie(@PathVariable("id") int id) {
        ModelAndView m = new ModelAndView("detailsMovies");
        m.addObject("movies", MoviesController.FindMovieByID(id));
        return m;
    }

    @GetMapping("/movies/{id}")
    public ModelAndView DetailsMovie(@PathVariable("id") int id) {
        ModelAndView m = new ModelAndView("detailsMovies");
        m.addObject("movies", MoviesController.FindMovieByID(id));
        return m;
    }
}
