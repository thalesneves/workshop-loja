package br.com.loja.abstracts;

public abstract class AbstractJSF {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	@Override
	public abstract String toString();

}
