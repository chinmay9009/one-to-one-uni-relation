package com.ty.onetoone.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import PersonPan.Pan;
import PersonPan.Person;

public class PersonPanController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Pan pan=new Pan();
		pan.setCountry("India");
		pan.setPanNumber("48SOFP45");
		pan.setLocalDate(LocalDate.now());
		
		Person person=new Person();
		person.setName("Triru");
		person.setGender("Female");
	
	}
}
