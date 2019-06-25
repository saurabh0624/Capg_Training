package org.cap.film.service;

import java.util.List;

import org.cap.film.dao.FilmDao;
import org.cap.film.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmDao filmDao;
	
	@Transactional
	public void createFilm(Film film) {
		filmDao.createFilm(film);
		
	}

	@Transactional
	public List<Film> getAllFilms() {
		
		return filmDao.getAllFilms();
	}

	@Transactional
	public void deleteFilm(int filmId) {
		
		filmDao.deleteFilm(filmId);
	}

}
