package it.compito.superclassi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Claudio Pisa
 *
 */
public abstract class Poligono
{
	protected ArrayList<Double> misureLati = new ArrayList<Double>();
	protected int numeroDiLati, numeroDiAngoli;

	/**
	 * 
	 * @return Perimetro del triangolo
	 * 
	 */
	protected Double calcolaPerimetro()
	{
		Iterator<Double> index; /* iteratore */
		Double p = 0.0; /* perimetro */
		
		index = misureLati.iterator();
		while(index.hasNext())
			p += (Double) index.next();
		
		return p;
	}
	
	
	/**
	 * 
	 * @return area del triangolo
	 */
	protected abstract Double calcolaArea();
	
	
	/**
	 * 
	 * @param nomePoligono
	 * @param poligonoGenerico (parametro polimorfo)
	 */
	public void printInfo(String nomePoligono, Poligono poligonoGenerico)
	{
		if(misureLati.isEmpty())
			System.out.format("\nLe informazione per %s non sono disponibili!\n\n", nomePoligono);
		else{
			System.out.println("\n------");
			
			/* versione 1
			System.out.println(nomePoligono + "\n\n"
					+ "Numero di lati: " + poligonoGenerico.numeroDiLati + '\n'
					+ "Numero di angoli: " + poligonoGenerico.numeroDiAngoli + '\n'
					+ "Perimetro: " + String.format("%.3f", poligonoGenerico.calcolaPerimetro()) +'\n'
					+ "Area: " + String.format("%.3f", poligonoGenerico.calcolaArea()));
			*/
			
			/* versione 2 (maggiore precisione)
			System.out.println(nomePoligono + "\n\n"
					+ "Numero di lati: " + poligonoGenerico.numeroDiLati + '\n'
					+ "Numero di angoli: " + poligonoGenerico.numeroDiAngoli + '\n'
					+ "Perimetro: " + poligonoGenerico.calcolaPerimetro() +'\n'
					+ "Area: " + poligonoGenerico.calcolaArea());
			*/
			
			/* versione 3 (con metodo -format- oppure -printf-)*/
			System.out.format("%s\n\n"
					+ "Numero di lati: %d\n"
					+ "Numero di angoli: %d\n\n"
					+ "Perimetro: %.3f\n"
					+ "Area: %.3f\n", 
					nomePoligono,
					poligonoGenerico.numeroDiLati,
					poligonoGenerico.numeroDiAngoli,
					poligonoGenerico.calcolaPerimetro(),
					poligonoGenerico.calcolaArea());
			
			
		}
		System.out.println("------\n");
	}
}


/*
	private final int MIN_NUMBER_OF_SIDES = 3, MIN_NUMBER_OF_ANGLES = 3;
    private int numberOfSides, numberOfAngles;
    
    protected void setNumberOfSides(int numberOfSides)
	{
		if(numberOfSides >= MIN_NUMBER_OF_SIDES)
			this.numberOfSides = numberOfSides;
		else
			this.numberOfSides = 0;
	}
	
	protected int getNumberOfSides()
	{ return numberOfSides; }
	3
	
	protected void setNumberOfAngles(int numberOfAngles)
	{ 
		if(numberOfAngles >= MIN_NUMBER_OF_ANGLES)
			this.numberOfAngles = numberOfAngles;
		else
			this.numberOfAngles = 0;
	}
	
	protected int getNumberOfAngles()
	{ return numberOfAngles; }
*/

