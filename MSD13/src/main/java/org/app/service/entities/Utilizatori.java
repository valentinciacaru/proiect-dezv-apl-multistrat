package org.app.service.entities;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Utilizatori {
	@Id
	private int IdUtilizator;
	private String NumePrenume ;
	private String EmailUtilizator;
	public int getIdUtilizator() {
		return IdUtilizator;
	}
	public void setIdUtilizator(int idUtilizator) {
		IdUtilizator = idUtilizator;
	}
	public String getNumePrenume() {
		return NumePrenume;
	}
	public void setNumePrenume(String numePrenume) {
		NumePrenume = numePrenume;
	}
	public String getEmailUtilizator() {
		return EmailUtilizator;
	}
	public void setEmailUtilizator(String emailUtilizator) {
		EmailUtilizator = emailUtilizator;
	}
	public Utilizatori(int idUtilizator, String numePrenume, String emailUtilizator) {
		super();
		IdUtilizator = idUtilizator;
		NumePrenume = numePrenume;
		EmailUtilizator = emailUtilizator;
	}
	public Utilizatori() {
		super();
	}
	@Override
	public String toString() {
		return "Utilizatori [IdUtilizator=" + IdUtilizator + ", NumePrenume=" + NumePrenume + ", EmailUtilizator="
				+ EmailUtilizator + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmailUtilizator == null) ? 0 : EmailUtilizator.hashCode());
		result = prime * result + IdUtilizator;
		result = prime * result + ((NumePrenume == null) ? 0 : NumePrenume.hashCode());
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
		Utilizatori other = (Utilizatori) obj;
		if (EmailUtilizator == null) {
			if (other.EmailUtilizator != null)
				return false;
		} else if (!EmailUtilizator.equals(other.EmailUtilizator))
			return false;
		if (IdUtilizator != other.IdUtilizator)
			return false;
		if (NumePrenume == null) {
			if (other.NumePrenume != null)
				return false;
		} else if (!NumePrenume.equals(other.NumePrenume))
			return false;
		return true;
	}

}
