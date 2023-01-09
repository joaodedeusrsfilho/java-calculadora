package br.com.dio.collection.list;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digita um numero");
        float numero1 = lerTeclado.nextInt();

        System.out.println("Qual operacao deseja fazer: ( + ), ( - ) , ( * ) , ( / ), ( % )");
        String operador = lerTeclado.next();

        System.out.println("Digite um numero");
        float numero2 = lerTeclado.nextInt();

        switch (operador){
            case "+":
                System.out.println("Resultado = "+(numero1 + numero2));break;
            case "-":
                System.out.println("Resultado = "+(numero1 - numero2));break;
            case "/":
                System.out.println("Resultado = "+(numero1 / numero2));break;
            case "*":
                System.out.println("Resultado = "+(numero1 * numero2));break;
            case "%":
                float result = (numero1 * numero2) / 100;
                float resultFInal = result + numero1;
                System.out.println("Valor inicial = "+numero1);
                System.out.println("Valor com porcentagem = "+result);
                System.out.println("Valor com porcentagem incluida = "+(resultFInal)); break;
        }
    }
}
