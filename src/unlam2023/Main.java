package unlam2023;

import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		Calculadora calcu = new Calculadora();
		
		System.out.println("Bienvenido a la Calculadora!");
		
		int opcion = 0;
		double operador1 = 0;
		double operador2 = 0;
		
		do {
			menuCalculadora();
			System.out.println("Ingrese una opcion: ");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1: 
				System.out.println("Ingrese un numero: ");
				operador1 = teclado.nextDouble();
				System.out.println("Ingrese un numero: ");
				operador2 = teclado.nextDouble();
				calcu.setOperador1(operador1);
				calcu.setOperador2(operador2);
				calcu.sumar();
				System.out.println("El resultado de la suma es: " + calcu.getResultado());
				break;
			case 2:
				System.out.println("Ingrese un numero: ");
				operador1 = teclado.nextDouble();
				System.out.println("Ingrese un numero: ");
				operador2 = teclado.nextDouble();
				calcu.setOperador1(operador1);
				calcu.setOperador2(operador2);
				calcu.restar();
				System.out.println("El resultado de la resta es: " + calcu.getResultado());
				break;
			case 3:
				System.out.println("Ingrese un numero: ");
				operador1 = teclado.nextDouble();
				System.out.println("Ingrese un numero: ");
				operador2 = teclado.nextDouble();
				calcu.setOperador1(operador1);
				calcu.setOperador2(operador2);
				calcu.multiplicar();
				System.out.println("El resultado de la multipicacion es: " + calcu.getResultado());
				break;
			case 4:
				System.out.println("Ingrese un numero: ");
				operador1 = teclado.nextDouble();
				System.out.println("Ingrese un numero: ");
				operador2 = teclado.nextDouble();
				calcu.setOperador1(operador1);
				calcu.setOperador2(operador2);
				calcu.dividir();
				System.out.println("El resultado de la division es: " + calcu.getResultado());
				break;
			case 5:
				System.out.println("Ingrese un numero: ");
				operador1 = teclado.nextDouble();
				System.out.println("Ingrese un numero: ");
				operador2 = teclado.nextDouble();
				calcu.setOperador1(operador1);
				calcu.setOperador2(operador2);
				calcu.resto();
				System.out.println("El resultado del resto es: " + calcu.getResultado());
				break;
			case 6:
				System.out.println("FIN DEL PROGRAMA");
				break;
			default:
				System.err.println("Ingrese otra opcion - ERROR");
				break;
			}
		}while(opcion != 6);
	}
	
		public static void menuCalculadora() {
			System.out.println("---------------------------");
			System.out.println("Presione |1| para sumar");
			System.out.println("Presione |2| para restar");
			System.out.println("Presione |3| para multiplicar");
			System.out.println("Presione |4| para dividir");
			System.out.println("Presione |5| para resto");
			System.out.println("Presione |6| para SALIR");
			System.out.println("---------------------------");
		}
}