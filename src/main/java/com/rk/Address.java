package com.rk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	private int id;
	private String street;
	private String city;
	private String zipCode;
	@ManyToOne
	@JoinColumn(name = "stud_id")
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String street, String city, String zipCode, Student student) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", student="
				+ student + "]";
	}
	
}
