package com.rk.test;

import java.util.ArrayList;
import java.util.List;

import com.rk.Address;
import com.rk.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("oneToMany");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Student student=new Student();
		student.setSid(110);
		student.setSname("Nilima");
		Address address=new Address();
		address.setCity("Pune");
		address.setId(10);
		address.setStreet("Modern colony");
		address.setZipCode("411002");
		Address address2=new Address();
		address.setCity("Nagar");
		address.setId(11);
		address.setStreet("Shivajinagar");
		address.setZipCode("413201");
		List<Address>addList=new ArrayList<Address>();
		addList.add(address2);
		addList.add(address);
		student.setAddresses(addList);
		address.setStudent(student);
		address2.setStudent(student);
		manager.persist(student);
		manager.persist(address);
		manager.persist(address2);
		manager.getTransaction().commit();
		System.out.println("Success");
		manager.close();
		factory.close();

	}

}
