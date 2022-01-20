package application;

import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PeçasXadrez;
import xadrez.XadrezPosicao;

public class progama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while (true){		
		UI.PrintTabuleiro(partidaDeXadrez.getPeças());
		System.out.println("");
		System.out.print("Origem: ");
		XadrezPosicao origem =UI.lerPosicao(scan);
		
		System.out.println();
		System.out.println("Destino ");
		XadrezPosicao destino =UI.lerPosicao(scan);
		
		PeçasXadrez peçaCapturada =partidaDeXadrez.moverPeça(origem, destino);
		
		
		}
	}

}
