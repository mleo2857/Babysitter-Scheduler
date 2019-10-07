package Babysitter_kata.Babysitter_kata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Babysitter {
	
	private String name;
	private ArrayList<LocalDate> datesBooked = new ArrayList<LocalDate>();
	private HashMap<LocalDate,HashMap> jobLog = new HashMap<LocalDate,HashMap>();
	private int earnings;
	
	public String getName() {
		return name;
	}

	public int getEarnings() {
		return earnings;
	}

	public Babysitter(String name) {
		this.name = name;
		this.earnings = 0;
	}
	
	public boolean isAvailable(LocalDate date) {
		if (datesBooked.isEmpty() || !datesBooked.contains(date)) {
			return true;
		}
		return false;
	}
	
	public void bookDate(LocalDate date) {
		if (this.isAvailable(date)) {
			datesBooked.add(date);
		}
	}
	
	public void logJob(LocalDate date, Family family, int jobEarnings) {
		HashMap<String, Integer> familyAndEarnings = new HashMap<String, Integer>();
		familyAndEarnings.put(family.getFamilyName(),jobEarnings);
		jobLog.put(date, familyAndEarnings);
	}
	
	public void calculateTotalEarnings() {
		int totalEarnings = 0;
		Set<LocalDate> datesWorked = jobLog.keySet();
		for (LocalDate date : datesWorked) {
			HashMap<String, Integer> familyAndEarnings = jobLog.get(date);
			Set <String> family = familyAndEarnings.keySet();
			for (String aFamily : family) {
				totalEarnings += familyAndEarnings.get(aFamily);
			}
		}
		this.earnings = totalEarnings;
	}
	
	public void displayJobs() {
		String format = "%1$-30s%2$-30s%3$-30s\n";
		System.out.format(format, "Date","Family","Earnings");
		System.out.println("=========================================================================");
		Set<LocalDate> datesWorked = jobLog.keySet();
		for (LocalDate date : datesWorked) {
			HashMap<String, Integer> familyAndEarnings = jobLog.get(date);
			Set <String> family = familyAndEarnings.keySet();
			for (String aFamily : family) {
				System.out.format(format, date,aFamily,familyAndEarnings.get(aFamily));
			}
		}
		this.calculateTotalEarnings();
		System.out.println();
		System.out.println("Total Earnings: $" + this.earnings);
	}
}
