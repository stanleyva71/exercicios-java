package exercicio_084;

import java.util.Scanner;

public class Exercicio_084 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 84");
        System.out.println("Ler um número e informar se ele é impar ou par");
        System.out.println();
        
        System.out.print("Um número: ");
        int num = teclado.nextInt();
        
        if(num % 2 == 0){
            System.out.println("É par");
        }
        else{
            System.out.println("É impar");
        }
        
    }
    
}
