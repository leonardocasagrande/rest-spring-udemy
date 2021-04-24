package br.com.erudio.request.validation;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.request.converters.NumberConverter;

public class NumberValidation {
	public static void validateNumbers(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
	}

	public static void validateNumber(String number) throws UnsupportedMathOperationException {
		validateNumbers(number, "0");
	}

	public static void validateIfZero(String number) throws UnsupportedMathOperationException {
		validateNumber(number);
		if (NumberConverter.convertToDouble(number).equals(0D)) {
			throw new UnsupportedMathOperationException("Please divide by a value different than zero!");
		}
	}

	public static void validateIfNotNegative(String number) throws UnsupportedMathOperationException {
		validateNumber(number);
		if (NumberConverter.convertToDouble(number) < 0D) {
			throw new UnsupportedMathOperationException("Please provide a positive number!");
		}
	}
}
