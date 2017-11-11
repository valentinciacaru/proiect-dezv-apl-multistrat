package org.app.service.entities;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity 
public class Erori {
	@Id
	private int IdEroare;
	private String DescriereEroare;
	private String StatusEroare;
	
	@ManyToOne
	private Test Test;
	
	public int getIdEroare() {
		return IdEroare;
	}
	public void setIdEroare(int idEroare) {
		IdEroare = idEroare;
	}
	public String getDescriereEroare() {
		return DescriereEroare;
	}
	public void setDescriereEroare(String descriereEroare) {
		DescriereEroare = descriereEroare;
	}
	public String getStatusEroare() {
		return StatusEroare;
	}
	public void setStatusEroare(String statusEroare) {
		StatusEroare = statusEroare;
	}
	public Erori(int idEroare, String descriereEroare, String statusEroare) {
		super();
		IdEroare = idEroare;
		DescriereEroare = descriereEroare;
		StatusEroare = statusEroare;
	}
	public Erori() {
		super();
	}
	@Override
	public String toString() {
		return "Erori [IdEroare=" + IdEroare + ", DescriereEroare=" + DescriereEroare + ", StatusEroare=" + StatusEroare
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DescriereEroare == null) ? 0 : DescriereEroare.hashCode());
		result = prime * result + IdEroare;
		result = prime * result + ((StatusEroare == null) ? 0 : StatusEroare.hashCode());
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
		Erori other = (Erori) obj;
		if (DescriereEroare == null) {
			if (other.DescriereEroare != null)
				return false;
		} else if (!DescriereEroare.equals(other.DescriereEroare))
			return false;
		if (IdEroare != other.IdEroare)
			return false;
		if (StatusEroare == null) {
			if (other.StatusEroare != null)
				return false;
		} else if (!StatusEroare.equals(other.StatusEroare))
			return false;
		return true;
	}

}
