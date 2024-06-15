package com.project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class LifeCycle {
	
	public static void main(String args[]) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLid(7);
		l.setLname("AlienWare");
		
		session.persist(l);
		l.setLname("ThinkPad");
		
		// Surface will get stored in the DB, If the object l is in persistant state then whatever updates you make for that object will reflect in DB
		
		session.remove(l);
		l.setLname("Test");
		
		// Once we remove the object, whatever updates made on the object will not store in DB
		
		System.out.println(l);

		t.commit();
		session.close();
		factory.close();
		
	}

}
