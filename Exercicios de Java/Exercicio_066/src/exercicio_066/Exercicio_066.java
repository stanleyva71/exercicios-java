package exercicio_066;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio_066 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        NumberFormat df = NumberFormat.getInstance();
        
        // Variaves
        final double Consumo = 12.00;
        double tempoGasto;
        double velocidadeMedia;
        double distancia;
        double litrosUsados;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 66");
        System.out.println("Cálculo da quantidade de combustível consumida em uma viagem");
        System.out.println();
        
        // Entrada de dados
        System.out.print("Qual foi o tempo de viagem em horas inteiras? ");
        tempoGasto = teclado.nextDouble();
        System.out.print("Qual foi a velocidade da viagem em km/h? ");
        velocidadeMedia = teclado.nextDouble();
        
        // Processamento
        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia / Consumo;
        
        // Saida de dados
        System.out.println("Tempo: "+ tempoGasto + " Horas");
        System.out.println("Velocidade: "+ velocidadeMedia + " Km/h");
        System.out.println("Distância: "+ distancia + " Km");
        System.out.println("Litros usados: "+ df.format(litrosUsados) + " Litros");
        
    }
    
}
