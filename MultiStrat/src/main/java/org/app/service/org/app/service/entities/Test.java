package org.app.service.entities;

import java.util.Date;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Test {
	@Id
private int IdTest;
private int IdTipTest;
private String DescriereTest;
private Date DataTest;
public int getIdTest() {
	return IdTest;
}
public void setIdTest(int idTest) {
	IdTest = idTest;
}
public int getIdTipTest() {
	return IdTipTest;
}
public void setIdTipTest(int idTipTest) {
	IdTipTest = idTipTest;
}
public String getDescriereTest() {
	return DescriereTest;
}
public void setDescriereTest(String descriereTest) {
	DescriereTest = descriereTest;
}
public Date getDataTest() {
	return DataTest;
}
public void setDataTest(Date dataTest) {
	DataTest = dataTest;
}
public Test(int idTest, int idTipTest, String descriereTest, Date dataTest) {
	super();
	IdTest = idTest;
	IdTipTest = idTipTest;
	DescriereTest = descriereTest;
	DataTest = dataTest;
}
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((DataTest == null) ? 0 : DataTest.hashCode());
	result = prime * result
			+ ((DescriereTest == null) ? 0 : DescriereTest.hashCode());
	result = prime * result + IdTest;
	result = prime * result + IdTipTest;
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Test other = (Test) obj;
	if (DataTest == null) {
		if (other.DataTest != null)
			return false;
	} else if (!DataTest.equals(other.DataTest))
		return false;
	if (DescriereTest == null) {
		if (other.DescriereTest != null)
			return false;
	} else if (!DescriereTest.equals(other.DescriereTest))
		return false;
	if (IdTest != other.IdTest)
		return false;
	if (IdTipTest != other.IdTipTest)
		return false;
	return true;
}
public String toString() {
	return "Test [IdTest=" + IdTest + ", IdTipTest=" + IdTipTest
			+ ", DescriereTest=" + DescriereTest + ", DataTest=" + DataTest
			+ "]";
}
public Test() {
	super();
}



}
