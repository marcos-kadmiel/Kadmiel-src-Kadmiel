package Kadmiel;

import java.util.Scanner;

public class MKSD19 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD19 - Exercício 19: Verificar se um número é primo");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        int contadorDeDivisores = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) { 
                contadorDeDivisores++;
            }
        }
        
        if (contadorDeDivisores == 2) {
            System.out.println("O número " + numero + " é PRIMO.");
        } else {
            System.out.println("O número " + numero + " NÃO é primo.");
        }
        
        scanner.close();
    }
}