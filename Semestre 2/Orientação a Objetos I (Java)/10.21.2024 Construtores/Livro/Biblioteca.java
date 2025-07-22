package book;

import java.util.Scanner;

class Biblioteca {

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        Livro livro1 = new Livro("Game of Thrones", "George R.R. Martin", 5);

        livro1.biblioteca();



    }
}