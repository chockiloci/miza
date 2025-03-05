//uvozimo paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
 import java.io.* ;
 
 //uvozimo paket za delo s seznami
 import java.util.*;

/**
 * Razred za prikaz objektivno orijentiranega programiranja
 * @author Tanita Novak
 * @version Primer 19a - implementacija
 */
class HelloWorld	{
	
	/**
	 * Dodamo statični atribut za branje konzole(tipkovnice)
	 */
	private static BufferedReader in;
	
	/**
	 * Seznam objektov tipa PivskaSteklenica
	 */
	private static ArrayList<PivskaSteklenica> pivskeSteklenice;
	
	/**
	 * Glavna metoda programa. Zažene se vedno ob zagonu. 
	 * @param args Seznam argumentov iz ukazne vrstice. 
	 */
	
	public static void main(String[] args)	{
		
		//izpišemo pozdrav v konzolo
		System.out.println("Pozdravljen, svet!");
		
		//inicializiramo objekt in za zajem podatkov iz tipkovnice preko konzole
		in = new BufferedReader(new InputStreamReader(System.in));
		
		//inicializiramo seznam
		pivskeSteklenice = new ArrayList<>();
				
		//vnos podatkov o pivski steklenici
		System.out.print("Vnesi znamko piva: ");
		
		//poskusimo prebrati iz ukazne konzole
		String znamkaPiva = "";
		int velikostSteklenice = 500;
		double temperaturaSteklenice = 5.0;
		try	{
			znamkaPiva = in.readLine();
			
			//če gre za malo pivo, nastavimo velikost na 250ml
			System.out.print("Je pivo veliko(d/n)? ");
			if(in.readLine().equals("n"))   {
				velikostSteklenice = 250;
			}
			
			//vnos podatkov v pivski steklenici - temperatura
			System.out.print("Vnesi temperaturo piva: ");
			temperaturaSteklenice = Double.parseDouble(in.readLine());
			
		}
		catch(Exception	e)	{
			System.out.println("Napaka pri branju podatkov o steklenici piva: " + e);
		}
		
		//ustvarimo objekt tipa steklenica
		Steklenica plastenkaVode = new Steklenica(500, "Voda");
		PivskaSteklenica mojePivo = new PivskaSteklenica(velikostSteklenice, znamkaPiva, temperaturaSteklenice);
		
		//objekt dodamo v seznam
		pivskeSteklenice.add(mojePivo);
		
		//izpijemo požirek piva
		try {
		System.out.println("Po požirku je v steklenici " + mojePivo.izprazni(30) + " ml.");
		}
		catch(Exception e)	{
		System.out.println("Izjema pri praznenju steklenice: " + e);
		}
		mojePivo.odpri();
		try {
		System.out.println("Po požirku je v steklenici " + mojePivo.izprazni(30) + " ml.");
		}
		catch(Exception e)	{
		System.out.println("Izjema pri praznenju steklenice: " + e);
		}
		
		//V seznam dodamo še nekaj anonimnih objektov
		pivskeSteklenice.add(new PivskaSteklenica(500, "Kozorog", 8.0));
		pivskeSteklenice.add(new PivskaSteklenica(250, "Union", 9.0));
		pivskeSteklenice.add(new PivskaSteklenica(500, "Smile", 5.0));
		
		//izpišemo št. steklenic na seznam
		System.out.println("V seznamu je/sta/so " + pivskeSteklenice.size() + " steklenic.");
		
		//odpremo vse steklenice na seznamu
		for(int c=0; c<pivskeSteklenice.size();c++)	{
			//odpremo trenutno pivsko steklenico
			pivskeSteklenice.get(c).odpri();
		}
		
		//izpijemo požirek vode
		plastenkaVode.odpri();
		
		try   {
		System.out.println("Po požirku je v plastenki " + plastenkaVode.izprazni(50) + " ml.");
		}
		catch(Exception e)	{
		System.out.println("Izjema pri praznenju steklenice: " + e);
		}
		
	}
	
}