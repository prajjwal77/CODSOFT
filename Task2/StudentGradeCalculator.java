package Task2;

import java.util.Scanner;
/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user*/
public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of subjects : ");
		int numSub = scan.nextInt();
		int []marks =new int[numSub];
		int totalmarks=0;
		
		for(int i=1;i<=numSub;i++) {
			System.out.println("Enter marks of subject "+i+" (out of 100) : ");
			marks[i-1]=scan.nextInt();
			totalmarks+=marks[i-1];
		}
		double  avgPercentage =(double)totalmarks/numSub;
		
		String grade = findGrade(avgPercentage);
		
		System.out.println("...........Result............ ");
		System.out.println("Total Marks : "+totalmarks);
		System.out.println("Average Percentage : "+avgPercentage);
		System.out.println("Grade : "+grade);
	}

	private static String findGrade(double avgPercentage) {
		if(avgPercentage>=90) {
			return "A+";
		}else if(avgPercentage>=80) {
			return "A";
		}else if (avgPercentage>=70) {
			return "B+";
		}else if (avgPercentage>=60) {
			return "B";
		}else if (avgPercentage>=50) {
			return "C+";
		}else if (avgPercentage>=40) {
			return "D";
		} else {
				return "F";
		}
	}
}
