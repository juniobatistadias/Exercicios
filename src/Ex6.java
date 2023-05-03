import java.util.Scanner;
public class Ex6 {
    //Faça um programa que leia um número inteiro e mostre-o na tela, por exemplo, da
    // seguinte forma: O número inteiro digitado foi 4
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int inteiro ;
        System.out.println("digite um numero inteiro" );
        inteiro = entrada.nextInt();

        System.out.println("O número inteiro digitado foi " + inteiro);


    }
}
