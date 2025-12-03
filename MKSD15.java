package Kadmiel;

import java.util.Scanner;

public class MKSD15 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD15 - Exercício 15: Fatorial de um número");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        long fatorial = 1; 
        
        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        scanner.close();
    }
}