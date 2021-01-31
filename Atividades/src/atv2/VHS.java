package atv2;

public class VHS extends Midia {
	private String titulo;

	public VHS() {
		super();
	}
	
	public VHS(int Codigo, String Descricao, String Gravadora, float Duracao,String Titulo) {
		super(Codigo,Descricao,Gravadora, Duracao);
		setTitulo(Titulo);
	}
	public VHS(int Codigo, String Descricao, String Gravadora, float Duracao) {
		super(Codigo,Descricao,Gravadora, Duracao);
		
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() > 0)
			this.titulo = titulo;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	 
	
}
