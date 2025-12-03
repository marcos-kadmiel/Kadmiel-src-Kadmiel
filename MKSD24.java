package Kadmiel;

import java.util.Scanner;

public class MKSD24 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD24 - Exercício 24: Verificar se um número é positivo");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        int numero = -1; 
        
        System.out.println("\nPor favor, digite um número POSITIVO para continuar.");
        
        while (numero <= 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Esse número não é positivo. Tente novamente.");
            }
        }
        
        System.out.println("Ótimo! " + numero + " é um número positivo.");
        
        scanner.close();
    }
}