package Kadmiel;

import java.util.Scanner;

public class MKSD04 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD04 - Exercício 4: Pode votar?");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 16) {
            System.out.println("Você NÃO PODE votar.");
        } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            System.out.println("Você PODE votar, mas não é obrigatório.");
        } else { 
            System.out.println("Você DEVE votar (voto obrigatório).");
        }
        
        scanner.close(); 
    }
}