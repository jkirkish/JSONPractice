package coderscampus.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import coderscampus.dto.Person;

@Repository
public class PersonRepository {
	
	private Map<Long, Person> personData = new HashMap<>();
	
	public void save(Person person) {
		personData.put(person.getId(), person);	
	}
    public Person findById (Long personId) {
    	return personData.get(personId);
    }
}