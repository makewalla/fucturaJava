package exercicios;

import java.util.Scanner;

public class _02_nomeNVezesFor {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont=0, i=0;
		String nome;
		
		System.out.println("Informe seu nome");
		nome = sc.nextLine();
		System.out.println("Informe quantas vezes você quer que seu programa se repita");
		i =sc.nextInt();
		
		while(cont<i) {
			System.out.println(nome);
			cont++;
			
		}
		sc.close();
	}
	

}
