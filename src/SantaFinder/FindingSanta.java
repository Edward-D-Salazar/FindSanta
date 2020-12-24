package SantaFinder;

import java.util.Scanner;

public class FindingSanta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		SantaSuspects santaSuspects = new SantaSuspects(6);
		
		santaSuspects.addSuspect("Bob Guy");
		santaSuspects.addSuspect("Sally Girl");
		santaSuspects.addSuspect("Petter Dude");
		santaSuspects.addSuspect("John Boy");
		santaSuspects.addSuspect("Pat Back");
		santaSuspects.addSuspect("Dev Man");
		
		System.out.println("Provide a name to search for: ");
		String searchFor = scanner.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if(foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		}
		else {
			System.out.println(searchFor + " is not a santa suspect");
		}
		
	}

}
