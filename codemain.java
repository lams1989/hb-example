package calculator.en.casa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu =-1;
		
		while(menu!=0 ){	
		System.out.println("digite la primera variable: ");
		int a = entrada.nextInt();
		System.out.println("digite la segunda variable: ");
		int b = entrada.nextInt();
		System.out.println(getMenu());
		menu = entrada.nextInt();		
	
		
		Calculator calculo = new Calculator();
	
			switch (menu){
			case 1:
			System.out.println("" + a + " + " + b + " = " + calculo.Suma(a, b)+ "\n\n");
			break;
		
			case 2: 
			System.out.println("" + a + " - " + b + " = " + calculo.resta(a, b)+ "\n\n");
			break;
		
			case 3: 
			System.out.println("" + a + " * " + b + " = " + calculo.multiplicacion(a, b)+ "\n\n");
			break;
		
			case 4: 
			System.out.println("" + a + " / " + b + " = " + calculo.division(a, b)+ "\n\n");
			break;
			
			case 0:
			break;
			
			default:
				System.out.println("opccion no valida");
		
			
		}
			
		}
		
		System.out.println("Adios...");
		
		entrada.close();
	}

	public static String getMenu() {
		String menu = "M E N U  D E  L A  C A L C U L A D O R A\n\n";
		menu += "1. Create new user \n";
		menu += "2. show all users \n";
		menu += "3. Delete user \n";
		menu += "4. update user \n";
		menu += "";
		menu += "0. SALIR \n."
		menu += "Escoja una opcion.";
		return menu;
	}
}
