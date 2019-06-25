package org.cap.film.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="Film_Details")
public class Film {
	
	@Id
	@GeneratedValue
	private int filmId;
	@NotEmpty(message="* Please enter Film Name.")
	private String filmName;
	private String description;
	
	@Past(message="* Release Date should be past.")
	private Date releaseDate;
	
	@Range(min=10000,max=1000000,message="* Rental Cost should be between 10000 and 10laks.")
	private double renetalCost;
	
	@Future(message="* Rental Duration must be future date.")
	private Date rentalDuration;
	private String language;
	
	@Email(message="* Please enter valid email Id.")
	@NotEmpty(message="* Please enter Email.")
	private String filmProducerEmail;
	
	
	public Film(){}
	
	public Film(int filmId, String filmName, String description, Date releaseDate, double renetalCost,
			Date rentalDuration, String language) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.description = description;
		this.releaseDate = releaseDate;
		this.renetalCost = renetalCost;
		this.rentalDuration = rentalDuration;
		this.language = language;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getRenetalCost() {
		return renetalCost;
	}
	public void setRenetalCost(double renetalCost) {
		this.renetalCost = renetalCost;
	}
	public Date getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(Date rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	public String getFilmProducerEmail() {
		return filmProducerEmail;
	}

	public void setFilmProducerEmail(String filmProducerEmail) {
		this.filmProducerEmail = filmProducerEmail;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", filmName=" + filmName + ", description=" + description + ", releaseDate="
				+ releaseDate + ", renetalCost=" + renetalCost + ", rentalDuration=" + rentalDuration + ", language="
				+ language + ", filmProducerEmail=" + filmProducerEmail + "]";
	}

	public Film(int filmId, String filmName, String description, Date releaseDate, double renetalCost,
			Date rentalDuration, String language, String filmProducerEmail) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.description = description;
		this.releaseDate = releaseDate;
		this.renetalCost = renetalCost;
		this.rentalDuration = rentalDuration;
		this.language = language;
		this.filmProducerEmail = filmProducerEmail;
	}


	
	
	

}
