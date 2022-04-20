package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String>livro = new ArrayDeque<String>();
	 
		livro.add("senhor dos aneis");
		livro.push("harry poter");
		livro.push("don quixote");
		
		System.out.println(livro.peek());
		System.out.println(livro.element());
		
		for(String livros : livro) {
			System.out.println(livros);
		}
		
		System.out.println("removeu " + livro.pop());
		System.out.println("removeu " + livro.poll());
		System.out.println("removeu " + livro.poll());
		System.out.println("removeu " + livro.poll());
		System.out.println("removeu " + livro.poll());
	//	System.out.println("removeu " + livro.pop());
		
//        livro.size();
//        livro.contains();
//        livro.clear();
//        livro.isEmpty();
		
	}
	
}
