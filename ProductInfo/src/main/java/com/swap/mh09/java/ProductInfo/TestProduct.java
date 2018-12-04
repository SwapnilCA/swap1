package com.swap.mh09.java.ProductInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct 
{
	public static void main(String[] args)
	{
		
		Product P1 = new Product (10,"mobile",25.00);
		Product P2 = new Product (11,"laptop",25000.50);
		Product P3 = new Product (12,"oil",75.30);
		Product P4 = new Product (14,"tv",3000.40);
		Product P5 = new Product (20,"fm",250.10);
		
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure("hibernet.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(P1);
		session.save(P2);
		session.save(P3);
		session.save(P4);
		session.save(P5);
		
		session.flush();
		tr.commit();
		
		
		}

}
