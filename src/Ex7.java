import java.util.Scanner;

public class Ex7 {
    //Faça um programa que leia e imprima dois números inteiros na tela.
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int inteiro ;
        int inteiro2;
        System.out.println("digite um numero inteiro" );
        inteiro = entrada.nextInt();
        System.out.println("digite um outro numero inteiro" );
        inteiro2 = entrada.nextInt();
        System.out.println("Os números inteiros digitados foram  " + inteiro + " e " + inteiro2);

    }
}
