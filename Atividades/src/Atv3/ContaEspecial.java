package Atv3;

public class ContaEspecial extends Conta {
	private int diaSemJuros;
	private double limite;
	
	public ContaEspecial() {
		super();
	}
	public ContaEspecial(String Banco, int Agencia, int NumeroConta, double Saldo) {
		super(Banco, Agencia, NumeroConta, Saldo);
	}
	public ContaEspecial(String Banco, int Agencia, int NumeroConta, double Saldo,int DiasSemJuros, double Limite) {
		super(Banco, Agencia, NumeroConta, Saldo);
		setDiaSemJuros(DiasSemJuros);
		setLimite(Limite);
	}
	
	
	public int getDiaSemJuros() {
		return diaSemJuros;
	}
	public void setDiaSemJuros(int diaSemJuros) {
		this.diaSemJuros = diaSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diaSemJuros=");
		builder.append(diaSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
