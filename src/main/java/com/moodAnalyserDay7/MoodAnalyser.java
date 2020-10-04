package com.moodAnalyserDay7;

public class MoodAnalyser {
	
private String message;
	
	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyzeMood() {
		if(message.toLowerCase().contains("sad"))
			return "SAD";			
		else if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		else
			return "HAPPY";
	}
}
