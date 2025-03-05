/**
 * Razred za prikaz modela steklenice, ki vsebuje tekočino
 * @author Tanita Novak
 * @version Primer 15b - Razred v javi
 */
public class Steklenica	{
	
	 
	//deklariramo lastnosti
	
	/**
	 * Kapaciteta steklenice v ml
	 */
	private int kapaciteta;
	
	/**
	 * Stanje odprtosti:
	 * true - odprta
	 * false - zaprta
	 */
	private boolean jeOdprta;
	
	/**
	 * Trenutna količina vsebine
	 */
	private int kolicinaVsebine;
	
	/**
	 * Vrsta vsebine
	 */
	 private String vrstaVsebine;
	
	/**
	 * Konstruktor za inicializiranje nove steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice (ml)
	 * @param v Vrsta vsebine steklenice
	 */
	public Steklenica(int k, String v)	{
		
		//inicializiramo vse lastnosti
		this.kapaciteta = k;
		this.jeOdprta = false;
		this.kolicinaVsebine = k;
		this.vrstaVsebine = v;
		
		//izpišemo podatke o steklenici
		System.out.println("Ustvarjam steklenico " + v + " kapacitete " + k + " ml.");
		
	}
	
	/**
	 * Metoda, ki odpre steklenico 
	 * @return Uspešnost odpiranja
	 * false - že prej je bila odprta 
	 * true - prej ni bila odprta
	 */
	public boolean odpri()	{
		
		//če je steklenica odprta
		if(jeOdprta) {
			return false;
			
		} else {
			jeOdprta = true;
			System.out.println("Odpiram steklenico " + vrstaVsebine + ".");
			return true;
			}
		}
	
	
	/**
	 * Metoda, ki iz steklenice izprazni določeno količino tekočine 
	 * @param k Količina vsebine, ki jo želimo izprazniti (ml)
	 * @return Količina vsebine, ki je ostala v steklenici po praznenju
	 * @throws Exception če je steklenica zaprta
	 */
	public int izprazni(int k) throws Exception	{
		
		//če je steklenica odprta
		if(jeOdprta) {
			
			//količino vsebine zmanjšamo za želeno količino 
			
			System.out.println("Iz steklenice v kateri je " + kolicinaVsebine + " ml " + vrstaVsebine + " praznim " + k + " ml.");
			kolicinaVsebine -= k;
			
			//preverimo ali se je količina preveč zmanjšala
			if(kolicinaVsebine <= 0)	{
				
				//izpiše da je količina vsebine 0
				kolicinaVsebine = 0;
				System.out.println("Steklenica " + vrstaVsebine + " je prazna.");
				
			}
			
		
		
			//če je steklenica zaprta
		}else{
			
			//vrže izjemo
			throw new Exception("Ne morem izprazniti steklenice, ker je zaprta.");
			
		}
		
		//vrnemo količino vsebine
		return kolicinaVsebine;
		
	}
	
}