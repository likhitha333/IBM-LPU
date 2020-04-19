package com.example.dao;

import com.example.bean.Person;

public class DaoImpl implements Dao{

	@Override
	public void getPersonInfo() {
		// TODO Auto-generated method stub
		Person obj = new Person();
		System.out.println(obj.getName() + obj.getAddress() + obj.getAge() + obj.getHeight() + obj.getAddress());
	}

	
}
