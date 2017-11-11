package org.app.service.entities;
import static javax.persistence.CascadeType.ALL;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity

public class Test {
	@Id
	private int IdTest;
	private int IdTipTest;
	private String DescriereTest;
	private Date DataTest;
	
	@ManyToOne
	private Proiect Proiect;
	
	@OneToMany(mappedBy="Test", cascade = ALL, orphanRemoval = false)
	private List<Erori> ListaErori = new ArrayList<>();
	
	@OneToOne
	private TipTeste Tip;
	
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
	public Test() {
		super();
	}
	@Override
	public String toString() {
		return "Test [IdTest=" + IdTest + ", IdTipTest=" + IdTipTest + ", DescriereTest=" + DescriereTest + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DescriereTest == null) ? 0 : DescriereTest.hashCode());
		result = prime * result + IdTest;
		result = prime * result + IdTipTest;
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
		Test other = (Test) obj;
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

}
