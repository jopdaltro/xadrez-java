package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peças[][] peças;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peças[linhas][colunas];
		
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peças peças(int linha, int coluna) {
		return peças[linha][coluna];
	}
	
	public Peças peças(Posicao posicao) {
		return peças[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void ColocarPeça(Peças peça, Posicao posicao) {
		peças[posicao.getLinha()][posicao.getColuna()] = peça;
		peça.posicao = posicao;
	}
	
	
}
