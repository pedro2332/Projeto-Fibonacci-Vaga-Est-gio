package com.estagioprojeto.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciGenerator {
    private List<Integer> fibonacciList = new ArrayList<>();
    private Integer fibonacciOperator = 2;

    public void generateFibonacci() {
        fibonacciList.clear();
        fibonacciList.add(0);
        fibonacciList.add(1); //Linha 12-14: Adiciona os primeiros termos da sequência de fibonacci (0,1), e limpa a lista completamente
                              // antes para que a função possa ser usada quantas vezes necessário
        while (fibonacciList.size() < 46) {
            fibonacciList.add((fibonacciList.get((fibonacciOperator - 2))) +
                    (fibonacciList.get(fibonacciOperator - 1))); //Expressão que calcula o valor do próximo elemento da sequência//
            fibonacciOperator ++; // Incrementa-se em fibonacciOperator, para o correto preenchimento da lista de Fibonacci
        }
        System.out.println(fibonacciList);

    }

    public void searchNumber(Integer number) {
        if (fibonacciList.contains(number)) {
            System.out.println("O número está presente na sequência de fibonacci! E se encontra na posição " +
                    (fibonacciList.indexOf(number) + 1) + " da lista de fibonacci!");
        }else {
            System.out.println("O número não está presente na lista de fibonacci!");
        }
    }
}
