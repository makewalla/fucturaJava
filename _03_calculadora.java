package exercicios;

import java.util.Scanner;

public class _03_calculadora {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1=0, num2=0;
		int opcao;
		System.out.println("Escolha uma opera��o\n1 - para somar\n2 - para subtrair\n"
				+ "3 - para divis�o\n4 - para multiplica��o\n5 - para saber se � divisivel por 3\n"
				+ "6 - para saber se � par ou impar\n7 - para saber a raiz\n8 - para saber a potencia\n");
		opcao = sc.nextInt();

		switch(opcao) {
		
		case 1:	
			System.out.println("informe o primeiro numero:");
			num1 = sc.nextDouble();
			System.out.println("informe o segundo numero:");
			num2 = sc.nextDouble();
			System.out.println("a soma de "+num1+" e "+num2+" �: " + (num1+num2));
			break;	
		case 2:		
			System.out.println("informe o primeiro numero:");
			num1 = sc.nextDouble();
			System.out.println("informe o segundo numero");
			num2 = sc.nextDouble();
			System.out.println("a subtra��o de "+num1+" e "+num2+" �: " + (num1-num2));
			break;			
		case 3:
			System.out.println("informe o primeiro numero:");
			num1 = sc.nextDouble();
			System.out.println("informe o segundo numero:");
			num2 = sc.nextDouble();
			System.out.println("a divis�o entre "+num1+" e "+num2+" �: "+ (num1/num2));
			break;
		case 4:
			System.out.println("Informe o primeiro numero");
			num1 = sc.nextDouble();
			System.out.println("informe o segundo numero");
			num2 = sc.nextDouble();
			System.out.println("a multiplica��o entre "+num1+" e "+num2+" �: " + (num1*num2));
			break;
		case 5:
			System.out.println("informe o numero que deseja saber se � divisivel por 3:0");
			num1 = sc.nextDouble();
			if(num1%3==0) {
				System.out.println("o numero "+num1+" � divisivel por 3");
			}else
				System.out.println("o numero "+num1+" n�o � divisivel por 3");
			break;
		case 6:
			System.out.println("informe um numero para saber se ele � impar ou para");
			num1 =(int) sc.nextDouble();
			if(num1%2==0) {
				System.out.println("o numero"+num1+" � par");
			}else {
				System.out.println("o numero "+num1+" � impar");
			}
			break;
		case 7:
			System.out.println("informe o numero que deseja saber a raiz ");
			num1 = sc.nextDouble();
			if ((int)(Math.sqrt(num1))==(Math.sqrt(num1))) {
			System.out.println("o numero "+num1+" tem raiz quadrada");
			}else{
			System.out.println("o numero "+num1+" n�o tem raiz quadrada");	
			}
			break;
		case 8:
			System.out.println("informe o numero da base ");
			num1 = sc.nextDouble();
			System.out.println("informe o expoente:");
			num2 = sc.nextDouble();
			if(num1!=0) {
				System.out.println("o numero "+num1+" elevado a "+num2+" � igual a: "+(Math.pow(num1,num2)));				
			}else {
				System.out.println("a base n�o pode ser 0");
			}			
		sc.close();
		}
		
	}

}
