
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAROL
 */
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int num;

        do {
            System.out.print("Digite um número (0 = parar): ");
            num = sc.nextInt();

            if (num != 0) {
                contador++;
            }

        } while (num != 0);

        System.out.println("Você digitou " + contador + " números.");
    }
}
