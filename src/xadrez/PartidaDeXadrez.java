package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
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
	
	private void colocarNovaPeça(char coluna, int linha, PeçasXadrez peça) {
		tabuleiro.ColocarPeça(peça, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		colocarNovaPeça('a',1,new Torre(tabuleiro,Cor.BRANCAS));
		colocarNovaPeça('e',8,new Rei(tabuleiro,Cor.PRETAS));
	;
	}
}
