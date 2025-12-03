package Kadmiel;

import java.util.Scanner;

public class MKSD23 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD23 - Exercício 23: Senha correta");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "java123";
        String tentativa = "";
        
        System.out.println("\nTente adivinhar a senha.");
        
        while ( !tentativa.equals(senhaCorreta) ) {
            System.out.print("Digite a senha: ");
            tentativa = scanner.nextLine();
            
            if ( !tentativa.equals(senhaCorreta) ) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        
        System.out.println("Acesso liberado!");
        
        scanner.close();
    }
}