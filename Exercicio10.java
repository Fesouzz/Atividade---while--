
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAROL
 */
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Senha correta! Acesso liberado.");
    }
}
