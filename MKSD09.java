package Kadmiel;

import java.util.Scanner;
import java.util.Arrays; 

public class MKSD09 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD09 - Exercício 9: Ordem crescente (três números)");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextInt();
        
        Arrays.sort(numeros);
        
        System.out.println("Os números em ordem crescente são: ");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        
        scanner.close(); 
    }
}