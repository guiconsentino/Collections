package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> Lista = new ArrayList<>();
		
		Lista.add(new Usuario("GUILHERME"));
		Lista.add(new Usuario("GABRIEL"));
		Lista.add(new Usuario("GIOVANNA"));
		Lista.add(new Usuario("KARINA"));
		
		System.out.println(Lista.get(3));
        System.out.println(Lista.remove(3));
		System.out.println(Lista.remove(new Usuario("GUILHERME")));
        System.out.println("tem?: " + Lista.contains(new Usuario("GIOVANNA")));
		
		for(Usuario u: Lista) {
           System.out.println(u.toString());
           
		}
	}
}
