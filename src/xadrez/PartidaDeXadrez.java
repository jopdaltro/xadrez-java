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
		colocarNovaPeça('c', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('c', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('d', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('e', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('e', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('d', 1, new Rei(tabuleiro, Cor.BRANCAS));

        colocarNovaPeça('c', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('c', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('d', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('e', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('e', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('d', 8, new Torre(tabuleiro, Cor.PRETAS));
	
	}
}
