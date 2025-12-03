package Kadmiel;

import java.util.Scanner;

public class MKSD40 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD40 - Exercício 40: Ler números e mostrar o maior");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int numero;
        // Começa o 'maior' com o menor valor possível
        int maiorNumero = Integer.MIN_VALUE; 
        
        System.out.println("\nDigite números positivos. Digite um negativo para parar.");
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            // Só compara se o número for positivo
            if (numero >= 0) {
                if (numero > maiorNumero) {
                    maiorNumero = numero; // Atualiza o maior
                }
            }
            
        } while (numero >= 0); // Repete enquanto o número for positivo (ou zero)
        
        // Verifica se algum número positivo foi digitado
        if (maiorNumero == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("O maior número positivo digitado foi: " + maiorNumero);
        }
        
        scanner.close();
    }
}