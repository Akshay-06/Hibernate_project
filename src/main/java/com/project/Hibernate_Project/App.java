package com.project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		
		// One Way to do it
//    	Alien alien = new Alien();
//    	alien.setAid(2);
//    	alien.setName("Samhitha");
//    	alien.setColour("Black");
//    	
//    	Configuration cf = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	
//
//    	
//        SessionFactory sf = cf.buildSessionFactory();
//        
//        Session session = sf.openSession();
//        
//        Transaction tx = session.beginTransaction();
//        
//        session.save(alien);
//        
//        tx.commit();

		
		// Otherway to do it
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		Alien e1 = new Alien();
//		e1.setAid(3);
//		e1.setName("Siva");
//		e1.setColour("White");
//
//		session.persist(e1);
//		t.commit();
//		System.out.println("successfully saved");
//		factory.close();
//		session.close();

		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		AlienName aname = new AlienName();
		aname.setFname("Samhitha");
		aname.setLname("Reddy");
		
		Alien alien = new Alien();
		alien.setAid(2);
		alien.setName(aname);
		alien.setColour("Black");

		session.persist(alien);
		
		System.out.println(alien);
		
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
		
	}
}
