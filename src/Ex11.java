//
//Faça um programa que leia um número inteiro com três dígitos e imprima somente o algarismo da casa das dezenas. Por exemplo, se
// o usuário digitar 135, seu programa deverá mostrar na tela somente o número 3.


import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      int numero, terceiro, segundo;


        System.out.println("digite um numero de tres casa ");
        numero = entrada.nextInt();
        terceiro = numero %10;
        numero /=10;
        segundo = numero %10;
        numero /= 10;
        System.out.println("o segundo numero e " + segundo);




    }
}
