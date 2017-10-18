package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	static AthleticGame ag;
	
	@BeforeClass
	public static void init() {
		ag = new AthleticGame("Calcio");
	}
	
	@After
	public void reset() {
		ag.reset();
	}
	
	@Before
	public void start() {
		ag.start();
	}
	
	@Test
	public void getWinnerWorks() {
		ag.addArrival("Dybala", Instant.now());
		ag.addArrival("Higuain", Instant.now().plusMillis(1000));
		assertEquals("Dybala", ag.getWinner());
	}
	
	@Test
	public void getWinnerWorks2() {
		assertEquals(null, ag.getWinner());
	}
}
