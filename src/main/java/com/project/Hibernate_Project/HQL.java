package com.project.Hibernate_Project;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import net.sf.ehcache.search.expression.Criteria;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Query q1 = session.createQuery("from Alien where aid=2");
		Alien alien = (Alien) q1.uniqueResult();
		System.out.println(alien);


		Query q2 = session.createQuery("from Alien");
		List<Alien> aliens =  q2.list();
		for(Alien a: aliens)
			System.out.println(a);
		
		Query q3 = session.createQuery("from Alien where aid=:aid");
		int aid=2;
		q3.setParameter("aid",aid);
		Alien alien2 = (Alien) q3.uniqueResult();
		System.out.println(alien2);
		
		
		Query q4 = session.createQuery("SELECT A.name FROM Alien A");
		List aliens2 = q4.list();
		for(Object o: aliens2)
		{
			System.out.println(o);
		}
			
		
		
		t.commit();
		session.close();


		

		factory.close();
		
		
		
		
	}
	

}
