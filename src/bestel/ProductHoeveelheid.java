package bestel;

import model.Product;

/*
 * Klasse ProductHoeveelheid representeert een bestelregel in een 
 * winkelwagen.
 */
public class ProductHoeveelheid {

	//Instantievariabelen
	private Product product;
	private int hoeveelheid;
	
	//Constructors
	ProductHoeveelheid(Product product, int hoeveelheid){
		this.product = product;
		this.hoeveelheid = hoeveelheid;
	}
	
	ProductHoeveelheid(Product product){
		this(product, 1);
	}
	
	/*
	 * Geeft de totale prijs van deze bestelregel
	 */
	public int getPrijs(){
		return this.product.getPrijs(hoeveelheid);
	}
	
	/*
	 * Geeft de naam van het product dat wordt besteld
	 */
	public String getProductNaam(){
		return this.product.getNaam();
	}
	
	/*
	 * Geeft het aantal stuks dat van dit product is besteld
	 */
	public int getHoeveelheid(){
		return this.hoeveelheid;
	}
	
	/*
	 * Verandert het aantal stuks dat van dit product wordt
	 * besteld in de meegegeven hoeveelheid
	 */
	public void setHoeveelheid(int hoeveelheid){
		this.hoeveelheid = hoeveelheid;
	}
	
}
