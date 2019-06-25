package org.cap.film.service;

import java.util.List;

import org.cap.film.pojo.Film;

public interface FilmService {
	public void createFilm(Film film);
	public List<Film> getAllFilms();
	public void deleteFilm(int filmId);
}
