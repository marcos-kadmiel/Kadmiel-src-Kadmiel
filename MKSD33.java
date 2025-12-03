package Kadmiel;

import java.util.Scanner;

public class MKSD33 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD33 - Exercício 33: Menu com opção de sair");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            }
            
        } while (opcao != 2);
        
        System.out.println("Saindo do programa...");
        
        scanner.close();
    }
}