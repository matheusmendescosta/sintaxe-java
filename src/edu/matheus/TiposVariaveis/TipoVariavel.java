package edu.matheus.TiposVariaveis;

public class TipoVariavel {
    public static void main(String[] args) {
        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        System.out.print(numero + "\n");

        final double VALOR_PI = 3.14; //sempre usar caixa alta para declarar constante

        System.out.println(VALOR_PI);
    }
}
