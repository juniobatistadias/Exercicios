import java.util.Scanner;
public class Ex9 {

//  Faça um programa que leia o nome, endereço e telefone de um usuário e imprima na tela.
public static void main(String[] args) {
    String nome;
    String endereco;
    double telefone;

    Scanner entrada =new Scanner(System.in);
    System.out.println("QUAL SEU NOME");
     nome = entrada.nextLine();
    System.out.println("digite seu endereco");
    endereco = entrada.nextLine() ;
    System.out.println(" digite seu telefone");
    telefone = entrada.nextDouble();
    System.out.println("seus dados sao \n" +"NOME: "+ nome + "\nTELEFONE: " + telefone+ "\nENDERECO:"+ endereco);

    entrada.close();
  }
}
