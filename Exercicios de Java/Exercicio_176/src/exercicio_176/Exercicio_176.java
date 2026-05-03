package exercicio_176;

public class Exercicio_176 {

    public static void main(String[] args) {
        
        // variavies
        int i;
        int pares;

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 176");
        System.out.println("Imprimir os números pares");
        System.out.println();
        
        // Processamento
        pares = 0;
        for (i = 2; i <= 200; i += 2) {
            System.out.println(i);
            pares++;
        }
        
        System.out.println();
        
        System.out.println("Total de números pares = "+pares);
        
        
    }
    
}
