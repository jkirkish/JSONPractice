package coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import coderscampus.dto.Person;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepo;
	
	@PostMapping("/person")
	public Person createPerson(@RequestParam String name, @RequestParam String gender, @RequestParam Integer age) {
		Person person = new Person();
		person.setName(name);	
		person.setAge(age);
		person.setGender(gender);
		personRepo.save(person);
		return person;
	}
	@GetMapping("/persons/{personId}")
	public Person getPerson(@PathVariable Long personId){
	    System.out.println("Person ID is: " + personId);
		return personRepo.findById(personId);
	}
}
