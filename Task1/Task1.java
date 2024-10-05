package Task1;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int min=1;
		int max=100;
		
		Random random = new Random();
		
		int randomNum = random.nextInt(max-min+1)+min;
		
		System.out.println("Random number between "+min+" and "+max+" : "+randomNum);
	}
}
