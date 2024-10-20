package com.endava.day7;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	private static final int DEFAULT_PRECISION = 10;
	private int precision;

	public Calculator(int precision) {
		this.precision = precision;
	}

	public Calculator() {
		this(DEFAULT_PRECISION);
	}

	// Operatii de baza
	public double add(double a, double b) {
		return round(a + b);
	}

	public double subtract(double a, double b) {
		return round(a - b);
	}

	public double multiply(double a, double b) {
		return round(a * b);
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return round(a / b);
	}

	// Functii pentru modul Expert
	public double power(double base, double exponent) {
		return round(Math.pow(base, exponent));
	}

	public double root(double number) {
		if (number < 0) {
			throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
		}
		return round(Math.sqrt(number));
	}

	public double factorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Factorial of a negative number is not defined.");
		}
		double result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return round(result);
	}

	// Evaluarea unei expresii matematice
	public double evaluate(String expression) {
		return round(evaluateExpression(expression));
	}

	// Functia de rotunjire
	private double round(double value) {
		return Math.round(value * Math.pow(10, precision)) / Math.pow(10, precision);
	}

	// Evaluare expresie (shunting-yard algorithm)
	private double evaluateExpression(String expression) {
		Stack<Double> values = new Stack<>();
		Stack<Character> ops = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (Character.isDigit(ch)) {
				StringBuilder sb = new StringBuilder();
				while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
					sb.append(expression.charAt(i++));
				}
				i--;
				values.push(Double.parseDouble(sb.toString()));
			} else if (ch == '(') {
				ops.push(ch);
			} else if (ch == ')') {
				while (ops.peek() != '(') {
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				}
				ops.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (!ops.isEmpty() && hasPrecedence(ch, ops.peek())) {
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				}
				ops.push(ch);
			}
		}
		while (!ops.isEmpty()) {
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		}
		return values.pop();
	}

	private boolean hasPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')') return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
		return true;
	}

	private double applyOp(char op, double b, double a) {
		switch (op) {
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': if (b == 0) throw new ArithmeticException("Cannot divide by zero");
				return a / b;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose mode: Basic or Expert");
		String mode = scanner.nextLine();

		System.out.println("Enter the precision (floating points) for the calculator:");
		int precision = scanner.nextInt();
		scanner.nextLine(); // consume newline

		Calculator calculator = new Calculator(precision);

		if (mode.equalsIgnoreCase("Basic")) {
			System.out.println("You are in Basic mode.");
			System.out.println("Enter operation (add, subtract, multiply, divide):");
			String operation = scanner.nextLine();

			System.out.println("Enter first number:");
			double num1 = scanner.nextDouble();

			System.out.println("Enter second number:");
			double num2 = scanner.nextDouble();

			switch (operation.toLowerCase()) {
				case "add":
					System.out.println("Result: " + calculator.add(num1, num2));
					break;
				case "subtract":
					System.out.println("Result: " + calculator.subtract(num1, num2));
					break;
				case "multiply":
					System.out.println("Result: " + calculator.multiply(num1, num2));
					break;
				case "divide":
					System.out.println("Result: " + calculator.divide(num1, num2));
					break;
				default:
					System.out.println("Invalid operation.");
			}
		} else if (mode.equalsIgnoreCase("Expert")) {
			System.out.println("You are in Expert mode.");
			System.out.println("Enter expert operation (power, root, factorial, evaluate):");
			String operation = scanner.nextLine();

			switch (operation.toLowerCase()) {
				case "power":
					System.out.println("Enter base:");
					double base = scanner.nextDouble();
					System.out.println("Enter exponent:");
					double exponent = scanner.nextDouble();
					System.out.println("Result: " + calculator.power(base, exponent));
					break;
				case "root":
					System.out.println("Enter number:");
					double number = scanner.nextDouble();
					System.out.println("Result: " + calculator.root(number));
					break;
				case "factorial":
					System.out.println("Enter integer:");
					int factNumber = scanner.nextInt();
					System.out.println("Result: " + calculator.factorial(factNumber));
					break;
				case "evaluate":
					System.out.println("Enter expression:");
					String expression = scanner.nextLine();
					System.out.println("Result: " + calculator.evaluate(expression));
					break;
				default:
					System.out.println("Invalid expert operation.");
			}
		} else {
			System.out.println("Invalid mode.");
		}

		scanner.close();
	}
}
