package Exercicio3;

import java.util.Scanner;

public class salarioMinimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salário:");
        double salario = input.nextDouble();



        if (salario > 1200){
            System.out.println("Voce recebe acima de 1 salario minimo!");
        } else if (salario <=1200) {
            System.out.println("O Salario é igual ou menor que o minimo");
        } else  {
            System.out.println("repita a operação");
        }

    }


}

