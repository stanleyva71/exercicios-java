package exercicio_105;

import java.util.Scanner;

public class Exercicio_105 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // variavies
        String sigla;
        String menssagem;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 105");
        System.out.println("Entrar com sigla do estado de uma pessoa e imprimir uma das mensagens");
        System.out.println();
        
        // entrada de dados
        System.out.println("Entre a sigla do estado desejado (2 caracteres): ");
        sigla = teclado.next().toUpperCase();
        // processamento
        if(sigla.equals("SP")){
            menssagem = "São Paulo";
        } else if(sigla.equals("RJ")){
            menssagem = "Rio de Janeiro";
        } else if(sigla.equals("MG")){
            menssagem = "Minas Gerais";
        } else {
            menssagem = "Outros estados";
        }
        
        System.out.println(menssagem);
        
        
    }
}
