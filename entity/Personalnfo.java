package com.example.demo.Entities;
import java.time.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="personalnfo")
public class Personalnfo {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="birthday")
	private LocalDate birthday;
	
	@Column(name="askerlik")
	private Boolean askerlik;
	
	@Column(name="sabika")
	private String sabika;
	
	public Personalnfo() {};
	
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="user_id")
	@JsonBackReference
	private User user;

	public Personalnfo(Long id, String gender, LocalDate birthday, Boolean askerlik, String sabika) {
		super();
		this.id = id;
		this.gender = gender;
		this.birthday = birthday;
		this.askerlik = askerlik;
		this.sabika = sabika;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Boolean getAskerlik() {
		return askerlik;
	}

	public void setAskerlik(Boolean askerlik) {
		this.askerlik = askerlik;
	}

	public String getSabika() {
		return sabika;
	}

	public void setSabika(String sabika) {
		this.sabika = sabika;
	}
	
	

}
