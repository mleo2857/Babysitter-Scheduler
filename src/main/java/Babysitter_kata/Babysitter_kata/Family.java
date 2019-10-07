package Babysitter_kata.Babysitter_kata;

import java.util.HashMap;
import java.util.Set;

public class Family {
	
	private String familyName;
	private int startingPayRate;
	private HashMap<Integer,Integer> payRates = new HashMap<Integer,Integer>();
	
	public Family(String familyName, int startingPayRate) {
		this.familyName = familyName;
		this.startingPayRate = startingPayRate;
		this.initializePayRateMap(this.startingPayRate);
	}

	public String getFamilyName() {
		return familyName;
	}
	
	public void initializePayRateMap(int startingPayRate) {
		for (int i = 6; i < 13; i++) {
			payRates.put(i, startingPayRate);
		}
	}
	
	public void setNewPayRate(int hour, int newPayRate) {
		Set<Integer> hours = payRates.keySet();
		for (Integer aHour : hours) {
			if (aHour > hour) {
				payRates.put(aHour,newPayRate);
			}
		}
	}

	public HashMap<Integer, Integer> getPayRates() {
		return payRates;
	}
	
	

}
