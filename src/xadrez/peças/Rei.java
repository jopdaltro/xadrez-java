package xadrez.pe�as;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.Pe�asXadrez;

public class Rei extends Pe�asXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}
	
	@Override
	public String toString() {
		return "K";
	}
}
