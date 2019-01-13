package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EquipementEctro implements Serializable {
	private int idEquipementEctro;
	private double consommation;
	@ManyToOne
	private Residence residence;
	
	@Id
	@GeneratedValue
	public int getIdEquipementEctro() {
		return idEquipementEctro;
	}
	public void setIdEquipementEctro(int idEquipementEctro) {
		this.idEquipementEctro = idEquipementEctro;
	}
	public double getConsommation() {
		return consommation;
	}
	public void setConsommation(double consommation) {
		this.consommation = consommation;
	}
	public Residence getResidence() {
		return residence;
	}
	public void setResidence(Residence residence) {
		this.residence = residence;
	}
	
	

}
