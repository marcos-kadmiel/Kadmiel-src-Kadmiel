package Kadmiel;

import java.util.Scanner;

public class MKSD27 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD27 - Exercício 27: Quantidade de números ímpares");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        int contadorNumeros = 1;
        int quantidadeImpares = 0;
        
        System.out.println("\nDigite 10 números inteiros.");
        
        while (contadorNumeros <= 10) {
            System.out.print("Digite o " + contadorNumeros + "º número: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 != 0) { 
                quantidadeImpares++; 
            }
            
            contadorNumeros++; 
        }
        
        System.out.println("Você digitou " + quantidadeImpares + " números ímpares.");
        
        scanner.close();
    }
}