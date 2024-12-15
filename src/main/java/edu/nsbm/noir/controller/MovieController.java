package edu.nsbm.noir.controller;

import edu.nsbm.noir.model.Movie;
import edu.nsbm.noir.repository.MovieRepository;
import edu.nsbm.noir.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MovieController {
final MovieService movieService;
@GetMapping("/add")
    public String addMovie(Model model) {
    model.addAttribute("movie", movieService.getAllMovies());
    return "movie";
}
}
