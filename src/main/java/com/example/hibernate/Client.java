package com.example.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

@Id
private int id;

private String name;
private String city ;
@Column(name="Commission_Amount")
private int ca;




public Client() {

	// TODO Auto-generated constructor stub
}
public Client(int id, String name, String city, int ca) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.ca = ca;
}
@Override
public String toString() {
	return "Client [id=" + id + ", name=" + name + ", city=" + city + ", ca=" + ca + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getCa() {
	return ca;
}
public void setCa(int ca) {
	this.ca = ca;
}




}