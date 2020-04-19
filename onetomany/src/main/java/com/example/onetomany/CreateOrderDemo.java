package com.example.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.onetomany.entity.Customer;
import com.example.onetomany.entity.CustomerDetails;
import com.example.onetomany.entity.Order;

public class CreateOrderDemo {
	
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Customer.class)
								.addAnnotatedClass(CustomerDetails.class)
								.addAnnotatedClass(Order.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// get the instructor from db
			int theId = 1;
			Customer tempCustomer = session.get(Customer.class, theId);		
			
			// create some courses
			Order tempOrder1 = new Order(1, "Air Guitar - The Ultimate Guide", tempCustomer);
			Order tempOrder2 = new Order(2, "The Pinball", tempCustomer);
			
			// add courses to instructor
			tempCustomer.add(tempOrder1);
			tempCustomer.add(tempOrder2);
			
			// save the courses
			session.save(tempOrder1);
			session.save(tempOrder2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}


}
