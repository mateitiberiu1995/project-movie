package com.qa.business.service;

public interface IMovieService {
	String getAllMovies();
	
	String getAMovie(Long id);
	
	String createMovie(String movieJSON);

	String updateMovie(String movieUpdate);
	
	String deleteMovie(Long id);
}
