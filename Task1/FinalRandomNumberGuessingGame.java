package Task1;
//task 1-----
import java.util.Random;
import java.util.Scanner;

public class FinalRandomNumberGuessingGame {

	public static void main(String[] args) {
		int min=1;
		int max=100;
		int maxAttempts =10;
		int score=0;
		Scanner scanner =new Scanner(System.in);
		
		boolean playAgain=true;
		
		while(playAgain) {
			Random random =new Random();
			
			int randomNum = random.nextInt(max-min+1)+min;
			System.out.println("Guess The Number Between "+min +" and "+max);
			int attempts=0;
			boolean isCorrect =false;
			
			while(attempts<maxAttempts &&!isCorrect) {
				System.out.println("Enter you guess: ");
				int userGuess =scanner.nextInt();
				attempts++;
				
				if(userGuess<randomNum) {
					System.out.println("Too Low! Try again"+(maxAttempts-attempts));
				}else if(userGuess>randomNum) {
					System.out.println("Too High! Try again"+(maxAttempts-attempts));
				}else {
					System.out.println("Congratulations! You guessed the correct number: "+randomNum);
					isCorrect=true;
					score++;
				}
			}
			if(!isCorrect) {
				System.out.println("Sorry, you've used all attempts. The correct number was: "+randomNum);
			}
			
			    System.out.print("Would you like to play again? (yes/no): ");
	            String response = scanner.next();
	            playAgain = response.equalsIgnoreCase("yes");
	            
	            System.out.println("Your current score: " + score);
		}
		
		 System.out.println("Game over! Your final score: " + score);

	        // Close the scanner
	        scanner.close();
	}
}
