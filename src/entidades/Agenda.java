package entidades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	
	private List<Contato> contatosLista = new ArrayList<>();
	
	public void inserirContato(String nome, int telefone, String email) {
		contatosLista.add(new Contato(nome,telefone,email));
	}
	
	public List<Contato> buscaPeloNome(String nome){
		
		for(Contato contato : contatosLista) {
			
			if(contato.getNome().equalsIgnoreCase(nome)) {
				System.out.println("\n Nome encontrado ! Segue abaixo as informações: \n");
				System.out.println(contato.toString());
			}
			else {
				System.out.println("\n Contato não existe ! \n");
			}
		}
		return contatosLista;
	}
	
	public List<Contato> buscaPeloTelefone(int telefone){
		
		for(Contato contato : contatosLista) {
			
			if(contato.getTelefone()==telefone) {
				System.out.println("\n Nome encontrado ! Segue abaixo as informações: \n");
				System.out.println(contato.toString());
			}
			else {
				System.out.println("\n Contato não existe ! \n");
			}
		}
		return contatosLista;
	}
	

	public List<Contato> removerContato(Contato contatos) {
		
		try {
		for(Contato contato : contatosLista) {
			
		if(contato.equals(contatos)) {
				contatosLista.remove(contatos);
				System.out.println("Contato removido com sucesso.");
				return contatosLista;
			}
			else {
				System.out.println("\n Contato não existe ! \n");
			}
	
		}
		}
		catch(Exception e) {
			
		}
		return contatosLista;
	}
		
	}



