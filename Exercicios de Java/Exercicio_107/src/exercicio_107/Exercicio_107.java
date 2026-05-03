package exercicio_107;

import java.util.Scanner;

public class Exercicio_107 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // variavies
        String nome;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 107");
        System.out.println("Entrar com um nome de uma pessoa se for igual a AMANDA OU DORIVAL");
        System.out.println();
        
        // entrada de dados
        System.out.print("Entrar com o nome: ");
        nome = teclado.next();
        
        // Processamento
        if(nome.equalsIgnoreCase("Amanda")||nome.equalsIgnoreCase("Dorival")){
            System.out.println("Nome válido: "+nome);
        }else{
            System.out.println("Nome não corresponde.");
        }
    }
    
}
