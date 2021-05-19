package principal;

import java.util.Scanner;

import entidades.Agenda;
import entidades.Contato;

public class Programa {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 Agenda agenda01 = new Agenda();
		 int opcao = 0;
		 
		 while(opcao!=4) {
			 System.out.println("Programa Agenda Java - Adler ");
			 System.out.println("01) Cadastrar contato");
			 System.out.println("02) Buscar pelo contato");
			 System.out.println("03) Deletar contato");
			 System.out.println("04) Finalizar programa");
			 
			 System.out.println("Digite sua opção: ");
			 opcao =scan.nextInt();
			 
			 if(opcao==1) {
				 System.out.println("01) Cadastrar contato");
				 
				 System.out.println("Digite o nome do contato:");
				 String nome = scan.next();
				 
				 System.out.println("Digite o telefone:");
				 int telefone = scan.nextInt();
				 
				 
				 System.out.println("Digite o email: ");
				 String email = scan.next();
				 
				 agenda01.inserirContato(nome, telefone, email);
			 }
			 
			 if(opcao==2) {
				 System.out.println("02) Buscar pelo contato"); 
				 System.out.println("Digite o nome do contato para buscar:");
				 String nomeBusca = scan.next();
				 
				 agenda01.buscaPeloNome(nomeBusca);
				 
				 
			 }
			 if(opcao==3) {
				 System.out.println("03) Deletar contato");
				 System.out.println("Digite o nome do contato para deletar:");
				 String nomeBusca = scan.next();
				 
				 Contato x = new Contato(nomeBusca);
				 
				 agenda01.removerContato(x);
			 }
			 
			 if(opcao==4) {
				 System.out.println("Obrigado por usar o nosso programa.");
				 break;
			 }
		 }
		
	}
}
