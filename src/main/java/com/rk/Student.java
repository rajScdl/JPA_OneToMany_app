package com.rk;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
@Id
private int sid;
private String sname;
@OneToMany(mappedBy ="student",cascade = CascadeType.ALL)
private List<Address> addresses;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<Address> getAddresses() {
	return addresses;
}
public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", addresses=" + addresses + "]";
}
 
}
