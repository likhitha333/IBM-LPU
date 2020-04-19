package com.example.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.onetomany.entity.Customer;
import com.example.onetomany.entity.CustomerDetails;
import com.example.onetomany.entity.Order;

public class CreateCustomerDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(CustomerDetails.class)
				.addAnnotatedClass(Order.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try
		{
			Customer tempCustomer = new Customer("likki", "kommineni","sree@gmail.com");
			
			CustomerDetails tempCustomerDetails = new CustomerDetails("lalithabrand.com", "rice bussiness");
			tempCustomer.setCustomerDetails(tempCustomerDetails);
			session.beginTransaction();
			System.out.println("Saving customer: " + tempCustomer);
			session.save(tempCustomer);					
			
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
