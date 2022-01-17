package application;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class progama {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.PrintTabuleiro(partidaDeXadrez.getPeças());
		
	}

}
