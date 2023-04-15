package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculadoraControlador {

	@GetMapping("/suma")
	   public double suma(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
	       return num1 + num2;
	   }

	   @GetMapping("/resta")
	   public double resta(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
	       return num1 - num2;
	   }

	   @GetMapping("/multiplicacion")
	   public double multiplicacion(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
	       return num1 * num2;
	   }

	   @GetMapping("/division")
	   public double division(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2) {
	       if (num2 == 0) {
	           throw new IllegalArgumentException("No se puede dividir entre cero");
	       }
	       return num1 / num2;
	   }
}
