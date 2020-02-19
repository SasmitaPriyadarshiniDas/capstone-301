package com.mindtree.booking.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movie")
public class Movie {

	@Id
	@Indexed(name = "name", unique = true) 
	@NotNull
	@NotBlank
	@Size(min = 2, max = 100)
	private String movieName;
	
	private long movieId;
	
	@Size(min = 2, max = 100)
	private String moviePosterUrl;
	
	@Size(min = 2, max = 100)
	private String movieTags;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMoviePosterUrl() {
		return moviePosterUrl;
	}

	public void setMoviePosterUrl(String moviePosterUrl) {
		this.moviePosterUrl = moviePosterUrl;
	}

	public String getMovieTags() {
		return movieTags;
	}

	public void setMovieTags(String movieTags) {
		this.movieTags = movieTags;
	}
	
	
	
	

}
