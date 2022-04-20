package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Jamil"));
		usuarios.add(new Usuario ("Guilherme"));
		usuarios.add(new Usuario("Glauber"));
		
		boolean resultado = usuarios.contains(new Usuario ("Jamil"));
		System.out.println(resultado);
		

	}

}
