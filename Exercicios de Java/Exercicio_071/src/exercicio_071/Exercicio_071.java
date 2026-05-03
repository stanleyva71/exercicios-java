package exercicio_071;

import java.util.Scanner;

public class Exercicio_071 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variaves
        int hora;
        final int Minuto = 60;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 71");
        System.out.println("Algoritimo que ler uma hora inteira e mostra os minutos passados desde do início do dia");
        System.out.println();

        // Entrada de dados 
        System.out.print("Entre com um horário: ");
        hora = teclado.nextInt();
        
        // Processamento
        hora = (hora * Minuto);
        
        // Saida
        System.out.println("Minutos passados desde do início do dia: " + hora + " Minutos");
        
    }
    
}
