package model;

public class BeperktProduct extends Product {
	//Instantievariabelen
	private String naam;
	private int prijsPerEenheid;
	private String imgUrl;
	private int eenheid;
	private String description = "BESCHRIJVING HIER";
	
	
	//Constructors
	public BeperktProduct(String naam, int prijsPerEenheid, String imgUrl, int eenheid) {
		super(naam, prijsPerEenheid, imgUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imgUrl = imgUrl;
		this.eenheid = eenheid;
	}
	
	public BeperktProduct(String naam, int prijsPerEenheid, String imgUrl) {
		super(naam, prijsPerEenheid, imgUrl);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imgUrl = imgUrl;
		this.eenheid = Product.STUK;
	}
	
	/*
	 * @Override Overschrijft de getPrijs methode van Product, zodat
	 * deze alleen aangeroepen kan worden met 1 als argument.
	 * @see model.Product#getPrijs(int)
	 */
	public int getPrijs(int aantal){
		//Ik weet niet wat ik hiervan denk. Klinkt niet heel netjes,
		//maar ik weet niks beters.
		return super.getPrijs(1);
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
	 * @Override Implementeert de getImageURL methode. Geeft een String
	 * met daarin de URL van het plaatje van het product.
	 * @see model.Product#getImageURL()
	 */
	public String getImageURL() {
		return this.imgUrl;
	}

	/*
	 * @Override Implementeert de getDescription methode. Geeft een String
	 * met daarin een omschrijving van het product.
	 * @see model.Product#getDescription()
	 */
	public String getDescription() {
		return this.description;
	}

}
