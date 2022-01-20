package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Pe�as[][] pe�as;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas< 1 || colunas<1) {
			throw new TabuleiroException("error de cria��o do tabuleiro, precisa ter pelo menos uma linha e uma coluna");
			
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�as[linhas][colunas];
		
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Pe�as pe�as(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("n�o existe essa posicao no tabuleiro");
		}
		return pe�as[linha][coluna];
	}
	
	public Pe�as pe�as(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("n�o existe essa posicao no tabuleiro");
		}
		return pe�as[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void ColocarPe�a(Pe�as pe�a, Posicao posicao) {
		if(temUmaPe�a(posicao)) {
			throw new TabuleiroException("ja existe uam pe�a nessa posi��o " + posicao);
		}
		pe�as[posicao.getLinha()][posicao.getColuna()] = pe�a;
		pe�a.posicao = posicao;
	}
	
	public Pe�as removerPe�a(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("n�o existe essa posicao no tabuleiro");
		}
		if (pe�as(posicao) == null) {
			return null;
		}
		Pe�as aux = pe�as(posicao);
		aux.posicao = null;
		pe�as[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
		
	}
	
	
	public boolean posicaoExiste(int linha, int coluna) {
		return linha >=0 && linha < linhas && coluna>=0 && coluna<colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean temUmaPe�a(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("n�o existe essa posicao no tabuleiro");
		}
		return pe�as(posicao) != null;
	}
	
	
	
}
