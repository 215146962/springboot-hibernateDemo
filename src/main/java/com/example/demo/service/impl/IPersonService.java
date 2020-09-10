package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonMapper;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@Service
class IPersonService implements PersonService {

	@Autowired
	private PersonMapper personMapper;

	// ����
	public List<Person> getPersons() {

		return (List<Person>) personMapper.findAll();
	}

	// ����id����
	public Person getPersonById(String id) {
		return personMapper.findById(id).get();
	}

	// ���
	public void addPerson(Person person) {
		personMapper.save(person);
	}

	// �޸�
	public void updatePerson(Person person) {
		personMapper.save(person);
	}

	// ɾ��
	public void deletePerson(Person person) {
		personMapper.delete(person);
	}

}
