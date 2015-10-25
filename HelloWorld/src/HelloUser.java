/**
 * 
 */

/**
 * @author mhmohsen
 *
 */
public class HelloUser {
	
	private String userName = "";

	/**
	 * 
	 */
	public HelloUser(String theirName) {
		// constructor 
		this.userName = theirName;
	}
	
	/**
	 * 
	 */
	public void greetUser() {
		System.out.println("Hello "+(this.userName)+"!");
	}

}
