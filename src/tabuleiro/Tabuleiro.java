package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peças[][] peças;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas< 1 || colunas<1) {
			throw new TabuleiroException("error de criação do tabuleiro, precisa ter pelo menos uma linha e uma coluna");
			
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peças[linhas][colunas];
		
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peças peças(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("não existe essa posicao no tabuleiro");
		}
		return peças[linha][coluna];
	}
	
	public Peças peças(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("não existe essa posicao no tabuleiro");
		}
		return peças[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void ColocarPeça(Peças peça, Posicao posicao) {
		if(temUmaPeça(posicao)) {
			throw new TabuleiroException("ja existe uam peça nessa posição " + posicao);
		}
		peças[posicao.getLinha()][posicao.getColuna()] = peça;
		peça.posicao = posicao;
	}
	
	public Peças removerPeça(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("não existe essa posicao no tabuleiro");
		}
		if (peças(posicao) == null) {
			return null;
		}
		Peças aux = peças(posicao);
		aux.posicao = null;
		peças[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
		
	}
	
	
	public boolean posicaoExiste(int linha, int coluna) {
		return linha >=0 && linha < linhas && coluna>=0 && coluna<colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean temUmaPeça(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("não existe essa posicao no tabuleiro");
		}
		return peças(posicao) != null;
	}
	
	
	
}
