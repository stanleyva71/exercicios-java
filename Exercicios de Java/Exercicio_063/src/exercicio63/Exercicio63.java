package exercicio63;

import java.util.Scanner;

public class Exercicio63 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 63");
        System.out.println("");
        System.out.println();

        double valordahora;
        double horasaomes;
        double descontoINSS;
        double SalarioBruto;
        double desconto;
        double SalarioLiquido;
        
        System.out.print("Valor da hora trabalhada: ");
        valordahora = teclado.nextDouble();
        System.out.print("Digite as horas trabalhadas ao mês: ");
        horasaomes = teclado.nextDouble();
        System.out.print("Percentual de desconto INSS: ");
        descontoINSS = teclado.nextDouble();
        
        SalarioBruto = valordahora * horasaomes;
        desconto = SalarioBruto * (descontoINSS/100);
        SalarioLiquido = SalarioBruto - desconto;
        
        System.out.print("Salário Líquido: " +SalarioLiquido);

    }
    
}
