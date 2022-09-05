/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author welli
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Informe a primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.print("Informe a segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.print("Informe a terceira nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O aluno %s ficou com a média %.2f \n", nome, media);

    }

   
}
