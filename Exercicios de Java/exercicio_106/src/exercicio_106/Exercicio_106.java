package exercicio_106;

import java.util.Scanner;

public class Exercicio_106 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // variavies
        String nome;
        String menssagem;
        char vogal;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 105");
        System.out.println("Entrar com um nome de uma pessoa e imprimi-lo se começa com vogal");
        System.out.println();
        
        // entrada de dados
        System.out.print("Entrar com seu nome: ");
        nome = teclado.next().toUpperCase();
        
        // processamento
        vogal = nome.charAt(0);
         if((vogal == 'A') ||(vogal == 'E') ||(vogal == 'I') ||(vogal == 'O') ||(vogal == 'U')) {
            System.out.println(nome +" começa com vogal " + vogal);
        }
        else{
            System.out.println(nome+ " não começa com vogal");
        }
        
        // saida de dados
        
    }
    
}
