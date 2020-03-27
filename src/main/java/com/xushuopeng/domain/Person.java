package com.xushuopeng.domain;

import java.util.Date;

import org.junit.Test;

public class Person {
 private String name;
 private int age;
 private String about;
 private Date zDate;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public Date getzDate() {
	return zDate;
}

public void setzDate(Date zDate) {
	this.zDate = zDate;
}

public Person(String name, int age, String about, Date zDate) {
	super();
	this.name = name;
	this.age = age;
	this.about = about;
	this.zDate = zDate;
}

public Person() {
	super();
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", about=" + about + ", zDate=" + zDate + "]";
}
 
}
