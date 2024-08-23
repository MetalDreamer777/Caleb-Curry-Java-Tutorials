package ep067Creating_Custom_Type_in_Loop;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
			
	public String getFullNameActual() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	public String getLastName() {
		return lastName.toUpperCase();
	}
		
	public void setFirstName(String fn) {
		firstName = fn.strip();
	}

	public void setLastName(String ln) {
		lastName = ln.strip();
	}
	
}
