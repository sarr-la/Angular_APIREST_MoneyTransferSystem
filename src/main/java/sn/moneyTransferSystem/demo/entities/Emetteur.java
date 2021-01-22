package sn.moneyTransferSystem.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Emetteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String montant;
	
	private String telephone;
	@JsonIgnore
	@OneToMany(mappedBy="emetteur" ,fetch = FetchType.LAZY)
	 private List<Envoie> envoies = new ArrayList<Envoie>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Envoie> getEnvoies() {
		return envoies;
	}

	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Emetteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emetteur(Long id, String nom, String prenom, String montant, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.montant = montant;
		this.telephone = telephone;
	
	}
	
	
	
}
