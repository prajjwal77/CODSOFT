package Task2;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
	
	public static void main(String[] args) {
	
	int min =1;
	int max =100;
	
	Random random = new Random();
	int randomNumber = random.nextInt(max-min+1)+min;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Guess the number between " +min+ " and "+max +":");
	
	int userGuess=0;
	
	while(userGuess!=randomNumber) {
		System.out.println("Enter your guess :");
		userGuess = scanner.nextInt();
		
		if(userGuess<randomNumber) {
			System.out.println("Too low!,Try again.");
		}else if(userGuess>randomNumber){
			System.out.println("Too hing!,Try again");
		}else {
			System.out.println("Congratulation! You guessed the correct number :"+randomNumber);
		}
	}
	scanner.close();
	}
}
