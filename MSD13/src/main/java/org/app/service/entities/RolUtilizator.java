package org.app.service.entities;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity

public class RolUtilizator {
	@Id
	private int IdUtilizator;
	private String Rol;
	private String DescriereRol;
	
	@ManyToOne
	private Utilizatori Utilizator;
	
	public int getIdUtilizator() {
		return IdUtilizator;
	}
	public void setIdUtilizator(int idUtilizator) {
		IdUtilizator = idUtilizator;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	public String getDescriereRol() {
		return DescriereRol;
	}
	public void setDescriereRol(String descriereRol) {
		DescriereRol = descriereRol;
	}
	public RolUtilizator(int idUtilizator, String rol, String descriereRol) {
		super();
		IdUtilizator = idUtilizator;
		Rol = rol;
		DescriereRol = descriereRol;
	}
	public RolUtilizator() {
		super();
	}
	@Override
	public String toString() {
		return "RolUtilizator [IdUtilizator=" + IdUtilizator + ", Rol=" + Rol + ", DescriereRol=" + DescriereRol + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DescriereRol == null) ? 0 : DescriereRol.hashCode());
		result = prime * result + IdUtilizator;
		result = prime * result + ((Rol == null) ? 0 : Rol.hashCode());
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
		RolUtilizator other = (RolUtilizator) obj;
		if (DescriereRol == null) {
			if (other.DescriereRol != null)
				return false;
		} else if (!DescriereRol.equals(other.DescriereRol))
			return false;
		if (IdUtilizator != other.IdUtilizator)
			return false;
		if (Rol == null) {
			if (other.Rol != null)
				return false;
		} else if (!Rol.equals(other.Rol))
			return false;
		return true;
	}

}
