package br.com.danielsilva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String args[]) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Luiz Flavio");
		nomes.add("Flavio");
		nomes.add("Heider");
		
		imprime(nomes);

		nomes.add("Alonso");

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}

		if (nomes.contains("Heider")) {
			System.out.println("Existe o nome na lista");
		} else {
			System.out.println("Não existe nome na lista");
		}
		
		System.out.println(nomes.indexOf("Heider"));
		System.out.println(nomes.indexOf("Renato Furlar"));
		
		System.out.println("Antes de remover");
		imprime(nomes);
		nomes.remove(nomes.indexOf("Heider"));
		System.out.println("Depois de remover");
		
		imprime(nomes);
		
		Collections.sort(nomes);
		
		imprime(nomes);
	}
	
	private static void imprime(List<String> nomes){
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
}
