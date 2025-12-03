package Kadmiel;

import java.util.Scanner;

public class MKSD32 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD32 - Exercício 32: Tabuada de um número");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("--- Tabuada do " + numero + " (com do-while) ---");
        
        int i = 1;
        
        do {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);
        
        scanner.close();
    }
}