package com.project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		User user = new User();
//		user.setId(2);
//		user.setName("Samhitha");
//		user.setAge(24);
//
//		session.persist(user);
//		t.commit();
//		System.out.println("successfully saved");
//		factory.close();
//		session.close();
		
		
		
		// One to One
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		Student s = new Student();
//		s.setRollNo(2);
//		s.setName("Samhitha");
//		s.setMarks(100);
//
//		Laptop l = new Laptop();
//		l.setLid(2);
//		l.setLname("Apple");
//		
//		s.setLaptop(l);
//		
//		session.persist(s);
//		session.persist(l);
//		t.commit();
//		System.out.println("successfully saved");
//		factory.close();
//		session.close();
		
		
		//One to Many
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		Student s = new Student();
//		s.setRollNo(4);
//		s.setName("Sagar");
//		s.setMarks(90);
//
//		Laptop l = new Laptop();
//		l.setLid(4);
//		l.setLname("HP");
//		
//		s.setLaptop(l);
//		
//		Department d = session.get(Department.class, 1);
//		s.setDepartment(d);
//		
//		session.persist(s);
//		session.persist(l);
//		t.commit();
//		System.out.println("successfully saved");
//		factory.close();
//		session.close();
		
		
		//Many To Many
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Student s = session.get(Student.class, 2);

		
		Course c = session.get(Course.class, 1001);
		
		s.getCourse().add(c);
		
		session.persist(c);
		session.persist(s);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
		
	}

}
