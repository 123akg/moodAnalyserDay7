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
	public void moodTest() {
		assertEquals("Happy Mood",moodObject.analyzeMood("I am in Happy Mood"));
		assertEquals("Sad Mood",moodObject.analyzeMood("I am in Sad Mood"));
	}	
}