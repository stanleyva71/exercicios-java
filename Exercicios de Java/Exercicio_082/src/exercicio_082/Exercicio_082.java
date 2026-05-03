package exercicio_082;

import java.util.Scanner;

public class Exercicio_082 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 82");
        System.out.println("Ler um número inteiro e informar se ele é menor que 20");
        System.out.println();
        
        System.out.print("Um número: ");
        int num = teclado.nextInt();
        
        if(num<20){
            System.out.println("É menor que 20");
        }
        else{
            System.out.println("Não é menor que 20");
        }
        
        
    }
    
}
