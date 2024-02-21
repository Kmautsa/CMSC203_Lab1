import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Movie m = new Movie();//create new movie object
		Scanner scanner = new Scanner(System.in);//create new scanner object to read user input
			System.out.println("Enter the name of the Movie ");//prompt user to enter movie name
				String userInput = scanner.nextLine();//read user input
				m.setTitle(userInput);//set movie title
			System.out.println("Enter the rating of the Movie ");//prompt user to enter movie rating 
				String userInput2 = scanner.nextLine();//read user input
				m.setRating(userInput2);//set movie rating
			System.out.println("Enter the number of tickets sold for this movie ");//prompt user to enter number of tickets sold
				int userInput3 = scanner.nextInt();//read user input
				m.setSoldTickets(userInput3);//set sold tickets
			System.out.println("Goodbye");//print goodbye
			
				scanner.close();// close scanner object
		
	}

}
