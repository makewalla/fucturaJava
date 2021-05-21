package Entitities;

public class Conta {
	
	// 0 tudo isso aqui abaixo s�o os atributos da classe criar (classe pessoa).
	// estrutura de acesso - public
	// tipo da variavel - String, int, double...
	// nome do atributo - nome, idade, peso, altura...
	public String nome;
	public int limite;
	public double valor1;
	public double valor2;
	public double saldo;
	private double extrato;

	//3 Construtores
	//responsavel por criar um objeto em memoria que inicializa os atributos de uma classe o construtor tem por obriga��o
	//for�ar a obrigatoriedade, ex: ao criar uma classe conta de banco � obrigatorio que seja informado o nome do dono da conta
	//o numero da conta etc..
	// atalho para criar construtor >bot�o direito>soucer>generate construtor using field
	public Conta() {} 	//importante colcolar um construtor vazio para fazer que no main consiga se criar um objeto sem parametros
	
	public Conta(String nome, int saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	// 1 o public void Andar () � a assinatura do metodo
	//assinatura 
		// modificador de acesso  - public
		// retorno - void
		// nome - Andar 
		// lista de paramentros - () - nesse caso os parametros neste caso esta vazio
		
		//corpo
		//processo de dados e regra de negocio - pode ser utilizado os atributos da classe ou criar novas variaveis locais
		//variavel local - se houver cria��o de uma variavel dentro desse corpo do metodo essa variavel sera conhecida como local e s� sera usada no emtdtodo
	public void andar () { // tudo aqui depois da assinatura � o corpo do metodo
		System.out.println("Andando");	
	}
	public String acao () {
		return ("passear");
	}
	
	//2 no parametro � criado uma variavel que espera uma entrada de onde se especifica o tipo e nome da variavel
	public void depositar(double valor) {
		//o this � utilizado quando � utilizado quando h� ambiguidade e basicamente � utilizado em todos os corpos de metodo
		//o this foi utilizado para informar o saldo utilizado � de la de cima dos atributos da classe
		// this informa que � utilizado alguma variavel do atributo da classe
		this.saldo += valor;
		System.out.println("o valor R$"+valor+" foi depositado");
		System.out.println("o saldo atual � de: R$"+saldo+"\n");
	}	
	public void sacar(double valor) {

		this.saldo -= valor;
		System.out.println("o valor R$"+valor+" retirado");
		System.out.println("o saldo atual � de R$"+saldo+"\n");
		
		}
	
	public void transferir(double valor, Conta x) {
		if (this.saldo >= valor) {
			System.out.println("Resumo da conta onde foi feita a transferencia �:");
			sacar(valor);
			System.out.println("Resumo da conta favorecida �:");
			x.depositar(valor);
		}else
			System.out.println("ERROR: valor da transferencia maior que o saldo");
	}
	
	
	//4 botao direito>source>geranate toString
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", limite=" + limite + ", valor1=" + valor1 + ", valor2=" + valor2 + ", saldo="
				+ saldo + "]";
	}
	//5 encapsulamento 
	//modificadores de acesso
	//public - pode ser acessado de qualquer lugar e qualquer entidade na classe que pertence -acessa: class, pakage, subclasse,world(tudo)
	//private - os membros da classe s�o definidos como n�o podem ser acessados por nenhuma classe -acessa: class
	//protected - torna o membro acessivel as classes do mesmo pacoter atraves de heran�a -acessa: class, pakage, subclasse
	//static - indentifica que atributos ou metodos n�o pertencem a uma instancia e sim a uma classe -acessa: class, pakage
	// por padr�o todos os atriutos definidos de uma classe deve ser privado - private 
	// para acessar atributos privados deve se usar get e set
	//get prefixo utilizado no metodo que pertimite a consultar do valor de um atributo espefico - buscar um valor
	//set prefixo utilizado no metodo que pertimite a altera�ao do valor de um atributo espefico - atribuir um valor

	
	//6 bot�o direito> source> gerenate getters e setters
	public double getextrato() {
		return extrato;
	}

	public void setextrado(double extrato) {
		this.extrato = extrato;
	}
	
	

	
}
