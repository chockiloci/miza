/**
 * Razred za prikaz uporabe dedovanja
 * @author Tanita Novak
 * @version Primer 20
 */
	public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca	{
	
	//vse lastnosti od nadrazreda se prenesejo
	//deklariramo dodatne lastnosti, ki so skupne le pivskim steklenicam
	
	/**
	 * znamka piva
	 */
	private String znamka;
	
	/**
	 * temperatura piva v stopinjah
	 */
	private double temperatura;
	
	/**
	 * temperatura alkohola piva v odstotkih in ne deležu
	 */
	private double stopnjaAlkohola; 
	
	/**
	 * Konstruktor za inicializiranje nove steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 * @param t Začetna temperatura
	 * @param s Stopnja alkohola v odstotkih
	 */
	public PivskaSteklenica(int k, String z, double t, double s)	{
		
		//pokličemo konstruktor nadrazreda - steklenica
		//ta bo inicializiral lastnosti nadrazreda
		super(k, "Pivo");
		
		//inicializiramo dodatne lastnosti
		znamka = z;
		temperatura = t;
		stopnjaAlkohola = s;
		System.out.println("Pivska steklenica je znamke " + z + " s stopnjo alkohola " + s + ".");
	}
	
	/**
	 * Konstruktor za inicializiranje nove steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 */
	public PivskaSteklenica(int k, String z, double t)	{
		
		//pokličemo drug konstruktor
		this(k, z, t, 4.50);
	
}
	
   	/**
	 * Konstruktor za inicializiranje nove steklenice, ki je polna in zaprta
	 * Inicializira vse lastnosti
	 * @param k Kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 */
	public PivskaSteklenica(int k, String z)	{
		
		//pokličemo drug konstruktor
		this(k, z, 8.0);
	
}
	/**
	 * metoda predpisana z vmesnikom AlkoholnaPijaca
	 * vrne stopnjo alkohola v odstotkih
	 */
	 public double getStopnjaAlkohola() {
		return stopnjaAlkohola;
	 }
	 
	 /**
	 * metoda vrne znamko pivaa
	 * @return Znamka piva
	 */
	 public String getZnamka() {
		return znamka;
	 }
}	