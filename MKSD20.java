package Kadmiel;

import java.util.Scanner;

public class MKSD20 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD20 - Exercício 20: Números de Fibonacci");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nQuantos termos da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();
        
        int termoAnterior = 0;
        int termoAtual = 1;
        
        System.out.println("Os " + n + " primeiros termos de Fibonacci são:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(termoAnterior + " "); 
            
            int proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
        System.out.println(); 
        
        scanner.close();
    }
}