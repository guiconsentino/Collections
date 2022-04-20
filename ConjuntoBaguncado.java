package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // converte aut. double -> Double
		conjunto.add(1);   // int -> Integer
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("teste"); //string -> String 
		conjunto.add('x');//char -> Character
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste"); //ENTROU NO CONJUNTO POR SER DIFERENTE
		                       //T maiusculo diferente da linha 14
		conjunto.add('x');     //não entrou no conjunto por ser igual a linha 15

		System.out.println(conjunto.size());

	//	System.out.println(conjunto.remove(1)); //retorna um valor booleano 
	   System.out.println(conjunto.remove("Teste")); //retorna um valor booleano 
	   
	   System.out.println(conjunto.size()); //apos remover "Teste" do conjunto
	                                        //foi atualizado a quantidade de obj 
	   
	   HashSet nums = new HashSet();
	   
	   nums.add(1);  
	   nums.add(2);  
	   nums.add(3);
	   
	   System.out.println(nums);
	   System.out.println(conjunto);
	   
	  // conjunto.addAll(nums); //uniao entre dois conjuntos 	
	   conjunto.retainAll(nums);
	   System.out.println(conjunto);
	
	conjunto.clear();
	System.out.println(conjunto);
	
	
	}
}
