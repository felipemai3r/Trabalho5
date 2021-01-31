package Atv1;

public class Executavel {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Felipe Maier", "rua guanabara n 135","110.000.111-32","soltero");
		PessoaJuridica pj = new PessoaJuridica("LojaA","local x ","111.11.111.111-9","ME");
				
		System.out.println(pf);
		System.out.println(pj);

	}

}
