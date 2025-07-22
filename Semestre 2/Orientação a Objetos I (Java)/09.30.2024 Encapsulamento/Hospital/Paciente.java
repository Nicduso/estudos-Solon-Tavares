package hospital;

import java.util.Scanner;

class Paciente {

    private String nome;
    private int idade;
    private String data, hora;
    private String[] consulta;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void consulta(){

        int n = 0;
        int i;
        int indice = n + 1;
        int op = 1;
        Scanner scan = new Scanner(System.in);

        while (op <= 3) {
            
            System.out.println ("Escolha entre as seguintes opções:\n 1 - Cadastrar nova consulta\n 2 - Consultar todas as consultas\n 3 - Encerrar programa");
            System.out.print ("Opção: ");
            op = scan.nextInt();

            if (op == 1) {

            System.out.print("Data da consulta: ");
            this.data = scan.next();

            System.out.print("Hora da consulta: ");
            this.hora = scan.next();

            this.consulta[n] = ("Consulta "+indice+": \n Data: "+data+"\n Hora: "+hora);

            n++;

            } else {
                
                if (op == 2) {
                    for (i = 0; i <= n; i++) {
                        
                        System.out.println(this.consulta[i]+"\n");

                    }
                }

            }

        }

        System.out.println ("Obrigado por consultar. Volte sempre!");

    }





}