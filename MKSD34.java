package Kadmiel;

import java.util.Scanner;

public class MKSD34 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD34 - Exercício 34: Pedir senha até acertar");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1111;
        int tentativa;
        
        do {
            System.out.print("\nDigite a senha (números): ");
            tentativa = scanner.nextInt();
            
            if (tentativa != senhaCorreta) {
                System.out.println("Senha incorreta.");
            }
            
        } while (tentativa != senhaCorreta);
        
        System.out.println("Acesso liberado!");
        
        scanner.close();
    }
}