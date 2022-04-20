package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String>Fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila
		//diferen�a � quando a fila esta cheia
		
		Fila.add("golimar"); //retorna false quando esta cheia
		Fila.offer("catatau"); //lan�a uma exce��o
		Fila.add("sabirila");
		Fila.offer("josias");
		Fila.add("marrom");
		Fila.offer("biruleibe");
		
		//diferen�a � quando a fila esta vazia
		System.out.println(Fila.peek()); //retorna null se a fila estiver vazia
		System.out.println(Fila.peek());
		System.out.println(Fila.element()); //lan�a uma exce��o
		System.out.println(Fila.element());

		// peek e element-> obter o proximo elemento da fila sem remover
				
//		System.out.println(Fila.size());
//		System.out.println(Fila.isEmpty());
//		System.out.println(Fila.clear());
		
		
		//poll e remove -> obter o proximo elemento da fila e remove
        System.out.println(Fila.poll());	
        System.out.println(Fila.poll());		
        System.out.println(Fila.poll());		
        System.out.println(Fila.remove());		
        System.out.println(Fila.poll());		
        System.out.println(Fila.poll());		
        System.out.println(Fila.poll());		
        System.out.println(Fila.poll());		
		
		
		
		
		
	}
	
	
}
