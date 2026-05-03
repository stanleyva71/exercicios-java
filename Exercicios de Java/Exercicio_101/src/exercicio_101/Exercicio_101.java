package exercicio_101;

import java.util.Scanner;

public class Exercicio_101 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 101");
        System.out.println("Indicar se um algoritimo está compreendido entre 20 e 90 ou não");
        System.out.println();
        
        System.out.println("Um número:");
        int num = teclado.nextInt();
        
        if ((num >= 20) && (num <= 90)){
            System.out.println("Está entre 20 e 90");
        } else {
            System.out.println("NÃO está entre 20 e 90");
            
        }
        
    }
    
}
