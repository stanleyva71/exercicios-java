package exercicio_109;

import java.util.Scanner;

public class Exercicio_109 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // variavies
        String nome1;
        String nome2;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 109");
        System.out.println("Entrar com um nome de uma pessoa e imprimi-lo em ordem alfabética");
        System.out.println();
        
        // entrada de dados
        System.out.print("Entrar com nome 1: ");
        nome1 = teclado.next();
        System.out.print("Entrar com nome 2: ");
        nome2 = teclado.next();
        
        // processamento
        if (nome1.compareTo(nome2)< 0){
            System.out.println(nome1 + " menor " + nome2);
        } else if(nome1.compareTo(nome2)>0){
            System.out.println(nome1 + " maior " + nome2);
        }else{
            System.out.println(nome1 + " igual " + nome2);
        }
        
        // saida de dados
        
    }
    
}
