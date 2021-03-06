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
	 * Voegt een nieuwe bestelregel toe, met hoeveelheid producten. Als
	 * er al een bestelregel voor dat product staat, wordt die aangepast.
	 */
	public void bestel(Product product, int hoeveelheid){
		boolean found = false;
		for(ProductHoeveelheid ph : bestellingen){
			if(ph.getProductNaam().equals(product.getNaam())){
				found = true;
				ph.setHoeveelheid(ph.getHoeveelheid()+hoeveelheid);;
			}
		}
		
		if(!found){
			ProductHoeveelheid ph = new ProductHoeveelheid(product, hoeveelheid);
			this.bestellingen.add(ph);
		}
	}
	
	/*
	 * ToString methode voor winkelwagen
	 */
	public String toString(){
		String result = "{\n";
		for(ProductHoeveelheid ph : bestellingen){
			result += ph.getHoeveelheid() + "x " + ph.getProductNaam() + "\n";
		}
		result += "}";
		
		return result;
	}
	
}
