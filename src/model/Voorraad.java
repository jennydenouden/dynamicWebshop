package model;

import java.util.HashMap;

public class Voorraad {
	private static HashMap<Product, Integer> voorraad = new HashMap<>();
	
	static{
		//15 vlinders
		voorraad.put(new DefaultProduct("Opgezette vlinder", 120, "/DynamicWebshop/images/atalanta.jpg", Product.STUK),15);
		
		//15 lampen
		voorraad.put(new DefaultProduct("Industriële bouwlamp", 160, "https://s.s-bol.com/imgbase0/imagebase/large/FC/9/0/8/3/9200000010483809.jpg", Product.STUK), 15);
	}
	
	/*
	 * Geeft het product op index i in de map, als het er in
	 * staat. Als het product er niet in staat, geeft hij null.
	 */
	public static Product get(int index){
		int i = 0;
		Product result = null;
		for(Product p : voorraad.keySet()){
			if(i == index){
				result = p;
			}
			i++;
		}
		
		return result;
	}
	
	/*
	 * Haalt het meegegeven aantal van het gespecificeerde product uit
	 * de voorraad. Als er meer producten worden weggehaald dan in de
	 * voorraad beschikbaar zijn, mislukt de actie. Je krijgt een boolean
	 * terug die waar is als de producten weggehaald zijn, en onwaar als
	 * de actie mislukt is.
	 */
	public static boolean removeProducts(Product product, int aantal){
		boolean result = true;
		int aantalInStore = voorraad.get(product);
		if(aantalInStore > aantal){
			voorraad.put(product, aantalInStore-aantal);
		}
		else if(aantalInStore == aantal){
			voorraad.remove(product);
		}
		else{
			result = false;
		}
		
		return result;
	}
	
	
	
	
}
