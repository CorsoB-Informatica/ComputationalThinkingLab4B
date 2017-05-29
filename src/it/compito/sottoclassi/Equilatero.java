package it.compito.sottoclassi;

import java.util.ArrayList;

/**
 * 
 * @author Claudio Pisa
 *
 */
public class Equilatero extends Isoscele
{
	public Equilatero(ArrayList<Double> misureLati)
	{ 
		super(misureLati);
		if(!verificaEquilatero()){
			System.out.println("Errore: il triangolo non è un equilatero !");
			super.misureLati.clear();
		}
	}
	

	private boolean verificaEquilatero()
	{
		Double a = misureLati.get(0), 
			   b = misureLati.get(1), 
			   c = misureLati.get(2);
		
		if(a.equals(b) && a.equals(c) && b.equals(c))
			return true;
		else
			return false;
	}
	
	
	@Override
	public Double calcolaPerimetro()
	{
		Double p; /* perimetro */
		
		p = misureLati.get(0)*3;
		
		return p;
	}
}

