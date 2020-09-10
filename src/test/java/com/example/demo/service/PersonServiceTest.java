package com.example.demo.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

	@Autowired
	private PersonService personService;

	//@Test
	public void addPersons() {
		
		for(int i=1;i<=10;i++) {
			Person person=new Person();
			person.setAddress(i+"号工业区");
			person.setIdCard(Integer.toString(i));
			person.setName("黑喂狗"+i);
			person.setPhone(Integer.toString(i));
			personService.addPerson(person);
		}
	}
	
	@Test
	public void getPersons() {
		List<Person> persons= personService.getPersons();
		for (Person person : persons) {
			System.out.println(person);
		}
	}
	
	
}
