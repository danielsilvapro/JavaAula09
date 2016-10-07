package br.com.danielsilva;

import java.util.Collections;
import java.util.List;

import br.com.danielsilva.dao.PessoaDAO;
import br.com.danielsilva.dao.PessoaListDAOImpl;
import br.com.danielsilva.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa assassino = new Pessoa(1, "Okimataro Atiro", "okimataroatiro@gmail.com", "11999938373");
		Pessoa rico = new Pessoa(2, "Takanota Nakasaka", "takanota@gmail.com", "1134543071");
		Pessoa acidentado = new Pessoa(3, "Massaro Miamoto", "massaro", "1131297703");

		PessoaDAO dao = new PessoaListDAOImpl();

		dao.cadastrar(assassino);
		dao.cadastrar(rico);
		dao.cadastrar(acidentado);
		
		dao.apagar(assassino);
		
		List<Pessoa> pessoas = dao.listaTodas();
		
		imprime(dao.listaTodas());
		
		Collections.sort(pessoas);
		
		imprime(pessoas);
		
	}
	public static void imprime(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas){
			System.out.println(pessoa);
		}
	}
}