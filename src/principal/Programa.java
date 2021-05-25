package principal;

import java.util.List;
import java.util.Scanner;

import adicionais.VerificaEmail;
import entidades.Agenda;
import entidades.Contato;

public class Programa {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 Agenda agenda01 = new Agenda();
		 int opcao = 0;
		 
		 while(opcao!=5) {
			 System.out.println("Programa Agenda Java - Adler ");
			 System.out.println("01) Cadastrar contato");
			 System.out.println("02) Buscar contato pelo nome");
			 System.out.println("03)Buscar contato pelo telefone");
			 System.out.println("04) Deletar contato");
			 System.out.println("05) Finalizar programa");
			 
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
				 
				 if(nome==null) {
					 System.out.println("Você não digitou seu nome");
				 }else {
				 				 
				 if(VerificaEmail.verificaEmail(email)) {

					 agenda01.inserirContato(nome, telefone, email);
					 System.out.println("Cadastro realizado ! ");
				 }
				 else {
					 System.out.println("Erro ao cadastrar o email, você digitou alguma coisa errada.");
					 System.out.println("Iremos retornar ao menu principal para você realizar o cadastro novamente");
				 }
				 }
			 }
			 
			 if(opcao==2) {
				 System.out.println("02) Buscar pelo contato"); 
				 System.out.println("Digite o nome do contato para buscar:");
				 String nomeBusca = scan.next();
				 if(nomeBusca!=null) {
				 agenda01.buscaPeloNome(nomeBusca);
				 }
				 else {
					 System.out.println("Você esqueceu de digitar o nome");
				 }
				 
			 }
			 if(opcao==3) {
				 System.out.println("03)Buscar contato pelo telefone");
				 System.out.println("Digite o telefone do contato para buscar:");
				 int telefoneBusca = scan.nextInt();
				 
		
				agenda01.buscaPeloTelefone(telefoneBusca);
				 
				 
			 }
			 
			 
			 if(opcao==4) {
				 System.out.println("04) Deletar contato");
				 System.out.println("Digite o nome do contato para deletar:");
				 String nomeBusca = scan.next();
				 
				List<Contato> agendaRemover = agenda01.buscaPeloNome(nomeBusca);
				 
				 
				 agenda01.removerContato(agendaRemover.get(0));
			 }
			 
			 if(opcao==5) {
				 System.out.println("Obrigado por usar o nosso programa.");
				 break;
			 }
		 }
		
	}
}
