package com.simplemovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemovie.entity.Movie;
import com.simplemovie.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	@GetMapping
	public List<Movie> getMovies(){
		return movieService.getAllMovies();
	}
	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable Integer id) {
	    movieService.deleteMovie(id);
	}

	
}
