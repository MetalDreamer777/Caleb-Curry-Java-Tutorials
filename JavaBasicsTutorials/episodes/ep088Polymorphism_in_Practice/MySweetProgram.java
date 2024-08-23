package ep088Polymorphism_in_Practice;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		Student s = new Student();
		s.firstName = "Quandale";
		s.lastName = "Dingle";
		s.major = "Mustach Design";
		
		Teacher t = new Teacher();
		t.firstName = "Walter";
		t.lastName = "White";
		t.prefix = "Mr.";
		t.subject = "Science";
		
		List<User> users = new ArrayList<User>();
		users.add(s); users.add(t);
		
		for (User user : users) {
			user.sayHello();
		}
	}
}
