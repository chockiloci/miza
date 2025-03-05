//uvozimo paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
 import java.io.* ;

 import java.util.*;
 
 import javax.swing.*;
 
 import java.awt.event.*;
 
 /**
 * Razred za prikaz grafičnega uporabniškega vmesnika
 * @author Tanita Novak
 * @version Primer 20 
 */
 public class Miza extends JFrame implements ActionListener	{
	
	//Deklariramo zasebne lastnosti GUI
	private JPanel povrsina;
	
	private JButton dodajButton;
	private JTextField znamkaTextField;
	private JTextField stopnjaAlkoholaTextField;
	
	private PivskaSteklenicaTabelModel modelTabele;
	
     /**
	 * Glavna metoda programa. Zažene se vedno ob zagonu. 
	 * @param args Seznam argumentov iz ukazne vrstice. 
	 */
	 public static void main (String [] args)	{

		//izpišemo začetek
		System.out.println("Zaganjam GUI ...");
		
		//ustavrimo objekt razreda miza
		Miza m = new Miza();

	 }		 
	 
	 /**
	   *konstruktor, ki postavi osnovne lastnosti okna
	  */
	 public Miza() 	{
		 //pokličemo konstruktor nadrazreda
		 super("Miza s steklenicami");
		 
		 //nastavimo obnašanje križca
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 //nastavimo velikost okenjca
		 setSize(800, 600);
		 
		 //Inicaliziramo elemente GUI
		 povrsina = new JPanel();
		 
		 //vnosna polja za dodajanje steklenic
		 znamkaTextField = new JTextField(32);
		 stopnjaAlkoholaTextField = new JTextField(4);
		 
		 //dodamo vnosna polja na površino 
		 povrsina.add(new JLabel("Znamka piva: "));
		 povrsina.add(znamkaTextField);
		 
		 povrsina.add(new JLabel("Stopnja alkohola: "));
		 povrsina.add(stopnjaAlkoholaTextField);
		 
		 //gumb za dodajanje steklenice
		 dodajButton = new JButton ("Dodaj");
		 
		 //Gumb dodamo action listener za dodajanje steklenic
		 dodajButton.addActionListener(this);	 
		 
		 //dodamo gumb na površino
		 povrsina.add(dodajButton);
		 
		 //inicializiramo model tabele
		 modelTabele = new PivskaSteklenicaTabelModel();
		 
		 //tabelo postavimo na površino
		 //ustvarimo anonimen objekt razreda JTable z modelomTabele
		 povrsina.add(new JTable(modelTabele));
		 
		 //površino dodamo na okno
		 add(povrsina);
		 
		 //Prikažemo okno
		 setVisible (true);
		 
	 }
	 
	 /** Metoda, ki jo prepisuje ActionListener
	   * se kliče vedno, ko je pritisnjen gumb
	   * @param e Dogogek ob kliku
	  */
	public void actionPerformed(ActionEvent e)	{
	
		//izpišemo podatke iz vnosnih polj
		System.out.println("Dodajam steklenico...");
		System.out.println("Znamka piva: " + znamkaTextField.getText());
		System.out.println("Stopnja alkohola: " + stopnjaAlkoholaTextField.getText());
		
		//spremenljivka za stopnjo alkohola
		double sa = Double.parseDouble(stopnjaAlkoholaTextField.getText());
		
		//ustvarimo nov objekt
		PivskaSteklenica nova = new PivskaSteklenica(500, znamkaTextField.getText(), 8.0, sa);
		
		//objekt dodamo
		modelTabele.addPivskaSteklenica(nova);
		
	}
	 
	 
 }