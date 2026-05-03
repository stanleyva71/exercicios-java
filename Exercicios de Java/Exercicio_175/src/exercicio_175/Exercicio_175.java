package exercicio_175;

public class Exercicio_175 {

    public static void main(String[] args) {
        
        // variavies
        int i;

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 175");
        System.out.println("Imprimir todos os números de 100 a 1");
        System.out.println();
        
        for (i = 100; i >= 0; i--) {
            System.out.print(" "+i);
        }
        
        System.out.println();
        
        for (i = 100;i >= 0;i--){
            if(i % 10 == 0){
            System.out.println();
            }
            
            System.out.print(i + " ");       
        
        }
        
    }
    
}
