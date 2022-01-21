package xadrez;

import tabuleiro.Peças;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}

	
	
	public PeçasXadrez[][]getPeças(){
		PeçasXadrez[][] mat = new PeçasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for(int j =0; j<tabuleiro.getColunas(); j++) {
			mat[i][j]= (PeçasXadrez) tabuleiro.peças(i,j);	}
			}
		return mat;
	}
	
	public PeçasXadrez moverPeça(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino) {
		Posicao origem = posicaoOrigem.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validarPosicaoOrigem(origem);
		Peças peçaCapturada = fazerMovimento(origem,destino);
		return (PeçasXadrez)peçaCapturada;
	}
	
	private void validarPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.temUmaPeça(posicao)) {
			throw new XadrezException("Não existe peça na posição");
		}
		if(!tabuleiro.peças(posicao).existeMovimentoPossivel()) {
			throw new XadrezException("Não existe moviments possiveis para a peça");
			
		}
	}
	
	private Peças fazerMovimento(Posicao origem, Posicao destino) {
		Peças p = tabuleiro.removerPeça(origem); 
		Peças peçaCapturada = tabuleiro.removerPeça(destino);
		tabuleiro.ColocarPeça(p, destino);
		return peçaCapturada;
	}
	
	private void colocarNovaPeça(char coluna, int linha, PeçasXadrez peça) {
		tabuleiro.ColocarPeça(peça, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void configuracaoInicial() {
		colocarNovaPeça('c', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('c', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('d', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('e', 2, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('e', 1, new Torre(tabuleiro, Cor.BRANCAS));
        colocarNovaPeça('d', 1, new Rei(tabuleiro, Cor.BRANCAS));

        colocarNovaPeça('c', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('c', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('d', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('e', 7, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('e', 8, new Torre(tabuleiro, Cor.PRETAS));
        colocarNovaPeça('d', 8, new Torre(tabuleiro, Cor.PRETAS));
	
	}
}
