package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportamento {

	public static void main(String[] args) {

		Set<String> listaAprovados = new HashSet<String>(); // "<> METODO COMPORTADO!"
		listaAprovados.add("pamonha"); // SO POSSO ADICIONAR STRING!
		listaAprovados.add("apaminondas");
		listaAprovados.add("ribamar");
		listaAprovados.add("sidmar");
		listaAprovados.add("silas");

		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		

	Set<Integer> numeros = new HashSet<Integer>();
	numeros.add(1);
	numeros.add(2);
	numeros.add(3);
	numeros.add(4);
    
	for(int n: numeros) {
		System.out.println(n);
	}

}
}