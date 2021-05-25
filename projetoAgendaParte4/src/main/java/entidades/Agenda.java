package entidades;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Agenda {

	Contato contatos;
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("agenda-jpa");
	public static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void inserirContato(String nome, int telefone, String email) {
		contatos = new Contato(null, nome, telefone, email);
		entityManager.getTransaction().begin();
		entityManager.persist(contatos);
		entityManager.getTransaction().commit();

	}

	public void buscaPeloNome(String nome) {
		String sql = "SELECT c FROM Contato c WHERE nome = :buscaNome ";
		String buscaNome = nome;

		TypedQuery<Contato> query = entityManager.createQuery(sql, Contato.class).setParameter("buscaNome", buscaNome);
		List<Contato> listaContato = query.getResultList();

		if (listaContato.size() == 0) {
			System.out.println(" ");
			System.out.println("Contato não existe, por favor digite outro");
		} else {
			for (Contato contato : listaContato) {
				System.out.println(contato.toString());

			}
		}
	}

	public void buscaPeloTelefone(int telefone) {

		String sql = "SELECT c FROM Contato c WHERE telefone = :buscaTelefone ";
		int buscaTelefone = telefone;

		TypedQuery<Contato> query = entityManager.createQuery(sql, Contato.class).setParameter("buscaTelefone",
				buscaTelefone);
		List<Contato> listaContato = query.getResultList();

		if (listaContato.size() == 0) {
			System.out.println(" ");
			System.out.println("Contato não existe, por favor digite outro");
		} else {
			for (Contato contato : listaContato) {
				System.out.println(contato.toString());

			}
		}
	}

	public void buscaEmail(String email) {
		String sql = "SELECT c FROM Contato c WHERE email = :buscaEmail ";
		String buscaEmail = email;

		TypedQuery<Contato> query = entityManager.createQuery(sql, Contato.class).setParameter("buscaEmail",
				buscaEmail);
		List<Contato> listaContato = query.getResultList();

		if (listaContato.size() == 0) {
			System.out.println(" ");
			System.out.println("Contato não existe, por favor digite outro");
		} else {
			for (Contato contato : listaContato) {
				System.out.println(contato.toString());

			}
		}

	}

	public void removerContato(String nome) {
		String sql = "SELECT c FROM Contato c WHERE nome = :buscaNome ";
		String buscaNome = nome;

		TypedQuery<Contato> query = entityManager.createQuery(sql, Contato.class).setParameter("buscaNome", buscaNome);
		List<Contato> listaContato = query.getResultList();

		if (listaContato.size() == 0) {
			System.out.println(" ");
			System.out.println("Contato não existe, por favor digite outro");
		} else {
			String removeNome = nome;
			entityManager.getTransaction().begin();
			entityManager.createQuery("DELETE FROM Contato c WHERE nome = :removeNome")
					.setParameter("removeNome", removeNome).executeUpdate();
			entityManager.getTransaction().commit();

			System.out.println(" ");
			System.out.println("Contato Deletado com Sucesso");

		}
	}
}
