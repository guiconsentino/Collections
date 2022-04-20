package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Guilherme");
		usuarios.put(2, "Gabriel");
		usuarios.put(3, "Gustavo");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet()); // chave
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(2)); // retorna valor booleano
		System.out.println(usuarios.containsValue("Guilherme"));

		System.out.println(usuarios.get(3));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		for (String nomes : usuarios.values()) {
			System.out.println(nomes);
		}
        
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey()+ "----->");
			System.out.println(registro.getValue());
		}
        
	}
}
