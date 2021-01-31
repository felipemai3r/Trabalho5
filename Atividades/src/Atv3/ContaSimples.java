package Atv3;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public ContaSimples() {
		super();
	}
	
	public ContaSimples(String Banco, int Agencia, int NumeroConta, double Saldo, double SaldoPoupanca) {
		super(Banco, Agencia, NumeroConta, Saldo);
		setSaldoPoupanca(SaldoPoupanca);
	}
	
	public ContaSimples(String Banco, int Agencia, int NumeroConta, double Saldo) {
		super(Banco, Agencia, NumeroConta, Saldo);
	}


	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		boolean Efetuacao = false;
		
		if(valor > 0 ) {
			double valorT = getSaldoPoupanca() + valor;
			
			setSaldoPoupanca(valorT);
			Efetuacao = true ;
		
		}
		
		return Efetuacao;
	}
	public boolean saquePoupanca(double valor) {
		boolean Efetuacao = false;
		
		if(valor > 0 && getSaldo() >= valor) {
			double valorT =  getSaldoPoupanca()  - valor;
			
			setSaldoPoupanca(valorT);
			Efetuacao = true ;
		}
		
		return Efetuacao;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
