package cptBanc;

import java.util.HashMap;

public class FlyweightPaysFactory 
{
	private static final HashMap<String, Pays> paysHash = new HashMap<String, Pays>();
	
	public static Pays getPays(String nom)
	{
		Pays country = (Pays)paysHash.get(nom);
				
		if(country == null)
		{
			country = new Pays(nom);
			paysHash.put(country.getNom(), country);
		}
		return country;
	}
}
