package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.peças.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}

	
	
	public PeçasXadrez[][]getPeças(){
		PeçasXadrez[][] mat = new PeçasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (PeçasXadrez) tabuleiro.peças(i,j);	}
			}
		return mat;
	}
	
	private void configuracaoInicial() {
		tabuleiro.ColocarPeça(new Torre(tabuleiro, Cor.BRANCAS), new Posicao(3,3));
		tabuleiro.ColocarPeça(new Torre(tabuleiro, Cor.BRANCAS), new Posicao(3,3));
	}
}
