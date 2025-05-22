package questao2.model;

import java.util.Objects;

public class Morador {
	private int numeroDoApartamento;
	private String nomeDoMorador;
	private String modeloDoCarro;
	private String codDoCarro;
	private String placaDoCarro;
	
	public Morador(int numeroDoApartamento, String nomeDoMorador, String modeloDoCarro, String codDoCarro,
			String placaDoCarro) {
		super();
		this.numeroDoApartamento = numeroDoApartamento;
		this.nomeDoMorador = nomeDoMorador;
		this.modeloDoCarro = modeloDoCarro;
		this.codDoCarro = codDoCarro;
		this.placaDoCarro = placaDoCarro;
	}
	
	public Morador(int numeroDoApartamento, String nomeDoMorador) {
	    this.numeroDoApartamento = numeroDoApartamento;
	    this.nomeDoMorador = nomeDoMorador;
	}

	
	public int getNumeroDoApartamento() {
		return numeroDoApartamento;
	}
	public void setNumeroDoApartamento(int numeroDoApartamento) {
		this.numeroDoApartamento = numeroDoApartamento;
	}
	public String getNomeDoMorador() {
		return nomeDoMorador;
	}
	public void setNomeDoMorador(String nomeDoMorador) {
		this.nomeDoMorador = nomeDoMorador;
	}
	public String getModeloDoCarro() {
		return modeloDoCarro;
	}
	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}
	public String getCodDoCarro() {
		return codDoCarro;
	}
	public void setCodDoCarro(String codDoCarro) {
		this.codDoCarro = codDoCarro;
	}
	public String getPlacaDoCarro() {
		return placaDoCarro;
	}
	public void setPlacaDoCarro(String placaDoCarro) {
		this.placaDoCarro = placaDoCarro;
	}
	
	@Override
	public int hashCode() {
		double andar = numeroDoApartamento / 100;
		return (int) (andar % 10);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(codDoCarro, other.codDoCarro) && Objects.equals(modeloDoCarro, other.modeloDoCarro)
				&& Objects.equals(nomeDoMorador, other.nomeDoMorador)
				&& numeroDoApartamento == other.numeroDoApartamento && Objects.equals(placaDoCarro, other.placaDoCarro);
	}
	
	
}
