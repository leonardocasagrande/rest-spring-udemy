package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.request.converters.NumberConverter;
import br.com.erudio.request.validation.NumberValidation;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		NumberValidation.validateNumbers(numberOne, numberTwo);
		Double sum = NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
		return sum;
	}

	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtract(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		NumberValidation.validateNumbers(numberOne, numberTwo);
		Double subtract = NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
		return subtract;
	}

	@RequestMapping(value = "multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiply(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		NumberValidation.validateNumbers(numberOne, numberTwo);
		Double multiply = NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
		return multiply;
	}

	@RequestMapping(value = "divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divide(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		NumberValidation.validateNumber(numberOne);
		NumberValidation.validateIfZero(numberTwo);
		Double divide = NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
		return divide;
	}

	@RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double avg(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		NumberValidation.validateNumbers(numberOne, numberTwo);
		Double avg = (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;
		return avg;
	}

	@RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		NumberValidation.validateIfNotNegative(numberOne);
		Double sqrt = Math.sqrt(NumberConverter.convertToDouble(numberOne));
		return sqrt;
	}
}
