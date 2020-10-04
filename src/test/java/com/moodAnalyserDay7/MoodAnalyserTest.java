package com.moodAnalyserDay7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
private MoodAnalyser moodObject;
	
	@Before
	public void initialize(){
		moodObject=new MoodAnalyser();
	}
	
	
	@Test 
	public void givenMood_WhenSad_ReturnSad() {
		moodObject=new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD",moodObject.analyzeMood());
	}
	
	@Test 
	public void givenMood_WhenAny_ReturnHappy() {
		moodObject=new MoodAnalyser("I am in Any Mood");
		assertEquals("HAPPY",moodObject.analyzeMood());
	}
}