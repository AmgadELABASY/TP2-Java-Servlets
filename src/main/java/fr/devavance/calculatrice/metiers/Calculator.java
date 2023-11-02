package fr.devavance.calculatrice.metiers;

public class Calculator {
	private String s_operande_1;
	private String s_operande_2;
	
	public String getOperande1() {
		return s_operande_1;
	}
	public void setOperande1(String s_operande_1) {
		this.s_operande_1 = s_operande_1;
	}
	public String getOperande2() {
		return s_operande_2;
	}
	public void setOperande2(String s_operande_2) {
		this.s_operande_2 = s_operande_2;
	}
	
	public static double add(String s_operande_1, String s_operande_2) throws NumberFormatException {
		double op1 = Double.parseDouble(s_operande_1);
		double op2 = Double.parseDouble(s_operande_2);
		return op1+op2;
	}
	public static double soustraction(String s_operande_1, String s_operande_2) throws NumberFormatException {
		double op1 = Double.parseDouble(s_operande_1);
		double op2 = Double.parseDouble(s_operande_2);
		return op1-op2;
	}
	public static double multiplication(String s_operande_1, String s_operande_2) throws NumberFormatException {
		double op1 = Double.parseDouble(s_operande_1);
		double op2 = Double.parseDouble(s_operande_2);
		return op1*op2;
	}
	public static double division(String s_operande_1, String s_operande_2) throws NumberFormatException, ArithmeticException {
		double op1 = Double.parseDouble(s_operande_1);
		double op2 = Double.parseDouble(s_operande_2);
		return op1/op2;
	}
	
	

}
