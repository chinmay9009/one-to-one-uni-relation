package onetoone.branchadd.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Address address1=new Address();
		address1.setPin(56003);
		address1.setArea("Pune");
		address1.setState("Maharastra");

		Address address2=new Address();
		address2.setPin(456789);
		address2.setArea("Hydrabad");
		address2.setState("Telangana");
		
		Address address3=new Address();
		address3.setPin(456178);
		address3.setArea("Banglore");
		address3.setState("Karnataka");
		
		Branch branch1=new Branch();
		branch1.setAddress(address1);
		branch1.setName("Qspider");
		branch1.setPhn(123456);
		
		Branch branch2=new Branch();
		branch2.setAddress(address2);
		branch2.setName("Jspider");
		branch2.setPhn(993456);
		
		Branch branch3=new Branch();
		branch3.setAddress(address3);
		branch3.setName("Pyspider");
		branch3.setPhn(9852366);
		
		et.begin();
		em.persist(address1);
		em.persist(address2);
		em.persist(address3);
		em.persist(branch1);
		em.persist(branch3);
		em.persist(branch2);
		et.commit();
		
	}
}
