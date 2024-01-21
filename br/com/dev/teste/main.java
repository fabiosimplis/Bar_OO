package br.com.dev.teste;

import br.com.dev.entity.Bill;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        char sexo = ' ';
        int cerveja = 0;
        int refrigerante = 0;
        int espetinho = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Sexo: ");
        sexo = leitor.next().charAt(0);

        while(sexo != 'F' && sexo != 'M'){
            System.out.println("Valor invalido! Favor digitar F ou M: " + sexo);
            System.out.print("Sexo: ");
            sexo = leitor.next().charAt(0);
        }

        System.out.print("Quantidade de cervejas: ");
        cerveja = leitor.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        refrigerante = leitor.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        espetinho = leitor.nextInt();

        Bill bill = new Bill(sexo, cerveja, espetinho, refrigerante);
        leitor.close();
        bill.relatorio();
    }
}
