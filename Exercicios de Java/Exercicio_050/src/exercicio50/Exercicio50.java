package exercicio50;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercício 50");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        
        //Variáveis
        double Base;
        double Altura;
        double Perimetro;
        double Area;
        double Diagonal;
        
        System.out.print("Insira o valor da Base: " );
        Base = teclado.nextDouble();
        System.out.print("Insira o valor da Altura: " );
        Altura = teclado.nextDouble();
        
        // Processamento
        Perimetro = (Base * 2) + (Altura * 2);
        Area = Base * Altura;
        Diagonal = Math.sqrt(Math.pow(Base,2) + Math.pow(Altura, 2));
        
        // Saida de dados
        
        System.out.println("Perímetro: " +Perimetro);
        System.out.println("Área: " +Area);
        System.out.println("Diagonal: " +Diagonal);
        
        
    }
    
}
