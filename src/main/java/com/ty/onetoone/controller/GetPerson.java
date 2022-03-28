package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import PersonPan.Pan;
import PersonPan.Person;

public class GetPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Pan pan=new Pan();
		Person person =pan.getPerson();
		
		System.out.println("Pan number: "+pan.getPanNumber());
		System.out.println("Person name: "+person.getName());
		System.out.println("Gender: "+person.getGender());
		System.out.println("Person phone number: "+person.getPhn());
		System.out.println("Country "+pan.getCountry());
		
	}
}
