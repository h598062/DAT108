package oppg2;

import java.util.Arrays;
import java.util.List;

public class Film {
	private String tittel;
	private String regissor;
	private int    utgivelsesaar;
	private double imdbRating;

	public Film(String tittel, String regissor, int utgivelsesaar, double imdbRating) {
		this.tittel        = tittel;
		this.regissor      = regissor;
		this.utgivelsesaar = utgivelsesaar;
		this.imdbRating    = imdbRating;
	}

	// Du kan anta at nødvendige konstruktører, set- og get-metoder,
	// og toString finnes.

	public static void main(String... blablabla) {
		List<Film> filmene = Arrays.asList(new Film("The Godfather", "Francis Ford Coppola", 1972, 9.1),
				new Film("The Dark Knight", "Christopher Nolan", 2008, 9.0),
				new Film("Pulp Fiction", "Quentin Tarantino", 1994, 8.9),
				new Film("Fight Club", "David Fincher", 1999, 8.8));
		// ...
		// Koden du skal skrive foregår nedover her ...
	}
	
	/*
a)
Sorter filmene alfabetisk på tittel ved å bruke Collections.sort(...) med Comparator. Lambda-
uttrykket som representerer Comparatoren skrives direkte inn som parameter til sort(...).

b)
Sorter filmene stigende på utgivelsesår ved å bruke Collections.sort() med Comparator.
Lambda-uttrykket som representerer Comparatoren skal først defineres i en variabel kalt
paaUtgivelsesaar, og denne variabelen skal deretter brukes som parameter til sort(...).
	 */
}
