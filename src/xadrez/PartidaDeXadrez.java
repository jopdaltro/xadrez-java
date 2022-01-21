package xadrez;

import tabuleiro.Pe�as;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pe�as.Rei;
import xadrez.pe�as.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}

	
	
	public Pe�asXadrez[][]getPe�as(){
		Pe�asXadrez[][] mat = new Pe�asXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (Pe�asXadrez) tabuleiro.pe�as(i,j);	}
			}
		return mat;
	}
	
	public Pe�asXadrez moverPe�a(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino) {
		Posicao origem = posicaoOrigem.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validarPosicaoOrigem(origem);
		Pe�as pe�aCapturada = fazerMovimento(origem,destino);
		return (Pe�asXadrez)pe�aCapturada;
	}
	
	private void validarPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.temUmaPe�a(posicao)) {
			throw new XadrezException("N�o existe pe�a na posi��o");
		}
		if(!tabuleiro.pe�as(posicao).existeMovimentoPossivel()) {
			throw new XadrezException("N�o existe moviments possiveis para a pe�a");
			
		}
	}
	
	private Pe�as fazerMovimento(Posicao origem, Posicao destino) {
		Pe�as p = tabuleiro.removerPe�a(origem); 
		Pe�as pe�aCapturada = tabuleiro.removerPe�a(destino);
		tabuleiro.ColocarPe�a(p, destino);
		return pe�aCapturada;
	}
	
	private void colocarNovaPe�a(char coluna, int linha, Pe�asXadrez pe�a) {
		tabuleiro.ColocarPe�a(pe�a, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		colocarNovaPe�a('c', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPe�a('c', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPe�a('d', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPe�a('e', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPe�a('e', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPe�a('d', 1, new Rei(tabuleiro, Cor.BRANCAS));

        colocarNovaPe�a('c', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPe�a('c', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPe�a('d', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPe�a('e', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPe�a('e', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPe�a('d', 8, new Torre(tabuleiro, Cor.PRETAS));
	
	}
}
