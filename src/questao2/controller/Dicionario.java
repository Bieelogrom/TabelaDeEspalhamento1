package questao2.controller;

import questao2.model.Lista;
import questao2.model.Morador;

public class Dicionario {
	Lista[] tabelaHashDicionario;
	
	public Dicionario() {
		tabelaHashDicionario = new Lista[10];
		inicializarTabelaHash();
	}

	private void inicializarTabelaHash() {
		int tamanho = tabelaHashDicionario.length;
		for(int i = 0; i < tamanho; i++) {
			tabelaHashDicionario[i] = new Lista();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void cadastrarMorador(Morador novoMorador) throws Exception {
		int posicao = novoMorador.hashCode();
		tabelaHashDicionario[posicao].addLast(novoMorador);
	}
	
	public Morador consultarMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = tabelaHashDicionario[posicao].size();
		for(int i = 0; i < tamanho; i++) {
			Morador moradorAuxiliar = (Morador) tabelaHashDicionario[posicao].get(i);
			if(moradorAuxiliar.getNomeDoMorador().equals(morador.getNomeDoMorador())) {
				morador.setModeloDoCarro(moradorAuxiliar.getModeloDoCarro());
				morador.setCodDoCarro(moradorAuxiliar.getCodDoCarro());
				morador.setPlacaDoCarro(moradorAuxiliar.getPlacaDoCarro());
				break;
			}
		}
		if(morador.getNomeDoMorador() == null) {
			throw new Exception("Não encontrado!");
		}
		return morador;
	}
	
	public void excluirMorador(Morador morador) throws Exception{
		int posicao = morador.hashCode();
		int tamanho = tabelaHashDicionario[posicao].size();
		for(int i = 0; i < tamanho; i++) {
			Morador moradorAuxiliar = (Morador) tabelaHashDicionario[posicao].get(i);
			if(moradorAuxiliar.getNomeDoMorador().equals(morador.getNomeDoMorador())) {
				tabelaHashDicionario[posicao].remove(i);
				break;
			}
		}
	}
}
