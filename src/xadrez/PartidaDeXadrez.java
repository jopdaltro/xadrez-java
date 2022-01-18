package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pe�as.Rei;
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
	
	private void colocarNovaPe�a(char coluna, int linha, Pe�asXadrez pe�a) {
		tabuleiro.ColocarPe�a(pe�a, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		colocarNovaPe�a('a',1,new Torre(tabuleiro,Cor.BRANCAS));
		colocarNovaPe�a('e',8,new Rei(tabuleiro,Cor.PRETAS));
	;
	}
}
