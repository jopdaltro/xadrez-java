package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pe�as.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}

	
	
	public Pe�asXadrez[][]getPe�as(){
		Pe�asXadrez[][] mat = new Pe�asXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (Pe�asXadrez) tabuleiro.pe�as(i,j);	}
			}
		return mat;
	}
	
	private void configuracaoInicial() {
		tabuleiro.ColocarPe�a(new Torre(tabuleiro, Cor.BRANCAS), new Posicao(3,3));
		tabuleiro.ColocarPe�a(new Torre(tabuleiro, Cor.BRANCAS), new Posicao(3,3));
	}
}
