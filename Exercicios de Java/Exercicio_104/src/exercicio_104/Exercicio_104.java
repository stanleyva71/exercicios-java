package exercicio_104;

import java.util.Scanner;

public class Exercicio_104 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 104");
        System.out.println("Entra com dados de uma pessoa, se ela for mulher e de menor aceita");
        System.out.println();
        
        System.out.print("Nome:");
        String nome = teclado.nextLine();
        
        System.out.print("Sexo:");
        String sexo = teclado.nextLine();
        
        System.out.print("Idade:");
        int idade = teclado.nextInt(); 
        
        if((sexo.equalsIgnoreCase("F"))&& idade < 25){
            System.out.println("Aceita");
            
        }else{
            System.out.println(nome+" Não aceita");
        }
        
    }
    
}
