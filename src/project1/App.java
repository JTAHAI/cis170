/*Namespace - keeping objects unique.
*Translates to a folder.
*Helps organize 'like' code.
*/
package project1;

//App is the entry point to our application.
public class App 
{
	
	public static void main(String[] args)
	{
		User u1 = new User();
		u1.setFirstName("George");
		u1.setLastName("John");
		u1.setEmail("george@john.com");
		u1.setUserName("gjohn");
		
		User u2 = new User();
		u2.setFirstName("George");
		u2.setLastName("John");
		u2.setEmail("george2@john.com");
		u2.setUserName("gjohn");
		
		User u3 = new User();
		u3.setFirstName("John");
		u3.setLastName("George");
		u3.setEmail("john@george.com");
		u3.setUserName("jgeorge");
		
		User u4 = new User();
		u4.setFirstName("John");
		u4.setLastName("Franks");
		u4.setEmail("john@franks.com");
		u4.setUserName("jfranks");
		
		User u5 = new User();
		u5.setFirstName("Fred");
		u5.setLastName("William");
		u5.setEmail("fred@william.com");
		u5.setUserName("fwilliam");
		
		// call a service that returns hundreds of users...
		
		System.out.println(u1.getFirstName());
		System.out.println(u1.getLastName());
		System.out.println(u1.getEmail());
		System.out.println(u1.getUserName());
		System.out.println();
		System.out.println(u2.getFirstName());
		System.out.println(u2.getLastName());
		System.out.println(u2.getEmail());
		System.out.println(u2.getUserName());
		System.out.println();
		System.out.println(u3.getFirstName());
		System.out.println(u3.getLastName());
		System.out.println(u3.getEmail());
		System.out.println(u3.getUserName());
		System.out.println();
		System.out.println(u4.getFirstName());
		System.out.println(u4.getLastName());
		System.out.println(u4.getEmail());
		System.out.println(u4.getUserName());
		System.out.println();
		System.out.println(u5.getFirstName());
		System.out.println(u5.getLastName());
		System.out.println(u5.getEmail());
		System.out.println(u5.getUserName());
		
		// for loop
		for(int x = 0; x < 100; x++)
		{
			System.out.println(x);
		}

	}

}
