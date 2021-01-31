package Atv1;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estadoCivil;

	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, String endereco) {
		super(nome,endereco);
	}
	
	public PessoaFisica(String cpf, String estadoCivil,String nome, String endereco) {
		super(nome,endereco);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length()> 0)
			this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		if(estadoCivil.length()> 0)
			this.estadoCivil = estadoCivil;
	}
	
	
	@Override 
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append(", getEstadoCivil()=");
		builder.append(getEstadoCivil());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}