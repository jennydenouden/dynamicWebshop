package model;

public abstract class Product {
	
	//Constructoren
	public Product(String naam, int prijspereenheid, String imageUrl, int eenheid){}
	public Product(String naam, int prijspereenheid, String imageUrl){}
	
	
	//Concrete methodes
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
	
	
	
	
	//Abstracte methodes
	public abstract String getNaam();
	public abstract int getEenheid();
	public abstract int getPrijsPerEenheid();
	public abstract String getImageURL();
	
	
}
