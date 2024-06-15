package com.project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class GetAndLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Alien alien = session.get(Alien.class,2); // Here query is runned irrespective of using the variable or not
	
		Alien alien1 = session.load(Alien.class, 1); // If we use load, query will only run when you use the variable
		
		//To see the functionality of load method remove the print statement below
		
		System.out.println(alien1);
		
		t.commit();
		session.close();
		factory.close();

	}

}
