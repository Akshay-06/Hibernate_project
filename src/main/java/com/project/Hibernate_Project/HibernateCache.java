package com.project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		// Here the DB query is executed only once. If you call the same query again it'll retrieve from First Level Cache
//		// It'll work for the same session only. If it's different session then First level Cache doesn't work
//		
//		Alien alien = session.get(Alien.class,2);
//		System.out.println(alien);
//		
//		Alien alien1 = session.get(Alien.class,2);
//		System.out.println(alien1);
//		
//		t.commit();
//		factory.close();
//		session.close();

		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Alien alien = session.get(Alien.class,2);
		System.out.println(alien);
		
		t.commit();
		session.close();
		
		
		// Since we enabled EhCache, even if we have different sessions the DB will be called only once for the same query.
		
		Session session1 = factory.openSession();
		Transaction t1 = session1.beginTransaction();
		
		Alien alien1 = session1.get(Alien.class,2);
		System.out.println(alien1);
		
		t1.commit();
		session1.close();
		
		factory.close();

		
	}

}
