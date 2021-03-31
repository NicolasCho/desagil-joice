package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	private CalculadoraCFC calculadora;
	private static double DELTA = 0.05;
	
	@BeforeEach
	public void setUp() {
		calculadora = new CalculadoraCFC();
	}

	@Test
	public void cobreTest() {
		assertEquals(8.89, calculadora.calcula(63.55, 0.128), DELTA);
	}
	
	@Test
	public void ouroTest() {
		assertEquals(19.36, calculadora.calcula(196.97, 0.144), DELTA);
	}
	
	@Test
	public void prataTest() {
		assertEquals(10.60, calculadora.calcula(107.87, 0.144), DELTA);	
	}

}
