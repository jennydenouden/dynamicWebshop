package bestel;

import java.util.ArrayList;

import model.Product;

/*
 * Klasse winkelwagen bevat alle bestellingen van de klant
 */
public class Winkelwagen {

	//Instantievariabelen
	private ArrayList<ProductHoeveelheid> bestellingen = new ArrayList<>();
	
	/*
	 * Geeft de totale prijs van alle producten in de winkelwagen
	 */
	public int getTotaalPrijs(){
		int result = 0;
		for(ProductHoeveelheid ph : this.bestellingen){
			result += ph.getPrijs();
		}
		
		return result;
	}
	
	/*
	 * Geeft de lijst met bestellinegn in de winkelwagen
	 */
	public ArrayList<ProductHoeveelheid> getBestellingen(){
		return this.bestellingen;
	}
	
	/*
	 * Voegt een nieuwe bestelregel toe, met hoeveelheid producten
	 */
	public void bestel(Product product, int hoeveelheid){
		ProductHoeveelheid ph = new ProductHoeveelheid(product, hoeveelheid);
		this.bestellingen.add(ph);
	}
	
}
