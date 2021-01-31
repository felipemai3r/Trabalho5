package atv2;

public class Livro extends Item {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor.length() > 0)
			this.autor = autor;
	}

	public Livro(int Codigo, String Descricao,String Autor) {
		super(Codigo, Descricao);
		setAutor(Autor);
	}
	
	public Livro() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}




	
	
}
