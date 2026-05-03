package exercicio_178;

public class Exercicio_178 {

    public static void main(String[] args) {
        
        int i;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 178");
        System.out.println("Imprimir o quadrado dos números de 1 a 20");
        System.out.println();
     
        // Processamento
        for(i=1;i<= 20;i++){
        System.out.print(" "+i);  
        }
        System.out.println();
        System.out.println();
        
        for(i=1;i<= 20;i++){
        System.out.print(" " + Math.pow(i, 2));
        }
        
    }
    
}
