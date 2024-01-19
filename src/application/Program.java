package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        List<Pessoa> listaDeEntidadesPessoas = new ArrayList<>();

        //Entrada de dados
        System.out.print("Número de TAXAS a ser cobrada:");
        int nTaxa = get.nextInt();
        get.nextLine();

        for (int p = 1; p <= nTaxa; p++){
            System.out.printf("%dª taxa a ser cobrada:%n%n", p);

            System.out.print("Pessoa Física ou Jurídica(F/J)?:");
            char selecionaP = get.nextLine().toUpperCase().charAt(0);

            System.out.print("Nome:");
            String nome = get.nextLine();

            System.out.print("Renda Anual:");
            Double renda = get.nextDouble();
            get.nextLine();

            if (selecionaP == 'F'){
                System.out.print("Gastos com saúde:");
                Double gastosSaude = get.nextDouble();
                get.nextLine();

                listaDeEntidadesPessoas.add(new PessoaFisica(nome, renda, gastosSaude));

            } else if (selecionaP == 'J') {
                System.out.print("Número de funcionários:");
                int nDeFuncionarios = get.nextInt();
                get.nextLine();

                listaDeEntidadesPessoas.add(new PessoaJuridica(nome, renda, nDeFuncionarios));

            }
            else {
                System.out.println("Opção inválida.Programa encerrado.");
                System.exit(0);
            }
            System.out.println();
        }

        System.out.println("TAXAS A PAGAR:\n");

        Double totalTaxa = 0.0;
        for (Pessoa p: listaDeEntidadesPessoas){
            p.calculoImposto();
            System.out.println(p);
            totalTaxa += p.getImpostoAPagar();
        }

        System.out.println();
        System.out.printf("TOTAL: R$%.2f%n", totalTaxa);
    }
}
