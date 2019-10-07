package Babysitter_kata.Babysitter_kata;

import java.time.LocalDate;
import java.util.HashMap;

public class Job {
	
	private int startTime;
	private int endTime;
	private Babysitter babysitter;
	private Family family;
	private LocalDate date;
	private int jobPay;
	
	public Job(Babysitter babysitter, Family family, LocalDate date, int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.babysitter = babysitter;
		this.family = family;
		this.date = date;
		this.jobPay = 0;
		this.performJob();
	}
	
	public void performJob() {
		this.babysitter.bookDate(this.date);
		HashMap<Integer, Integer> payRates = this.family.getPayRates();
		for (int i = this.startTime + 1; i <= this.endTime; i++) {
			jobPay += payRates.get(i);
		}
		this.babysitter.logJob(this.date, this.family, jobPay);
	}
	
	

}
