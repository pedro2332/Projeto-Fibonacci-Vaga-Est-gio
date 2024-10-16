package com.estagioprojeto.codemain;

import com.estagioprojeto.services.FibonacciGenerator;

public class Main {
    private FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
    final Integer numberToSearch = 46;
    final Integer anotherNumberToSearch = 55;

    public void initiateProject(){
        System.out.println("\nO número para consulta será previamente definido como: 45\n");
        System.out.println("""
                Iniciando o cálculo da sequência de fibonacci até o 46º número...
               
                """);
        fibonacciGenerator.generateFibonacci();
        System.out.println("\nIniciando a busca do número 45 dentro da sequência de fibonacci...");
        fibonacciGenerator.searchNumber(numberToSearch);
        System.out.println("\nÉ uma pena, parece que o número 45 não está presente na lista, vejamos se o número 55 está presente:");
        fibonacciGenerator.searchNumber(anotherNumberToSearch);

    }
}
