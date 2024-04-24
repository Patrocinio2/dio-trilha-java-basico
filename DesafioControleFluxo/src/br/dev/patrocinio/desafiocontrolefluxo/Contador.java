package br.dev.patrocinio.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        int parametroUm, parametroDois;

        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parametro: ");
        parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem;
        
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        }

        contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
    
}
