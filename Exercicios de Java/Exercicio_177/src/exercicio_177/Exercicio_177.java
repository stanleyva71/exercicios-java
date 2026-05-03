package exercicio_177;

public class Exercicio_177 {

    public static void main(String[] args) {
        
        int i;
        int multiplos;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 177");
        System.out.println("Imprimir os multiplos de 5, de 1 a 500");
        System.out.println();
     
        // Processamento
        multiplos = 0;
        
        for (i=5; i <=500; i += 5){
        System.out.println(i);
        multiplos++;
        }
        
        System.out.println();
        
        System.out.println("Total de números pares = "+multiplos);
        
        
    }
    
}
