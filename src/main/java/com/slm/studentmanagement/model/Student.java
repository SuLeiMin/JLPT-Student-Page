package com.slm.studentmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "levelJP")
	private String levelJP;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, String level, String levelJP, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.levelJP = levelJP;
		this.address = address;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelJP() {
		return levelJP;
	}

	public void setLevelJP(String levelJP) {
		this.levelJP = levelJP;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
