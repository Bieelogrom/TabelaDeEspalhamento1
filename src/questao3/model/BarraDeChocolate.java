package questao3.model;

import java.util.Objects;

public class BarraDeChocolate {
	private int comprimento;
	private int largura;
	private int altura;
	private int volume;
	
	public BarraDeChocolate(int comprimento, int largura, int altura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		this.volume = comprimento * largura * altura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		if(volume > 50 && volume < 60) return 0;
		if(volume > 100 && volume < 110) return 1;
		if(volume > 150 && volume < 165) return 2;
		if(volume > 200 && volume < 220) return 3;
		if(volume > 260 && volume < 280) return 4;
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BarraDeChocolate other = (BarraDeChocolate) obj;
		return altura == other.altura && comprimento == other.comprimento && largura == other.largura;
	}

	@Override
	public String toString() {
		return "BarraDeChocolate [comprimento=" + comprimento + ", largura=" + largura + ", altura=" + altura + "]";
	}

}
