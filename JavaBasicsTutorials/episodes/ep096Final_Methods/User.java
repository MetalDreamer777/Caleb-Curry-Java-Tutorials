package ep096Final_Methods;

public abstract class User implements Talk {
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public final void sayHello() { // <-- 'final' keyword prevents the method from being overwritten
		
	}
}
