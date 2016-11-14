package webpagina;

public class Adresgegevens {

	private String naam;
	private String adres;
	private String postcode;
	private String telNr;
	
	private static final String naamError = "Onjuiste naam";
	private static final String adresError = "Onjuist adres, geef een straatnaam zonder spaties en een nummer zonder toevoegingen";
	private static final String postcodeError = "Onjuiste postcode, geef een postcode van 4 cijfers gevolgd door een spatie en dan 2 letters";
	private static final String telNrError = "Onjuist telefoonnummer, geeft een nummer met 10 cijfers";
	
	public String getNaamerror() {
		return naamError;
	}
	public String getAdreserror() {
		return adresError;
	}
	public String getPostcodeerror() {
		return postcodeError;
	}
	public String getTelnrerror() {
		return telNrError;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getTelNr() {
		return telNr;
	}
	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
	
	public boolean nameValid(){
		return naam != null &&
				!naam.equals("");
	}
	public boolean adresValid(){
		return (adres != null && 
				!adres.equals("") && 
				adres.split(" ").length == 2  && 
				isNumber(adres.split(" ")[1]));
	}
	public boolean postcodeValid(){
		return postcode != null &&
				!postcode.equals("") && 
				postcode.split(" ").length == 2 && 
				isNumber(postcode.split(" ")[0]) && 
				postcode.split(" ").length == 4 &&
				isTwoLetters(postcode.split(" ")[1]);
	}
	public boolean telNrValid(){
		return telNr != null &&
				telNr.length() == 10 &&
				isNumber(telNr);
	}
	
	public boolean getAllFieldsEmpty(){
		boolean result = naam == null && adres == null && postcode == null && telNr == null;		
		naam = adres = postcode = telNr = "";		
		return result;
	}
	
	
	//Hulpmethodes
	private boolean isNumber(String s){
		boolean result;
		
		try{
			int i = Integer.parseInt(s);
			result = true;
		}
		catch(NumberFormatException n){
			result = false;
		}
		
		return result;
	}
	
	private boolean isTwoLetters(String s){
		boolean result = s.length() == 2;
		for(int i = 0; i < 2; i++){
			result &= Character.isLetter(s.charAt(i));
		}
		
		return result;
	}
	
}
