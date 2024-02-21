import java.util.Scanner;

public class MovieDriver2 {

    public static void main(String[] args) {
        Movie m = new Movie();//create new movie object
        Scanner scanner = new Scanner(System.in);//create new scanner object to read user input
        String bool = "y";//initialize loop control variable
        	//loop allowing user to enter data multiple times
        while (bool.equals("y")) {
            System.out.println("Enter the name of the movie ");//prompt user name of movie
            String userInput = scanner.nextLine();//read movie name input 
            m.setTitle(userInput);//set the movie title

            System.out.println("Enter the rating of the movie ");//prompt user rating of movie
            String userInput2 = scanner.nextLine();//read movie rating input
            m.setRating(userInput2);//set movie rating

            System.out.println("Enter the number of tickets sold for this movie ");//prompt user to enter number of tickets sold
            int userInput3 = scanner.nextInt();//read number of tickets sold input
            scanner.nextLine(); // Consume the newline character
            m.setSoldTickets(userInput3);//set movie tickets sold
            	//display movie details
            System.out.println("Conclusion: " + m.getRating() + ", Tickets sold: " + m.getSoldTickets());
            
            System.out.println("Do you want to enter another? (y/n)");//question if they wish to continue 
            bool = scanner.nextLine();//read user decision 
        }

        System.out.println("Goodbye ");//print goodbye
        scanner.close();//close scanner object
    }
}