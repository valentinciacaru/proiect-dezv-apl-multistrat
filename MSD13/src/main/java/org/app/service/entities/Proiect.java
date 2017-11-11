package org.app.service.entities;
import java.util.*;  
import javax.persistence.Entity;
import javax.persistence.Id;


public class Proiect {
	@Id
	private int IdProiect;
	private String NumeProiect;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DescriereProiect == null) ? 0 : DescriereProiect.hashCode());
		result = prime * result + IdProiect;
		result = prime * result + ((NumeProiect == null) ? 0 : NumeProiect.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proiect other = (Proiect) obj;
		if (DescriereProiect == null) {
			if (other.DescriereProiect != null)
				return false;
		} else if (!DescriereProiect.equals(other.DescriereProiect))
			return false;
		if (IdProiect != other.IdProiect)
			return false;
		if (NumeProiect == null) {
			if (other.NumeProiect != null)
				return false;
		} else if (!NumeProiect.equals(other.NumeProiect))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Proiect [IdProiect=" + IdProiect + ", NumeProiect=" + NumeProiect + ", DescriereProiect="
				+ DescriereProiect + "]";
	}
	public Proiect() {
		super();
	}
	public Proiect(int idProiect, String numeProiect, String descriereProiect) {
		super();
		IdProiect = idProiect;
		NumeProiect = numeProiect;
		DescriereProiect = descriereProiect;
	}
	public int getIdProiect() {
		return IdProiect;
	}
	public void setIdProiect(int idProiect) {
		IdProiect = idProiect;
	}
	public String getNumeProiect() {
		return NumeProiect;
	}
	public void setNumeProiect(String numeProiect) {
		NumeProiect = numeProiect;
	}
	public String getDescriereProiect() {
		return DescriereProiect;
	}
	public void setDescriereProiect(String descriereProiect) {
		DescriereProiect = descriereProiect;
	}
	private String DescriereProiect;

}
