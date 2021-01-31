package atv2;

public class Midia extends Item {
	private String gravadora;
	private  float duracao;
	
	
	public Midia(int Codigo, String Descricao, String Gravadora, float Duracao) {
		super(Codigo, Descricao);
		setGravadora(Gravadora);
		setDuracao(Duracao);
	}
	public Midia(int Codigo, String Descricao) {
		super(Codigo, Descricao);
	}
	public Midia() {
		super();
	}
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if(gravadora.length() > 0)
			this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		if(duracao > 0.0)
			this.duracao = duracao;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
