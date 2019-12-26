package sample1;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		int target = (int)(Math.random()*10);
		//System.out.println(target);
		Scanner sc = new Scanner(System.in);
		System.out.println("You have 5 attempts to guess: ");
		for(int i =0;i<5;i++)
		{
			System.out.println("Enter number " + (i+1) + ": ");
			if(getInput(sc)==target) {
				System.out.println("Congratulations!");
				return;
			}
			else {
				System.out.println("Sorry! You have " + (4-i) + " Attepts left");
			}
		}
		  System.out.println("You have lost the game!");

	}
	private static int getInput(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		return(temp);
	}

}
