package tabuleiro;

public class Peças {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peças(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	

}
