package Atv3;

public class Executavel {

	public static void main(String[] args) {
		
		ContaSimples contS = new ContaSimples("Banco bom", 1988, 0111, 1200, 1300);
		ContaEspecial contE = new ContaEspecial("Banco bom", 1988, 0111, 1200, 23, 1300);
		
		System.out.println(contS);
		System.out.println("Deposito Poupança:");
		contS.depositoPoupanca(165);
		System.out.println(contS);
		System.out.println("Deposito :");
		contS.deposito(165);
		System.out.println(contS);
		System.out.println("Saque: 180");
		contS.saque(180);
		System.out.println(contS);
		System.out.println("Saque Deposito: 180");
		contS.saquePoupanca(180);
		System.out.println(contS);
		
		System.out.println("\n---Conta especial");
		System.out.println(contE);
		System.out.println("Depositado:");
		contE.deposito(165);
		System.out.println(contE);
		

	}

}
