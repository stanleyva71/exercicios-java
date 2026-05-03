package exercicio_080;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_080 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DecimalFormat dfTapes = new DecimalFormat("#,##0");

        // Variaves
        int acervo;
        double custoAluguel;
        double faturamentoAnual;
        double multasMes;
        double fitasFinalAno;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 80");
        System.out.println("Calcular a quantidade de fitas de uma locadora e o valor que ela cobra por aluguel");
        System.out.println();
        
        // Entrada de dados
        System.out.print("Acervo da locadora: ");
        acervo = teclado.nextInt();
        System.out.print("Custo do aluguel da fita R$: ");
        custoAluguel = teclado.nextDouble();
        
        // Processamento 
        //Cálculo do Faturamento Anual
        faturamentoAnual = (acervo/3.0) * custoAluguel * 12;
        // Cálculo das multas por mês
        multasMes = (acervo / 3.0) * (1.0 / 10.0) * (0.1 * custoAluguel);
        // Cálculo do total de fitas no final do ano
        fitasFinalAno = acervo * 0.98 * 1.1;
        
        // Saida de dados
        System.out.println("Faturamento anual R$ " + df.format(faturamentoAnual));
        System.out.println("Recebimento de multas no mês R$ " + df.format(multasMes));
        System.out.println("Total de fitas no final do ano: " + dfTapes.format(fitasFinalAno));
        
    }
    
}
