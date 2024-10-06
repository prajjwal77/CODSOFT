package Task1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame2 {
	public static void main(String[] args) {
	
	int min=1;
	int max =100;
	Scanner scanner =new Scanner(System.in);
	Random random = new Random();
	int  randomNum =random.nextInt(max-min+1)+min;
	System.out.println("Guess the number between "+min+" and "+max);
	
	int guessNum =0;
	
	while(guessNum!=randomNum) {
		System.out.println("Enter your guess : ");
		guessNum=scanner.nextInt();
		
		if(guessNum<randomNum) {
			System.out.println("Too Low! Try Again");
		}
		else if(guessNum>randomNum) {
			System.out.println("Too High! Try Again");
		}
		else {
			System.out.println("Congratulation! you guessed the correct number "+guessNum);
		}
	}
	scanner.close();
	}
	
}
