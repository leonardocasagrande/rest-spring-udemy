package br.com.erudio.math;

public class SimpleMath {
	public static Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static Double multiply(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	public static Double subtract(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	public static Double divide(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}

	public static Double avg(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	public static Double sqrt(Double number) {
		return Math.sqrt(number);
	}
}
