package dao;

import java.util.Collection;

import metier.Client;

public interface IDao {
	public void ajouterClient(Client c);
	public void modifierClient(int id, String nom, String prenom,int age);
	public void supprimerClient(int id);
	public Collection<Client> listerClients();
	// recherche par mot cl� de nom
	public Collection<Client> chercherParMC(String mc);
	public Client chercherClient(int id);
}
