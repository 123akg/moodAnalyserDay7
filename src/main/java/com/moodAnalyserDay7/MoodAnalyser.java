package com.moodAnalyserDay7;

public class MoodAnalyser {
	
	public String analyzeMood(String message) {
		if(message.toLowerCase().contains("sad"))
			return "SAD";			
		else if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		else
			return "HAPPY";
	}
}
