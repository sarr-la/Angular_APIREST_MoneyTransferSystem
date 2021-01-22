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
public class Recepteur  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String telephone;
	private String cni;
	@JsonIgnore
	@OneToMany(mappedBy="recepteur", fetch = FetchType.LAZY)
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	public List<Envoie> getEnvoies() {
		return envoies;
	}
	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}
	public Recepteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recepteur(Long id, String nom, String prenom, String telephone, String cni, List<Envoie> envoies) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.cni = cni;
		this.envoies = envoies;
	}
	
	
	

}
