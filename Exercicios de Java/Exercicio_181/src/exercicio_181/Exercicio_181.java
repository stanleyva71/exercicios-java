package exercicio_181;

public class Exercicio_181 {

    public static void main(String[] args) {
        
        //variaveis
        int i;
        int soma;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 181");
        System.out.println("Imprimir todos os números de 1 a 100 e a soma deles");
        System.out.println();
        
        // processamnento
        soma = 0;
        for (i = 1; i <= 100; i++) {
            System.out.print(i+" ");
            if(i % 10 == 0){
            System.out.println();
            }
            soma = soma + i;
        }
        System.out.println("");
        System.out.println("Soma = "+soma);
        
        
    }
    
}
