package unlam2023;

public class Calculadora {
	
	private double resultado;
	private double operador1;
	private double operador2;
	
	public Calculadora() {
		
	}
	
	public double sumar() {
		resultado = operador1 + operador2;
		return resultado;
	}
	
	public double restar() {
		resultado = operador1 - operador2;
		return resultado;
	}
	
	public double multiplicar() {
		resultado = operador1 * operador2;
		return resultado;
	}
	
	public double dividir() {
		resultado = operador1 / operador2;
		return resultado;
	}
	
	public double resto() {
		resultado = operador1 % operador2;
		return resultado;
	}

	public double getOperador1() {
		return operador1;
	}

	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}

	public double getOperador2() {
		return operador2;
	}

	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
