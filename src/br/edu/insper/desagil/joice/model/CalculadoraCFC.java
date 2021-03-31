package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{
	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.023*Math.pow(10, 23);
		double volume = Math.pow((4*raio*Math.pow(10, -7)/Math.sqrt(2)),3);
		double massa = peso/avogadro;
		double densidade = 4*massa/volume;
		return densidade;
	}

}
