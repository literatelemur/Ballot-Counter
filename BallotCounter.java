import java.util.Scanner;
public class BallotCounter {

	public static void main(String[] args) {
		int[] can = new int[1000];
		int vote = 1000;
		Scanner input = new Scanner(System.in);
		while (vote > -1 ) {
		System.out.print("Enter candidate's ID number (0-999, any negative number to exit) : ");
		vote = input.nextInt();
		if (vote > 999)
			System.out.println("Invalid ID number!");
		else if (vote < 0);
		else 
			can[vote]++;
		}
		System.out.println("");
		System.out.println("Election Results:");
		System.out.println("-----------------");
		for (int i = 0; i< can.length; i++) {
			if (can[i] > 0)
				System.out.println("Candidate " + i + ": " + can[i] + " vote(s)");
		}
		
	}

}
