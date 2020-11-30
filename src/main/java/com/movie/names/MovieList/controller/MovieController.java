package com.movie.names.MovieList.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.names.MovieList.controller.dao.Movie;
import com.movie.names.MovieList.util.MovieNotFoundException;

@RestController
@RequestMapping("/catalog")
public class MovieController {

	@GetMapping
	public ResponseEntity<List<Movie>> getMovieList() throws MovieNotFoundException {
		List<Movie> moviesList = Stream.of(new Movie(1, "Shawshank Redemption", "7"),
				new Movie(2, "Harry Potter", "10"), new Movie(3, "Drona", "2")).collect(Collectors.toList());
//		if (moviesList.size() < 4)
//			throw new MovieNotFoundException("Movie not Found");
//		else
			return new ResponseEntity<List<Movie>>(moviesList, HttpStatus.OK);
	}

	@RequestMapping(value = "/single")
	public Movie SingleMovieName() {
		return new Movie(12, "Onwards", "6");
	}

}
