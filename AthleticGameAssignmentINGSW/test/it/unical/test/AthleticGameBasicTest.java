package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	static AthleticGame ag;
	
	@BeforeClass
	public static void init() {
		ag = new AthleticGame("Calcio");
	}
	
	@Test
	public void addArrivalWorks() {
		ag.addArrival("Dybala", Instant.now());
		assertEquals(1, ag.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipantTimeWorks() {
		ag.addArrival("Chiellini", Instant.now());
		ag.getParecipiantTime("Chiellini");
	}
}
