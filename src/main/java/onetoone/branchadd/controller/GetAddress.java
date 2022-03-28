package onetoone.branchadd.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.text.AbstractDocument.BranchElement;

public class GetAddress {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Branch branch=new Branch();
		Address address=branch.getAddress();
		
		System.out.println("Branch name             "+branch.getName());
		System.out.println("Branch ID               "+branch.getId());
		System.out.println("Branch phone number     "+branch.getPhn());
		System.out.println("Branch address          "+branch.getAddress());
		System.out.println("Branch area             "+address.getArea());
		System.out.println("Branch address pin code "+address.getPin());
		System.out.println("Branch state            "+address.getState());
	}
}
