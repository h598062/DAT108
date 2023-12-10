package no.hvl.h598062.oppg2019noe;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Oppg1 {

	public static void main(String[] args) {
		List<Film> filmene = Arrays.asList(
				new Film("The Godfather", "Francis Ford Coppola", 1972, 9.1),
				new Film("The Dark Knight", "Christopher Nolan", 2008, 9.0),
				new Film("Pulp Fiction", "Quentin Tarantino", 1994, 8.9),
				new Film("Fight Club", "David Fincher", 1999, 8.8));

		Collections.sort(filmene, (a, b) -> a.getTittel().compareTo(b.getTittel()));
		//Collections.sort(filmene, Comparator.comparing(Film::getTittel));

		Comparator<Film> paaUtgivelsesaar = (a, b) -> a.getUtgivelsesaar() - b.getUtgivelsesaar();
		filmene.forEach(System.out::println);

	}

}
