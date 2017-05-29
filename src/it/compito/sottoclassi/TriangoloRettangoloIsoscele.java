package it.compito.sottoclassi;

import java.util.ArrayList;
import it.compito.interfacce.*;

/**
 * 
 * @author Claudio Pisa
 * @see it.compito.interfacce.TriangoloRettangoloInterface
 * @see it.compito.sottoclassi.Isoscele
 */
public class TriangoloRettangoloIsoscele 
extends Isoscele 
implements TriangoloRettangoloInterface
{
	/**
	 * 
	 * @param misureLati
	 */
	public TriangoloRettangoloIsoscele(ArrayList<Double> misureLati)
	{ super(misureLati); }
}

