package dao;

import entity.Person;

public interface PersonDao {
	public void insertPerson(Person p);
	public Person selectPersonById(int id);
	public void updatePerson(Person p);
	public void deletePerson(int id);
}
