package ep090Creating_the_Default_Constructor;

public class Teacher extends User {
	
	public String prefix;
	public String subject;
	@Override
	public void sayHello() {
		System.out.println("Hello, my name is " + prefix + " " + lastName + ". I am a teacher and I teach " + subject + ".");
	}

}
