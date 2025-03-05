 import javax.swing.table.*;
 
 /**
 * Razred za delo s tabelo pivskih steklenic
 * Razširja privzeti razred za tabele
 * @author Tanita Novak
 * @version Primer 20 
 */
 
 public class PivskaSteklenicaTabelModel extends DefaultTableModel	{
	 
	 /**
	   * Konstruktor, ki ustvari tabelo steklenic na mizi
	  */
	 public PivskaSteklenicaTabelModel()	{
		 
		 //pokličemo konstrktor nadrazreda
		 super();
		 
		 //dodamo stolpce v tabelo
		 addColumn("Znamka");
		 addColumn("Stopnja alkohola");
		 
		 //dodamo testni vnos
		 Object [] vrstica = new Object[]	{"Testna znamka","5.0"};
		 
		 //vstavimo v tabelo
		 addRow(vrstica);
		 }
		 
		 /**
		   * javna metoda, ki doda pivsko steklenico v tabelo
		   * @param ps Objekt, ki ga doda v tabelo
		  */
		 
		 public void addPivskaSteklenica(PivskaSteklenica ps)	{
		 
		 //ustvarimo seznam objektov(nizov)
		 Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
		 
		 //vstavi vrstico v tabelo
		 addRow(vrstica);
		 
	 }
	
	 
 }