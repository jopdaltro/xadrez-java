package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.Pe�asXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPosicao;

public class progama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while (true){	
		try {
			UI.clearScreen();
			UI.PrintTabuleiro(partidaDeXadrez.getPe�as());
			System.out.println("");
			System.out.print("Origem: ");
			XadrezPosicao origem =UI.lerPosicao(scan);
			
			System.out.println();
			System.out.println("Destino ");
			XadrezPosicao destino =UI.lerPosicao(scan);
			
			Pe�asXadrez pe�aCapturada =partidaDeXadrez.moverPe�a(origem, destino);
		}
		catch(XadrezException e) {
			System.out.println(e.getMessage());
			scan.nextLine();
			
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			scan.nextLine();
		}
		
		}
	}

}
