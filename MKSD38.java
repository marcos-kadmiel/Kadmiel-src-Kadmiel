package Kadmiel;

import java.util.Scanner;

public class MKSD38 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD38 - Exercício 38: Confirmar saída com 's'");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        String resposta;
        
        do {
            System.out.println("\n--- MENU DE AÇÕES ---");
            System.out.println("Ação 1...");
            System.out.println("Ação 2...");
            
            System.out.print("\nDeseja sair do programa? (s/n): ");
            resposta = scanner.nextLine();
            
        } while ( !resposta.equalsIgnoreCase("s") ); // Repete enquanto a resposta NÃO for 's'
        
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}