package org.cap.film.dao;

import java.util.List;

import org.cap.film.pojo.Film;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FilmDaoImpl implements FilmDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createFilm(Film film) {
		sessionFactory.getCurrentSession().save(film);
	}

	public List<Film> getAllFilms() {
		
		return sessionFactory.getCurrentSession().createQuery("from Film").list();
	}

	public void deleteFilm(int filmId) {
		Film film=(Film) sessionFactory.getCurrentSession().get(Film.class, filmId);
		
		if(film!=null)
			sessionFactory.getCurrentSession().delete(film);
		
	}

}
