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
		assertEquals("SAD",moodObject.analyzeMood("I am in Sad Mood"));
	}
	
	@Test 
	public void givenMood_WhenAny_ReturnHappy() {
		assertEquals("HAPPY",moodObject.analyzeMood("I am in Any Mood"));
	}
}