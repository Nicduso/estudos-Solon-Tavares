package list;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main (String[] args) {
		
		ArrayList<Clientes> lista = new ArrayList<Clientes>();
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			Clientes cli = new Clientes();
			System.out.println("Entre com o nome: ");
			cli.setNome(ler.next());
			System.out.println("Entre com o endereço: ");
			cli.setEnd(ler.next());
			System.out.println("Entre com o telefone: ");
			cli.setFone(ler.nextInt());
			lista.add(cli);
		}
		
		for (Clientes c : lista) {
			System.out.println(c.getNome()+" - "+c.getEnd()+" - "+c.getFone());
		}
		
		System.out.println("Selecione a posição a ser alterada:");
		int p = ler.nextInt();
		
		Clientes cli = new Clientes();
		System.out.println("Entre com o nome: ");
		cli.setNome(ler.next());
		System.out.println("Entre com o endereço: ");
		cli.setEnd(ler.next());
		System.out.println("Entre com o telefone: ");
		cli.setFone(ler.nextInt());
		lista.set(p, cli);
		
		for (Clientes c : lista) {
			System.out.println(c.getNome()+" - "+c.getEnd()+" - "+c.getFone());
		}
		
		System.out.println("Selecione a posição para excluir:");
		p = ler.nextInt();
		
		lista.remove(p);
		
		for (Clientes c : lista) {
			System.out.println(c.getNome()+" - "+c.getEnd()+" - "+c.getFone());
		}
		
		System.out.println("Tamanho do ArrayList: "+lista.size());
		
	}
	
}
