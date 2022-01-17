package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Pe�as[][] pe�as;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�as[linhas][colunas];
		
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
	
	public Pe�as pe�as(int linha, int coluna) {
		return pe�as[linha][coluna];
	}
	
	public Pe�as pe�as(Posicao posicao) {
		return pe�as[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void ColocarPe�a(Pe�as pe�a, Posicao posicao) {
		pe�as[posicao.getLinha()][posicao.getColuna()] = pe�a;
		pe�a.posicao = posicao;
	}
	
	
}
