package webpagina;

public class ErrorMessage {
	private static String naamError = "Onjuiste naam";
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
	
	public void setNaamError(String s){
		naamError = s;
	}
	
	
}
