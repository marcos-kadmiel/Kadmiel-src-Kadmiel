package Kadmiel;

import java.util.Scanner;

public class MKSD25 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD25 - Exercício 25: Tabuada com while");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("--- Tabuada do " + numero + " (com while) ---");
        
        int i = 1; 
        
        while (i <= 10) { 
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; 
        }
        
        scanner.close();
    }
}