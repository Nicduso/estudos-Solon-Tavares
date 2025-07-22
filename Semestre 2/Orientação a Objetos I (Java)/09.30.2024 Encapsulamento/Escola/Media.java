package school;

import java.util.Scanner;

class Media {
    public static void main(String[] args){

        Aluno alu1 = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("CALCULE A MÉDIA DO ALUNO");
        System.out.print("Nome do Aluno: ");
        alu1.setNome(scan.next());

        System.out.print("Matrícula: ");
        alu1.setMat(scan.nextInt());

        System.out.println("Descreva as quatro notas: ");
        alu1.setN1(scan.nextDouble());
        alu1.setN2(scan.nextDouble());
        alu1.setN3(scan.nextDouble());
        alu1.setN4(scan.nextDouble());

        System.out.println("<<<<<<<< Média do Aluno >>>>>>>>>>");
        System.out.println("Nome: "+alu1.getNome()+", Matrícula: "+alu1.getMat());
        
        alu1.media();


    }
}
