package com.simplemovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemovie.entity.Show;
import com.simplemovie.repository.ShowRepository;


@Service
public class ShowService {
	@Autowired
	private ShowRepository showRepo;
	
	public Show createShow(Show show) {
		return showRepo.save(show);
	}
	
	public List<Show> getAllShows(){
		return showRepo.findAll();
	}
	
	public List<Show> getShowsByMovie(int movieId){
		return showRepo.findByMovieMovieId(movieId);
	}
}
