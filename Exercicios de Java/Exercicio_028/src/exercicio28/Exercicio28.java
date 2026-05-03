package exercicio28;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        
        // Scanner sc
        Scanner sc = new Scanner(System.in);
        
        // Execicio 28
        System.out.println("Execicio 28");
        System.out.println("Estudo na Fatec Barueri curso de GTI - Gestão da Tecnologia da Informação");
        System.out.println("");
        
        // Execicio 29
        System.out.println("Execicio 29");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("");
        
        // Execicio 30
        System.out.println("Execicio 30");
        int n1; int n2; int resultado; 
        n1 = 67; n2 = 45;
        resultado = n1 * n2;
        System.out.println("O produto de 67 e 45 é = "+ resultado);
        System.out.println("");
        
        // Execicio 31
        System.out.println("Execicio 31");
        double a1; double a2; double a3; double produto; 
        a1 = 5; a2 = 6; a3 = 8;
        produto = (a1 + a2 + a3) / 3;
        System.out.println("Media aritmética = "+ produto);
        System.out.println("");
        
        // Execicio 32
        System.out.println("Execicio 32");
        System.out.print("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("");
        
        // Execicio 33
        System.out.println("Execicio 33");
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite mais um número inteiro: ");
        int num2 = sc.nextInt();
        
        System.out.println("Você digitou os números: " + num1 + " e " + num2);
        System.out.println("");
         
        // Execicio 34 
        System.out.println("Execicio 34");
        System.out.print("Digite um número inteiro: ");
        
        int number = sc.nextInt();
        int antecessor = number - 1;
        int sucessor = number + 1;
                
        System.out.print("Antessesor: " + antecessor);
        System.out.print(" Número: "+ number);
        System.out.print(" Sucessor: " + sucessor);
        System.out.println("");
        
        // Execicio 35
        System.out.println("Execicio 35");
        sc.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine(); 
        System.out.println("Digite seu endereço: ");
        String endereco = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = sc.nextLine();
        
        System.out.println("\nDados informados:");
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("");
        
        // Execicio 36
        System.out.println("Execicio 36");
        int b1; int b2; int soma; 
        
        System.out.print("Entre com um número: ");
        b1 = sc.nextInt();
        System.out.print("Entre com outro número: ");
        b2 = sc.nextInt();
        
        soma = b1 + b2;
        System.out.println("SOMA = "+ soma);
        
    }
    
}
