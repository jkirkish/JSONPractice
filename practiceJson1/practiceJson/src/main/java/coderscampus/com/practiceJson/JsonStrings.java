package coderscampus.com.practiceJson;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import coderscampus.dto.Person;

public class JsonStrings {

	
	/*JavaScript Object Notation
	 * A Simple String based way to notate Data
	 * Key : Value pairs
	 * Key : Value pairs are departared by commas
	 * Objects are rerpesented by {}
	 * Arrays are represented by []
	 * 
	 * JSon is not tied to JavaScript... it is language agnostic meaning it'll work in any language
	 * 
	 * Person: name, age, gender
	 * 
	 *{
	 *		"name" : "Trevor page",
	 *      "age" : 49,
	 *      "gender" : "Male"
	 * }
	 * List<Person> people
	 * 
	 * [
	 *	 {
	 * 		
	 *		"name" : "Trevor page",
	 *      "age" : 49,
	 *      "gender" : "Male"
	 * 	 },
	 * 	 {
	 * 		
	 *		"name" : "Jane Done",
	 *      "age" : 49,
	 *      "gender" : "FeMale"
	 * 	 }
	 * ]
	 */
	@Test
	public void convertJsonStringToStringToJavaObj() {
		String jsonString = "{\"name\" : \"Trevor page\",\"age\" : 49, \"gender\" : \"Male\" }";
		//jackson databind
		ObjectMapper mapper = new ObjectMapper();
		try {
			Person person = mapper.readValue(jsonString, Person.class);
			celebrateBirthday(person);
			mapper.writeValueAsString(person);
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void celebrateBirthday(Person person) {
		person.setAge(person.getAge()+1);
	}
}
