package it.compito.sottoclassi;

import java.util.ArrayList;
import java.util.Iterator;
import it.compito.superclassi.Poligono;

/**
 * 
 * @author Claudio Pisa
 * 
 */
public class Triangolo extends Poligono
{
	private final int NUMERO_LATI = 3, NUMERO_ANGOLI = 3;
	
	/**
	 * 
	 * @param misureLati
	 */
	public Triangolo(ArrayList<Double> misureLati)
	{
		if(misureLati.isEmpty())
			System.out.println("Errore: misure non specificate !");
		else{
			numeroDiLati = NUMERO_LATI;
			numeroDiAngoli = NUMERO_ANGOLI;
			
			/*
			setNumberOfSides(NUM_SIDES);
			setNumberOfAngles(NUM_ANGLES);
			*/
			
			for(int i = 0; i < NUMERO_LATI; ++i)
				super.misureLati.add(i, misureLati.get(i));
		
			if(!verificaTriangolo()){
				System.out.println("Errore: triangolo non valido !\nmisure errate");
				super.misureLati.clear();
			}
		}
	}
	
	/**
	 * <pre><strong>
	 * a < b + c  V  a > b - c
	 * b < a + c  V  b > a - c
	 * c < a + b  V  c > a - b
	 * </strong></pre>
	 * 
	 * @return <pre> <b>false</b> se le misure del non sono valide
	 * <b>true</b> se le misure sono valide
	 * <pre>
	 * 
	 */
	private boolean verificaTriangolo()
	{
		Double a = misureLati.get(0), 
			   b = misureLati.get(1), 
			   c = misureLati.get(2);
		
		if( (a < (b + c) && a > (b - c))
		 && (b < (a + c) && b > (a - c))
		 && (c < (a + b) && c > (a - b)) )
			return true;
		else
			return false;
	}
	
	
	/**
	 * <strong><em>Formula di Erone</em></strong>
	 * @return Area del triangolo
	 * @see it.compito.superclassi.Poligono
	 */
	@Override
	public Double calcolaArea()
	{
		Iterator<Double> index; /* iteratore */
		Double area,	/* area */
			   sp,		/* semiperimetro */
			   rad;		/* radicando */
		
		rad = sp = calcolaPerimetro()/2;
		index = misureLati.iterator();
		while(index.hasNext())
			rad *= (sp - (Double) index.next());
		
		area = rad;
		
		return Math.sqrt(area);
	}
}

