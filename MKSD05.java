package Kadmiel;

import java.util.Scanner;

public class MKSD05 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD05 - Exercício 5: Notas e aprovação");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        System.out.println("Sua média é: " + media);
        
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO!");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO.");
        } else {
            System.out.println("Situação: REPROVADO.");
        }
        
        scanner.close(); 
    }
}