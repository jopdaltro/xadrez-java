package application;

import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.Pe�asXadrez;
import xadrez.XadrezPosicao;

public class progama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while (true){		
		UI.PrintTabuleiro(partidaDeXadrez.getPe�as());
		System.out.println("");
		System.out.print("Origem: ");
		XadrezPosicao origem =UI.lerPosicao(scan);
		
		System.out.println();
		System.out.println("Destino ");
		XadrezPosicao destino =UI.lerPosicao(scan);
		
		Pe�asXadrez pe�aCapturada =partidaDeXadrez.moverPe�a(origem, destino);
		
		
		}
	}

}
