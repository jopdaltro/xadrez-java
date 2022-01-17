package application;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class progama {

	public static void main(String[] args) {
		
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.PrintTabuleiro(partidaDeXadrez.getPeças());
		
	}

}
