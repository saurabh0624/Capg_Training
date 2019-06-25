package org.cap.film.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.cap.film.pojo.Film;
import org.cap.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FilmController {
	
	@Autowired
	private FilmService filmService;

	@RequestMapping("/filmForm")
	public String showFilmPage(ModelMap map){
		map.put("msg", "Film Management System");
		map.put("film",new Film());
		map.put("films", filmService.getAllFilms());
		map.put("languages", getAllLanguages());
		return "filmPage";
	}
	
	@RequestMapping(value="/saveFilm",method=RequestMethod.POST)
	public String saveFilmObject(@Valid @ModelAttribute("film") Film film,
			BindingResult result,ModelMap map){
		map.put("films", filmService.getAllFilms());
		map.put("languages", getAllLanguages());
		if(result.hasErrors()){
			return "filmPage";
		}else{
			filmService.createFilm(film);
			return "redirect:filmForm";
		}
	}
	
	
	public List<String> getAllLanguages(){
		List<String> languages=new ArrayList<String>();
		languages.add("Hindi");
		languages.add("English");
		languages.add("Tamil");
		languages.add("Telgu");
		languages.add("Malayalam");
		languages.add("Kanata");
		return languages;
		
	}
	
	@RequestMapping("/delete/{filmId}")
	public String deleteFilmObject(@PathVariable("filmId") Integer filmId){
		filmService.deleteFilm(filmId);
		return "redirect:/filmForm";
	}
	
	
	
	
}
