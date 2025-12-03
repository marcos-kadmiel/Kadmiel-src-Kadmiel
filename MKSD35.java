package Kadmiel;

import java.util.Scanner;

public class MKSD35 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD35 - Exercício 35: Número positivo obrigatório");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        double numero;
        
        // Pede o número pelo menos uma vez
        do {
            System.out.print("\nDigite um número POSITIVO: ");
            numero = scanner.nextDouble();
            
            if (numero <= 0) {
                System.out.println("Valor inválido. O número deve ser maior que zero.");
            }
            
        } while (numero <= 0); // Repete se o número não for positivo
        
        System.out.println("Número válido digitado: " + numero);
        
        scanner.close();
    }
}