package com.example.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_detail_id")
	private CustomerDetails customerDetails;

	@OneToMany(mappedBy = "customer", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Order> orders;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerDetails getInstructorDetail() {
		return customerDetails;
	}

	public void setInstructorDetail(CustomerDetails instructorDetail) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructorDetail=" + customerDetails + "]";
	}

	public List<Order> getCourses() {
		return orders;
	}

	public void setCourses(List<Order> courses) {
		this.orders = courses;
	}

	// add convenience methods for bi-directional relationship

	public void add(Order tempOrder) {

		if (orders == null) {
			orders = new ArrayList<Order>();
		}

		orders.add(tempOrder);

		tempOrder.setCustomer(this);
	}

	public void setCustomerDetails(CustomerDetails tempCustomerDetails) {
		// TODO Auto-generated method stub
		
	}


}
