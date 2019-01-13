package domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Residence implements Serializable {
	
	private int idResidence;
	private double taille;
	private int nbrePiece;
	private String chauffage;
	private Collection<EquipementEctro> listEquipementEctro;
	private Personne personne;
	
	@Id
	@GeneratedValue
	public int getIdResidence() {
		return idResidence;
	}
	public void setIdResidence(int idResidence) {
		this.idResidence = idResidence;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public int getNbrePiece() {
		return nbrePiece;
	}
	public void setNbrePiece(int nbrePiece) {
		this.nbrePiece = nbrePiece;
	}
	public String getChauffage() {
		return chauffage;
	}
	public void setChauffage(String chauffage) {
		this.chauffage = chauffage;
	}
	
	@OneToMany(mappedBy="residence")
	public Collection<EquipementEctro> getListEquipementEctro() {
		return listEquipementEctro;
	}
	public void setListEquipementEctro(List<EquipementEctro> listEquipementEctro) {
		listEquipementEctro = listEquipementEctro;
	}
	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
}
