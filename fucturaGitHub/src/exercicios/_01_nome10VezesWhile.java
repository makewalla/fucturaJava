package exercicios;

import java.util.Scanner;

public class _01_nome10VezesWhile {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int i=0;
		System.out.println("Informe seu nome: ");
		nome =sc.nextLine();
		while(i<=10) {
			System.out.println(nome);
			i++;
			
		}
		sc.close();
		
		
		
	}
}
