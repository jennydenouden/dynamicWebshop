package model;

/*
 * Product waarbij je meer korting krijgt naar mate je meer eenheden bestelt
 */
public class KwantumKortingProduct extends Product {
	//Instantievariabelen
	private String naam;
	private int prijsPerEenheid;
	String imgUrl;
	int eenheid;
	
	//Constructors
	public KwantumKortingProduct(String naam, int prijsPerEenheid, String imgUrl, int eenheid) {
		super(naam, prijsPerEenheid, imgUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imgUrl = imgUrl;
		this.eenheid = eenheid;
	}
	
	public KwantumKortingProduct(String naam, int prijsPerEenheid, String imgUrl) {
		super(naam, prijsPerEenheid, imgUrl);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imgUrl = imgUrl;
		this.eenheid = Product.STUK;
	}
	
	/*
	 * @Override Implementeert de getNaam methode. Geeft de naam
	 * van het product.
	 * @see model.Product#getNaam()
	 */
	public String getNaam() {
		return this.naam;
	}

	/*
	 * @Override Implementeert de getEenheid methode. Geeft de eenheid
	 * waarin het product wordt aangegeven.
	 * @see model.Product#getEenheid()
	 */
	public int getEenheid() {
		return this.eenheid;
	}

	/*
	 * @Override Implementeert de getPrijsPerEenheid methode. Geeft de
	 * prijs voor een eenheid van het product.
	 * @see model.Product#getPrijsPerEenheid()
	 */
	public int getPrijsPerEenheid() {
		return this.prijsPerEenheid;
	}
	
	/*
	 * @Override Overschrijft de getPrijs methode van Product. Deze 
	 * nieuwe methode geeft meer korting naar mate er meer eenheden
	 * van het product worden besteld. 
	 * De prijs per product wordt berekend volgens de volgende formule:
	 * prijs = prijs per eenheid * 0.99^aantal.
	 * @see model.Product#getPrijs(int)
	 */
	public int getPrijs(int aantal){
		return (int)(this.prijsPerEenheid * (Math.pow(0.99, aantal)));
	}

	/*
	 * @Override Implementeert de getImageURL methode. Geeft een String
	 * met daarin de URL van het plaatje van het product.
	 * @see model.Product#getImageURL()
	 */
	public String getImageURL() {
		return this.imgUrl;
	}

}
