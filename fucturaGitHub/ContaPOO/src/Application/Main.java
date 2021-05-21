package Application;

//Altere: 
//O m�todo sacar para testar se existe saldo dispon�vel na conta;
//Altere tamb�m o retorno desse m�todo para boolean.
//Crie duas contas distintas: ContaPessoaA e ContaPessoaB;Ap�s a cria��o acima, 
//desenvolva transfer�ncias entre as contas, at� uma das contas ficar sem saldo dispon�vel e 
//imprima no console uma mensagem de erro, informando a falta de saldo da conta).
//OBS: Tudo isso deve ser desenvolvido dentro de um while(true) [loop infinito]
//Criar m�todo para mostrar o saldo da conta.

import java.util.Scanner;

import Entitities.Conta;

public class Main {
	
	public static void main(String[] args) {
		
		int opcao=0, pessoa=0;
		Scanner sc = new Scanner(System.in);
		Conta ContaPessoaA = new Conta();
		Conta ContaPessoaB = new Conta();
		
		while(opcao!=9) {
		System.out.println("informe a op��o desejada:\n1-depositar\n2-sacar\n3transferir\ninforme 9 para finalizar");
		opcao=sc.nextInt();
		if(opcao==1) {
			System.out.println("informe a conta:");
			pessoa=sc.nextInt();
			if(pessoa==1) {
				System.out.println("Conta Pessoa A selecionada");
				System.out.println("informe o valor do deposito:");
				ContaPessoaA.valor1 = sc.nextDouble();
				ContaPessoaA.depositar(ContaPessoaA.valor1);
			}if(pessoa==2) {
				System.out.println("Conta Pessoa B selecionada");
				System.out.println("informe o valor do deposito:");
				ContaPessoaB.valor2 = sc.nextDouble();
				ContaPessoaB.depositar(ContaPessoaB.valor2);
			}if(pessoa!=1&&pessoa!=2) {
				System.out.println("Conta invalida\n");
			}
		}if(opcao==2) {
			System.out.println("informe a conta:");
			pessoa=sc.nextInt();
			if(pessoa==1) {
				System.out.println("Conta Pessoa A selecionada");
				System.out.println("informe o valor do saque:");
				ContaPessoaA.valor1 = sc.nextDouble();
				if(ContaPessoaA.saldo<=ContaPessoaA.valor1) {
					System.out.println("saldo da Conta Pessoa A insuficiente\n");
				}else
				ContaPessoaA.sacar(ContaPessoaA.valor1);
			}if(pessoa==2) {
				System.out.println("Conta Pessoa B selecionada");
				System.out.println("informe o valor do saque:");
				ContaPessoaB.valor2 = sc.nextDouble();
				if(ContaPessoaB.saldo<=ContaPessoaB.valor2) {
					System.out.println("saldo da Conta Pessoa B insuficiente\n");
				}else
				ContaPessoaB.sacar(ContaPessoaB.valor2);
			}if(pessoa!=1&&pessoa!=2) {
				System.out.println("Conta invalida\n");
			}		
		}if(opcao==3) {
			System.out.println("informe a conta:");
			pessoa=sc.nextInt();
			if(pessoa==1) {
				System.out.println("Conta Pessoa A selecionada");
				System.out.println("informe o valor da transferencia");
				ContaPessoaA.valor1 = sc.nextDouble();
				ContaPessoaA.transferir(ContaPessoaA.valor1,ContaPessoaB);
			}if(pessoa==2) {
				System.out.println("Conta Pessoa B selecionada");
				System.out.println("informe o valor da transferencia");
				ContaPessoaB.valor2 = sc.nextDouble();
				ContaPessoaB.transferir(ContaPessoaB.valor2, ContaPessoaA);
			}if(pessoa!=1&&pessoa!=2) {
				System.out.println("Conta invalida\n");
			}		
			
		}
		

		}
		
		
		
		sc.close();
		
	}

}
//Conta p1 = new Conta();//3 o construtor for�a colocar os parametros ao criar o objeto para os atributos da sua classe

		//p1.andar();//1
		//System.out.println("informe o valor de deposito:");
		//p1.valor1 = sc.nextDouble();
		//System.out.println("informe o valor de saque:");
		//p1.valor2 = sc.nextDouble();
		
		//p1.depositar(p1.valor1);//2
		//p1.sacar(p1.valor2);//2
		
		//System.out.println(p1);//4
		
		//p1.setextrado(p1.saldo);//6 set - settando valor - atribuindo valor
		//System.out.println(p1.getextrato()); //6 get - puxar valor - mostrar o valor