/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancojava;

/**
 *
 * @author iagom
 */
public class operacoesBanco {
    private double saldo = 0;
    private double historico[] = new double[100];
    public int indice = 0;
    public String matrizUsuarios[][] = new String[10][4];
    public int indiceColuna = 0;
    public int indiceLinha = 0;
    
    public double getSaldo(){
        return saldo;
    }
    public void abrirConta(String cpf, String nome, String senhaAccount, String agencia){
        String dados[] = {nome, cpf, senhaAccount, agencia};
        matrizUsuarios[indiceLinha][0] = nome;
        matrizUsuarios[indiceLinha][indiceColuna + 1] = cpf;
        matrizUsuarios[indiceLinha][indiceColuna + 2] = senhaAccount;
        matrizUsuarios[indiceLinha][indiceColuna + 3] = agencia;
        indiceLinha++;
    }
    public void deposito(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println(valor+" depositado com sucesso");
            historico[indice] = valor;
            indice++;
            
        }
        else{
            System.out.println("Valor insuficiente");
        }
    }
    public void saque(double value){
        if(value > 0 && value <= saldo){
            saldo = saldo - value;
            System.out.println(value+" Sacado com sucesso.");
            System.out.println(saldo+" reais na conta após o saque");
            historico[indice] = -value;
            indice++;
        }
        else{
            System.out.println("Nao foi possivel sacar");
        }
    }
    public void transferencia(String nomeDestino, double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo -= valor;
            System.out.println("Voce transferiu "+valor+" com sucesso para "+nomeDestino);
        }
    }
    public void historicoExtrato(){
        for(int i = 0; i < indice; i++){
            System.out.println(historico[i]);
        }
    }
    public void solicitarEmprestimo(double valor, int meses){
        saldo += valor;
        System.out.println("O emprestimo foi efetuado com sucesso a uma taxa de juros mensal de 3%.");
        double pagamento = valor*Math.pow(103/10, meses);
        System.out.println("Voce devera pagar, ao final de "+meses+" meses, um valor total de "+pagamento+" reais.");
    }
    public void fechamentoConta(String nome, String senhaConta){
        boolean guardando = verificando(nome, senhaConta);
        if(guardando){
            System.out.println("Conta removida com sucesso");
        }
        else{
            System.out.println("Nao foi possivel validar seus dados");
        }
    }
    private boolean verificando(String nome, String senhaConta){
        boolean valorNome = false;
        int indiceConta[] = new int[2];
        boolean valorSenha = false;
        for(int i = 0; i < 10; i++){
            if(matrizUsuarios[i][0] != null && matrizUsuarios[i][0].equals(nome)){
                valorNome = true;
                indiceConta[0] = i;
            }
            if(matrizUsuarios[i][2] != null && matrizUsuarios[i][2].equals(senhaConta)){
                valorSenha = true;
                break;
            }
        }
        
        if(valorSenha && valorNome){
            matrizUsuarios[indiceConta[0]][0] = "0";
            matrizUsuarios[indiceConta[0]][1] = "0";
            matrizUsuarios[indiceConta[0]][2] = "0";
            return true;
        }
        else{
            return false;
        }
    }
}
