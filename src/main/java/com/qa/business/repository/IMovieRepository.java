package com.qa.business.repository;

public interface IMovieRepository {
	String getAllMovies();
	String getAMovie(Long id);
	String createMovie(String movieJSON);
	String updateMovie(String movieUpdate);
	String deleteMovie(Long id);
}
