package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}

	
	
	public Pe�asXadrez[][]getPe�as(){
		Pe�asXadrez[][] mat = new Pe�asXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (Pe�asXadrez) tabuleiro.pe�as(i,j);	}
			}
		return mat;
	}
}
