/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.bancojava;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
import java.util.HashMap;
public class variosBancos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        HashMap<String, operacoesBanco> contas = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String indice;
        System.out.println("Por favor, crie sua conta:");
        for(int i = 0; i < 30; i++){
            System.out.println("Digite seu nome, cpf, senha e agencia respectivamente:");
            String nome = input.nextLine();
            String cpf = input.nextLine();
            String senha = input.nextLine();
            String agencia = input.nextLine();
            operacoesBanco conta = new operacoesBanco();
            conta.abrirConta(cpf, nome, senha, agencia);
            contas.put(cpf, conta);
            System.out.println("Conta criada com sucesso!");
        }
        System.out.println("Digite 1 para deposito, 2 para saque, 3 para transferencia, 4 para visualizar historico, 5 para fechar conta e 6 para contrair emprestimo:");
        int decisao = input.nextInt();
        input.nextLine();
        while(decisao != 7){
            switch(decisao){
                case 1:
                    System.out.println("Por favor, insira o valor do deposito e indice da conta:");
                    double deposito = input.nextDouble();
                    input.nextLine();
                    indice = input.nextLine();
                    contas.get(indice).deposito(deposito);
                    System.out.println(deposito+" depositado com sucesso");
                    break;
                case 2:
                    System.out.println("Por favor, insira o valor do saque e o indice da conta:");
                    double saque = input.nextDouble();
                    input.nextLine();
                    indice = input.nextLine();
                    contas.get(indice).saque(saque);
                    break;
                case 3:
                    System.out.println("Por favor, insira o valor da transferencia, o indice da sua conta e do recebedor:");
                    double valor = input.nextDouble();
                    input.nextLine();
                    indice = input.nextLine();
                    String indiceDois = input.nextLine();
                    input.nextLine();
                    if(contas.get(indice).getSaldo() > valor){
                        contas.get(indice).saque(valor);
                        contas.get(indiceDois).deposito(valor);
                    }
                    break;
                case 4:
                    System.out.println("Digite o indice da conta que voce deseja ver o historico:");
                    indice = input.nextLine();
                    contas.get(indice).historicoExtrato();
                    break;
                case 5:
                    System.out.println("Digite o indice da conta que voce deseja fechar, junto do nome e a senha da conta: ");
                    indice = input.nextLine();
                    String nome = input.nextLine();
                    String senha = input.nextLine();
                    contas.get(indice).fechamentoConta(nome, senha);
                case 6:
                    System.out.println("Digite o indice da conta, o valor que voce deseja receber e a quantidade de meses para pagar: ");
                    indice = input.nextLine();
                    double dinheiroEmprestado = input.nextDouble();
                    input.nextLine();
                    int meses = input.nextInt();
                    contas.get(indice).solicitarEmprestimo(dinheiroEmprestado, meses);
            }
        }
    }
}
