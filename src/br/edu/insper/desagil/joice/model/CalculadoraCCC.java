package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.023*Math.pow(10, 23);
		double volume = Math.pow((4*raio*Math.pow(10, -7)/Math.sqrt(3)),3);
		double massa = peso/avogadro;
		double densidade = 2*massa/volume;
		return densidade;
	}

}
