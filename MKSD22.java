package Kadmiel;

import java.util.Scanner;

public class MKSD22 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD22 - Exercício 22: Soma de números até digitar zero");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numero = -1; 
        
        System.out.println("\nDigite números para somar. Digite 0 para parar.");
        
        while (numero != 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma = soma + numero;
        }
        
        System.out.println("A soma total dos números digitados é: " + soma);
        
        scanner.close();
    }
}