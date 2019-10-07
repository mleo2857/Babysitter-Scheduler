package Babysitter_kata.Babysitter_kata;

import java.time.LocalDate;

public class Scheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Family familyA = new Family("Family A", 15);
		familyA.setNewPayRate(11, 20);
		Family familyB = new Family("Family B", 12);
		familyB.setNewPayRate(10, 8);
		familyB.setNewPayRate(12, 16);
		Family familyC = new Family("Family C", 21);
		familyC.setNewPayRate(9, 15);
		
		
//		Scanner userInput = new Scanner(System.in);
//		
//		System.out.println("Please enter the year for the requested babysitting date");
//		String yearString = userInput.nextLine();
//		int year = Integer.parseInt(yearString);
//		
//		System.out.println("Please enter the month for the requested babysitting date");
//		String monthString = userInput.nextLine();
//		int month = Integer.parseInt(monthString);
//		
//		System.out.println("Please enter the day for the requested babysitting date");
//		String dayString = userInput.nextLine();
//		int day = Integer.parseInt(dayString);
		
		
		Babysitter britney = new Babysitter("Britney");
		Babysitter sarah = new Babysitter("Sarah");
		Babysitter kara = new Babysitter("Kara");
		
		Job job1 = new Job(britney,familyA,LocalDate.now(),5,12);
		Job job2 = new Job(sarah,familyB,LocalDate.now(),5,12);
		Job job3 = new Job(kara,familyC,LocalDate.now(),5,12);
		
		britney.displayJobs();
		sarah.displayJobs();
		kara.displayJobs();
		

	}

}
