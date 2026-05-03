package exercicio51;

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercício 51");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        
        double Raio;
        double Perimetro;
        double Area;
        
        System.out.print("Insira o valor do raio: ");
        Raio = teclado.nextDouble();
        
        //Processamento
        Perimetro = 2 * Math.PI * Raio;
        Area = Math.PI * Math.pow(Raio,2);
        
        
        // Saida de dados
        System.out.println("Perímetro: " +Perimetro);
        System.out.println("Área: " +Area);
        
        
    }
    
}
