package com.example.demo.Entities;

import java.time.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="education")
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="startdate")
	private LocalDate startDate;
	
	@Column(name="enddate")
	private LocalDate endDate;
	
	@Column(name="userinfo")
	private String userInfo;
	
	@Column(name="school")
	private String school;
	
	public Education() {}
	
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName="id")
	@JsonBackReference
	private User user;

	public Education(int id, LocalDate startDate, LocalDate endDate, String userInfo, String school) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userInfo = userInfo;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
