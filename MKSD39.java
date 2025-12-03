package Kadmiel;

import java.util.Scanner;

public class MKSD39 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD39 - Exercício 39: Validar número entre 1 e 5");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("\nDigite um número entre 1 e 5: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 5) {
                System.out.println("Valor inválido. Tente novamente.");
            }
            
        } while (numero < 1 || numero > 5); // Repete se estiver fora do intervalo
        
        System.out.println("Você digitou: " + numero);
        
        scanner.close();
    }
}