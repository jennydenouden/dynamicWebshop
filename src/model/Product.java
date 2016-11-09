package model;

public abstract class Product {
	//Constantes eenheden
	public static final int GRAM = 1;
	public static final int KILO = 2;
	public static final int LITER = 3;
	public static final int STUK = 4;
	public static final int PAK = 5;
	
	
	
	//Constructoren
	public Product(String naam, int prijspereenheid, String imageUrl, int eenheid){}
	public Product(String naam, int prijspereenheid, String imageUrl){}
	
	
	//Concrete methodes
	/*
	 * Geeft de prijs voor hoeveelheid artikelen
	 */
	public int getPrijs(int hoeveelheid){	
		return hoeveelheid * getPrijsPerEenheid();
	}
	
	
	/*
	 * Geeft beschrijving met naam, eenheid, en prijs
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "[" + getNaam() + ", " + getEenheid() + ", " + getPrijsPerEenheid() + "]";
	}
	
	/*
	 * Geeft een String representatie van de meegegeven eenheid
	 */
	public static String getEenheidNaam(int eenheid){
		String result = "";
		switch(eenheid){
			case GRAM : 
				result = "gram";
				break;
			case KILO :
				result = "kilo";
				break;
			case LITER :
				result = "liter";
				break;
			case STUK :
				result = "stuk";
				break;
			case PAK :
				result = "pak";
				break;
		}
		
		return result;
	}
	
	
	
	//Abstracte methodes
	public abstract String getNaam();
	public abstract int getEenheid();
	public abstract int getPrijsPerEenheid();
	public abstract String getImageURL();
	
	
}
