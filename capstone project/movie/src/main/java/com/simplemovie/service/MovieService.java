package com.simplemovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemovie.entity.Movie;
import com.simplemovie.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public Movie addMovie(Movie m) {
		return movieRepo.save(m);
	}
	
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}

	public void deleteMovie(Integer id) {
		movieRepo.deleteById(id);
		
	}	
}
