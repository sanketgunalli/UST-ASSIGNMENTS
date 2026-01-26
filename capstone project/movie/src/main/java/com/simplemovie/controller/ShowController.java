package com.simplemovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemovie.entity.Show;
import com.simplemovie.service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
	@Autowired
	private ShowService showService;
	
	@PostMapping
	public Show createShow(@RequestBody Show show) {
		return showService.createShow(show);
	}
	
	@GetMapping("/show")
    public List<Show> getShows() {
        return showService.getAllShows();
    }

    @GetMapping("/movie/{movieId}")
    public List<Show> getShowsByMovie(@PathVariable int movieId) {
        return showService.getShowsByMovie(movieId);
    }
}
