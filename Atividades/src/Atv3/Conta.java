package Atv3;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
	public Conta(String Banco, int Agencia, int NumeroConta, double Saldo) {
		setBanco(Banco);
		setAgencia(Agencia);
		setNumeroconta(NumeroConta);
		setSaldo(Saldo);
	}
	public Conta() {
	}
	
	// Geter e Seters 
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean deposito(double valor) {
		boolean Efetuacao = false;
		
		if(valor > 0 ) {
			double valorT = getSaldo() + valor;
			
			setSaldo(valorT);
			Efetuacao = true ;
		}
		
		return Efetuacao;
	}
	public boolean saque(double valor) {
		boolean Efetuacao = false;
		
		if(valor > 0 && getSaldo() >= valor) {
			double valorT = getSaldo() - valor;
			
			setSaldo(valorT);
			Efetuacao = true ;
		}
		
		return Efetuacao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
