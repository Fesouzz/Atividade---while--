
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAROL
 */
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int totalAlunos = sc.nextInt();

        int contador = 1;
        double soma = 0;

        while (contador <= totalAlunos) {
            System.out.print("Digite a nota do aluno " + contador + ": ");
            soma += sc.nextDouble();
            contador++;
        }

        double media = soma / totalAlunos;
        System.out.println("A média da turma é: " + media);
    }
}
