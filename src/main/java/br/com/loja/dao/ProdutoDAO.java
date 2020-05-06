package br.com.loja.dao;

import java.util.List;

import br.com.loja.interfaces.Crud;
import br.com.loja.model.Produto;

public class ProdutoDAO implements Crud<Produto> {

	@Override
	public void salvar(Produto objeto) {}

	@Override
	public void excluir(Produto objeto) {}

	@Override
	public List<Produto> filtrar(Produto objeto) { return null; }

	@Override
	public List<Produto> filtrarTodos() { return null; }

	@Override
	public Produto filtrarPorId(Long id) { return null; }

}
