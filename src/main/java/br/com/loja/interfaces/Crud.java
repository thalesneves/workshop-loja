package br.com.loja.interfaces;

import java.util.List;

public interface Crud<T> {
	
	public void salvar(T objeto);

	public void excluir(T objeto);

	public List<T> filtrar(T objeto);

	public List<T> filtrarTodos();

	public T filtrarPorId(Long id);

}
