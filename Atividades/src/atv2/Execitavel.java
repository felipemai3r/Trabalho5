 package atv2;

public class Execitavel {
	public static void main(String[] args) {
		
		Livro livro = new Livro(2,"Demostração de texto", "Felipe Maier");
		System.out.println(livro);
		System.out.println("\n");
		
		CD cd1 = new CD(12,"album novo","local",(float)(1.89),21,"papapa","o novo");
		System.out.println(cd1);
		System.out.println("\n");
		
		VHS vhs1 = new VHS(12,"fofa","fora",(float)24.2,"VHS Dom");
		System.out.println(vhs1);
		System.out.println("\n");
	
	}
}
