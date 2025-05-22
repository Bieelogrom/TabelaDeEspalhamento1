package questao3.controller;

import questao2.model.Lista;
import questao3.model.BarraDeChocolate;

public class Dicionario {
	Lista[] tabelaHashDicionario;
	
	public Dicionario() {
		tabelaHashDicionario = new Lista[6];
		inicializarTabelaHash();
	}

	private void inicializarTabelaHash() {
		int tamanho = tabelaHashDicionario.length;
		for(int i = 0; i < tamanho; i++) {
			tabelaHashDicionario[i] = new Lista();
		}
	}
	
	public void adicionarDocinho(BarraDeChocolate barra) throws Exception {
		int posicao = barra.hashCode();
		tabelaHashDicionario[posicao].addLast(barra);
	}
	
	public void verificarDocinhos() {
		String[] tiposDocinhos = {"bombons", "pavês", "brigadeiros", "bolos", "ovos de páscoa", "Fora da faixa"};
		for(int i = 0; i < 6; i++) {
			int tamanho = tabelaHashDicionario[i].size();
			System.out.println("Podem ser feitos "+tamanho+" "+tiposDocinhos[i]);
		}
	}
}
