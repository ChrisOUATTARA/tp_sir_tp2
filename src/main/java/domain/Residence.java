package domain;

import java.io.Serializable;
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
	@OneToMany(mappedBy="residence")
	private List<EquipementEctro> ListEquipementEctro;
	@ManyToOne
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
	public List<EquipementEctro> getListEquipementEctro() {
		return ListEquipementEctro;
	}
	public void setListEquipementEctro(List<EquipementEctro> listEquipementEctro) {
		ListEquipementEctro = listEquipementEctro;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
}
