package Kadmiel;

public class MKSD13 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD13 - Exercício 13: Soma dos 100 primeiros números");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 
        
        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            soma = soma + i; 
        }
        
        System.out.println("\nA soma dos números de 1 até 100 é: " + soma);
    }
}