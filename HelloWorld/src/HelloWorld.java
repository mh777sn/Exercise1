/**
 * 
 */
import java.util.Scanner;

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

		System.out.println("Hello ASE2015 - how are you now? :)");
		
		System.out.println("Please enter your name:");
		String answer = input.nextLine();
		
		HelloUser MyUser = new HelloUser(answer);
		MyUser.greetUser();

	}
}
