package Kadmiel;

import java.util.Scanner;

public class MKSD37 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD37 - Exercício 37: Soma até o número ser múltiplo de 10");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        
        System.out.println("\nDigite números. O programa para quando um múltiplo de 10 for digitado.");
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero % 10 != 0) { // Se NÃO for múltiplo de 10
                soma = soma + numero;
            }
            
        } while (numero % 10 != 0); // Repete ENQUANTO não for múltiplo de 10
        
        System.out.println("Múltiplo de 10 digitado. A soma dos anteriores é: " + soma);
        
        scanner.close();
    }
}