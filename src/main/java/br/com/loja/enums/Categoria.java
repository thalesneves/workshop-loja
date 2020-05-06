package br.com.loja.enums;

public enum Categoria {
	
	LIVROS("001"),
	GAMES("002"),
	ELETRODOMESTICOS("003"),
	INFORMATICA("004"),
	CELULARES("005"),
	BRINQUEDOS("006"),
	PERFUMARIA("007"),
	MOVEIS("008");
	
	private String codigo;
	
	private Categoria(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

}
