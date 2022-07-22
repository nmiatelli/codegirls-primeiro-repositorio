package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma (a,b);
		float subtracao =subtracao (a,b);
		float divisao = divisao (a,b);
		float multiplicacao = multiplicacao (a,b);
	
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Divisão = " + divisao);
		System.out.println("Multiplicação = " + multiplicacao);
	}

	public static float soma(float a, float b) {
		return a +b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
}
