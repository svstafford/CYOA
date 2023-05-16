import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while (con == true) {
						
			System.out.print("Hello, what is your name?: ");
			String name = scan.next();
			
			CYOAObject story = new CYOAObject(name);
			System.out.println(story.beginning());
			System.out.print(story.scenario1());
			
			String choice1 = scan.next().toLowerCase();
			
			if(choice1.equals("north")) {
				System.out.println(story.north());
				
			}
			else if (choice1.equals("south")) {
				System.out.println(story.south());
				
			}
			else if (choice1.equals("east")) {
				System.out.println(story.east());
				//this is where the scenario 2 should be handled
				String choice2 = scan.next().toLowerCase();
				
				if (choice2.equals("red")) {
					System.out.println(story.red());
				}
				else if(choice2.equals("orange"));
			}
			else {
				System.out.println(story.west());
				
			}
			
			System.out.println("Would you like to try again? (q to quit, any button to continue)");
			String keepGoing = scan.next().toLowerCase();
			
			if(keepGoing.equals("q")) {
				con = false;
			}
		}
		
		System.out.println("Thanks for playing.");
		
	}

}
