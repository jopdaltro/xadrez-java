package tabuleiro;

public class Pe�as {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Pe�as(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	

}
