package org.cap.film.dao;

import java.util.List;

import org.cap.film.pojo.Film;

public interface FilmDao {
	
	public void createFilm(Film film);
	public List<Film> getAllFilms();
	public void deleteFilm(int filmId);
}
