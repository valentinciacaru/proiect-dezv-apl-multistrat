package org.app.service.entities;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipTeste {
	@Id
private int IdTipTest;
private String TipTest;
public int getIdTipTest() {
	return IdTipTest;
}
public void setIdTipTest(int idTipTest) {
	IdTipTest = idTipTest;
}
public String getTipTest() {
	return TipTest;
}
public void setTipTest(String tipTest) {
	TipTest = tipTest;
}
public TipTeste(int idTipTest, String tipTest) {
	super();
	IdTipTest = idTipTest;
	TipTest = tipTest;
}
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + IdTipTest;
	result = prime * result + ((TipTest == null) ? 0 : TipTest.hashCode());
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TipTeste other = (TipTeste) obj;
	if (IdTipTest != other.IdTipTest)
		return false;
	if (TipTest == null) {
		if (other.TipTest != null)
			return false;
	} else if (!TipTest.equals(other.TipTest))
		return false;
	return true;
}
public String toString() {
	return "TipTeste [IdTipTest=" + IdTipTest + ", TipTest=" + TipTest + "]";
}
public TipTeste() {
	super();
}




}
