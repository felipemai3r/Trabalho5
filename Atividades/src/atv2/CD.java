package atv2;

public class CD extends Midia {
	private int faixas;
	private String artista;
	private String album;
	

	public CD(int Codigo, String Descricao, String Gravadora, float Duracao, int Faixas, String Artista, String Album) {
		super(Codigo,Descricao,Gravadora,Duracao);
		setFaixas(Faixas);
		setArtista(Artista);
		setAlbum(Album);
	}
	public CD(int Codigo, String Descricao, String Gravadora, float Duracao) {
		super(Codigo,Descricao,Gravadora,Duracao);
	
	}
	public CD(){
		super();
	}
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
