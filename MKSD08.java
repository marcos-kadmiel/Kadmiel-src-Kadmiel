package Kadmiel;

import java.util.Scanner;

public class MKSD08 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Marcos Kadmiel Santos Dias - RA: 0024881"); 
        System.out.println("* Classe MKSD08 - Exercício 8: Login simples");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorreto = "admin";
        String senhaCorreta = "senha123";
        
        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login BEM-SUCEDIDO! Acesso liberado.");
        } else {
            System.out.println("ERRO: Usuário ou senha inválidos. Acesso negado.");
        }
        
        scanner.close(); 
    }
}