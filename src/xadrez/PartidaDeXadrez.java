package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}

	
	
	public PeçasXadrez[][]getPeças(){
		PeçasXadrez[][] mat = new PeçasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (PeçasXadrez) tabuleiro.peças(i,j);	}
			}
		return mat;
	}
}
