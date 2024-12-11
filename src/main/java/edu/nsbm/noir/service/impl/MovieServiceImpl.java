package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.MovieEntity;
import edu.nsbm.noir.model.Movie;
import edu.nsbm.noir.repository.MovieRepository;
import edu.nsbm.noir.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    final MovieRepository movieRepository;
    final ModelMapper modelMapper;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(modelMapper.map(movie, MovieEntity.class));
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieRepository.findAll().forEach(movie -> movieList.add(modelMapper.map(movie, Movie.class)));
        return movieList;
    }

    @Override
    public Movie getMovieById(Integer id) {
        return modelMapper.map(movieRepository.findById(id), Movie.class);
    }

    @Override
    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(modelMapper.map(movie, MovieEntity.class));
    }
}
