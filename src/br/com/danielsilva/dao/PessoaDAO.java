package br.com.danielsilva.dao;

import java.util.List;
import br.com.danielsilva.model.Pessoa;

public interface PessoaDAO {

	public void cadastrar(Pessoa pessoa);
	public List<Pessoa> listaTodas();
	public Pessoa buscar(Pessoa pessoa);
	public void apagar(Pessoa pessoa);
	
}
