package xadrez;

import tabuleiro.Pe�as;
import tabuleiro.Tabuleiro;

public class Pe�asXadrez extends Pe�as{
	private Cor cor;

	public Pe�asXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	

}
