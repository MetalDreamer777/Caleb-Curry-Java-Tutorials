package ep074Searching_a_List_for_Custom_Objects;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Butthead");
		you.setLastName("Null");
		
		List<User> nerds = new ArrayList<User>();
		nerds.add(me);
		nerds.add(you);
		
		System.out.println(User.searchList(nerds, "Butthead", "Null"));
		
	}
}
