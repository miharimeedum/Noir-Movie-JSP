package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Movie;

import java.util.List;

public interface MovieService {
    void addMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovieById(Integer id);
    void deleteMovie(Integer id);
    void updateMovie(Movie movie);
}
