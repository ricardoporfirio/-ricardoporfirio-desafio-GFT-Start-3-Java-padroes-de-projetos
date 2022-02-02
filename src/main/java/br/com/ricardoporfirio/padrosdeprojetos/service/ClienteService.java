package br.com.ricardoporfirio.padrosdeprojetos.service;

import br.com.ricardoporfirio.padrosdeprojetos.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
