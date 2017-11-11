package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	public Proiect buildProiect (Integer IdProiect, String NumeProiect, String DescriereProiect, Integer UtilizatoriCount)
	{
		Proiect proiect  = new Proiect(IdProiect, NumeProiect, DescriereProiect);
		List<Utilizatori> ListaUtilizatori = new ArrayList<>();
		
		for (int i=0; i<=UtilizatoriCount-1; i++)
		{
			ListaUtilizatori.add(new Utilizatori (i, "U:" + proiect.getIdProiect() + "." + i + proiect.getNumeProiect() + "." + proiect.getDescriereProiect(), "U:" + proiect.getIdProiect() + "." + i + proiect.getNumeProiect() + "." + proiect.getDescriereProiect() + "@email"));			
		}
		
		proiect.setUtilizatori(ListaUtilizatori);
		return proiect;
	}
}
