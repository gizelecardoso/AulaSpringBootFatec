package br.com.bossini.utils;

public class Calculadora {
	
	public double calculaMedia(double...notas) {  //var args - coleção de valores reais / flexibilidade
		double soma = 0;
		for(double d: notas) {
			soma +=d;
		}
		return soma / notas.length;
	}

	/*
	 * public static void main(String[] args) { calculaMedia(); calculaMedia(1);
	 * calculaMedia(2,1); calculaMedia(4,5,6); calculaMedia(1,2,3,4,4,5,6,7,7);
	 * calculaMedia(new double[] {1,2,3,4});
	 * 
	 * 
	 * }
	 */
}
