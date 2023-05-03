import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
       // Faça um programa que leia um número inteiro e imprima o seu número sucessor e antecessor.
        int inteiro;
        Scanner entrada =new Scanner(System.in);
        System.out.println("digite um numero inteiro ");
        inteiro = entrada.nextInt();
        System.out.println("seu numero inteiro e  " +inteiro);
        int antecessor = --inteiro ;
        System.out.println(" seu antecessor e "+antecessor);
        int sucessor = inteiro +2 ;
        System.out.println("e seu sucessor e"+sucessor);
        entrada.close();




    }
}
