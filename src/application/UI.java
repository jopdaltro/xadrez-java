package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.Cor;
import xadrez.Pe?asXadrez;
import xadrez.XadrezPosicao;

public class UI {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static void clearScreen() { 
		 System.out.print("\033[H\033[2J"); 
		 System.out.flush(); 
		} 


	
	
	public static XadrezPosicao lerPosicao(Scanner scan) {
		try {
		String s = scan.nextLine();
		char coluna = s.charAt(0);
		int linha = Integer.parseInt(s.substring(1));
		return new XadrezPosicao(coluna,linha);
		}
		catch(RuntimeException e) {
			throw new InputMismatchException("erro lendo posi??es de xadrez. valores vlaidos de a1 at? h8");
		}
	}
	public static void PrintTabuleiro(Pe?asXadrez[][] pe?as) {
		for (int i = 0; i < pe?as.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pe?as.length; j++) {
				printPe?a(pe?as[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");

	}

	private static void printPe?a(Pe?asXadrez pe?a) {
    	if (pe?a == null) {
            System.out.print("-");
        }
        else {
            if (pe?a.getCor() == Cor.BRANCAS) {
                System.out.print(ANSI_WHITE + pe?a + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + pe?a + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
	
	

}
