package it.compito.classeTest;

import java.util.ArrayList;
import it.compito.sottoclassi.*;

/**
 * 
 * @author Claudio Pisa
 *
 */
public class ClasseTest
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Double> misureLati = new ArrayList<Double>();
		
		
		/* Triangolo */
		
		misureLati.add(10.0);
		misureLati.add(6.2);
		misureLati.add(9.0);
		
		Triangolo trn = new Triangolo(misureLati);
		trn.printInfo("Triangolo", trn);

		
		/* Isoscele */
		
		misureLati.clear();
		misureLati.add(10.0);
		misureLati.add(10.0);
		misureLati.add(7.0);
		
		Isoscele iso = new Isoscele(misureLati);
		iso.printInfo("Isoscele", iso);

		
		/* Equilatero */
		
		misureLati.clear();
		misureLati.add(12.0);
		misureLati.add(12.0);
		misureLati.add(12.0);
		
		Equilatero eql = new Equilatero(misureLati);
		eql.printInfo("Equilatero", eql);

		
		/* Traingolo rettangolo */
		
		misureLati.clear();
		misureLati.add(6.5);
		misureLati.add(9.4);
		misureLati.add(10.3);
		
		TriangoloRettangolo trnRett = new TriangoloRettangolo(misureLati);
		trnRett.printInfo("Triangolo rettangolo", trnRett);
		
		
		/* Triangolo rettangolo isoscele */
		
		misureLati.clear();
		misureLati.add(7.15);
		misureLati.add(7.15);
		misureLati.add(10.0);
		
		TriangoloRettangoloIsoscele trnIso = new TriangoloRettangoloIsoscele(misureLati);
		trnIso.printInfo("Triangolo rettangolo isoscele", trnIso);
		
		
		/* Triangolo non valido */

		misureLati.clear();
		misureLati.add(1.5);
		misureLati.add(2.14);
		misureLati.add(9.03);
		
		Triangolo triangoloNonValido = new Triangolo(misureLati);
		triangoloNonValido.printInfo("Triangolo", triangoloNonValido);

		
		/* Traingolo senza aver specifiacato le misure */
		
		misureLati.clear();

		Triangolo triangoloNonSpecificato = new Triangolo(misureLati);
		triangoloNonSpecificato.printInfo("Triangolo", triangoloNonSpecificato);
		
		
		/* Equilatero non valido */
		
		misureLati.clear();
		misureLati.add(55.12);
		misureLati.add(55.12);
		misureLati.add(50.12);
		
		Equilatero equilateroNonValido = new Equilatero(misureLati);
		equilateroNonValido.printInfo("Equilatero", equilateroNonValido);
		
		
		System.exit(0);
	}
}

