import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        float numero;
        Scanner entrada = new Scanner((System.in));
        System.out.println("Digite um numero");
        numero = entrada.nextFloat();
        float TercaPrte = numero/3;
        System.out.println("seu numero e " +numero+ "\na terca parte e " +TercaPrte);
    }

    }
