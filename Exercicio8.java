
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAROL
 */
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        int contador = 1;

        while (contador <= 10) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > maior1) {
                maior2 = maior1;
                maior1 = num;
            } else if (num > maior2) {
                maior2 = num;
            }

            contador++;
        }

        System.out.println("Os dois maiores números são: " + maior1 + " e " + maior2);
    }
}
