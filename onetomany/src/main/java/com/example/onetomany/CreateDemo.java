package com.example.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.onetomany.entity.Customer;
import com.example.onetomany.entity.CustomerDetails;

public class CreateDemo {
	
	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Customer.class)
										.addAnnotatedClass(CustomerDetails.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					
					// create the objects
					/*
					Instructor tempInstructor = 
							new Instructor("Chad", "Darby", "darby@luv2code.com");
					
					InstructorDetail tempInstructorDetail =
							new InstructorDetail(
									"http://www.luv2code.com/youtube",
									"Luv 2 code!!!");		
					*/
					
					Customer tempCustomer = 
							new Customer("Madhu", "Patel", "madhu@luv2code.com");
					
					CustomerDetails tempInstructorDetail =
							new CustomerDetails(
									"http://www.youtube.com",
									"Guitar");		
					
					// associate the objects
					tempCustomer.setInstructorDetail(tempInstructorDetail);
					
					// start a transaction
					session.beginTransaction();
					
					// save the instructor
					//
					// Note: this will ALSO save the details object
					// because of CascadeType.ALL
					//
					System.out.println("Saving instructor: " + tempCustomer);
					session.save(tempCustomer);					
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
	}

}
