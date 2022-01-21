package xadrez;

import tabuleiro.Peças;
import tabuleiro.Tabuleiro;

public abstract class PeçasXadrez extends Peças{
	private Cor cor;

	public PeçasXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	

}
