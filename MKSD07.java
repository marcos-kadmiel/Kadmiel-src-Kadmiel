package Kadmiel;

import java.util.Scanner;

public class MKSD07 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD07 - Exercício 7: Triângulo válido");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o lado A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o lado B: ");
        int b = scanner.nextInt();
        System.out.print("Digite o lado C: ");
        int c = scanner.nextInt();
        
        boolean cond1 = (a + b > c);
        boolean cond2 = (a + c > b);
        boolean cond3 = (b + c > a);
        
        if (cond1 && cond2 && cond3) {
            System.out.println("Os lados formam um triângulo!");
            
            if (a == b && b == c) {
                System.out.println("Tipo: EQUILÁTERO.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: ISÓSCELES.");
            } else {
                System.out.println("Tipo: ESCALENO.");
            }
            
        } else {
            System.out.println("Os lados NÃO FORMAM um triângulo.");
        }
        
        scanner.close(); 
    }
}