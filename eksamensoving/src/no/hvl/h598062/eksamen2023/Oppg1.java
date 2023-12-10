package no.hvl.h598062.eksamen2023;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Oppg1 {
	public static void main(String[] args) {
		// a)
		Predicate<Integer> pred = h -> h >= 0 && h <= 59; // der h er et heltall
		Predicate<Boolean> predBool = b -> !b; // der b er en boolsk verdi
		Predicate<String> predStr = s -> s.startsWith("A"); // der s er en string
		Function<String, Integer> consStr1 = String::length;
		Consumer<String> consStr2 = System.out::println; // Her er det flere muligheter. Velg én.


		// b)
		List<Eksamen> eksamener = Arrays.asList(
				new Eksamen("DAT102", LocalDate.of(2023, Month.MAY, 30), 150),
				new Eksamen("DAT107", LocalDate.of(2023, Month.MAY, 15), 160),
				new Eksamen("DAT108", LocalDate.of(2023, Month.JUNE, 6), 50));
		// 1 og 2
		Comparator<Eksamen> kronologisk = (a, b) -> a.getDato()
		                                             .compareTo(b.getDato());
		Collections.sort(eksamener, kronologisk);
		/* 3
		Resultat av kjøring:
		Eksamen [emnekode=DAT107, dato=2023-05-15, antallOppmeldte=160]
		Eksamen [emnekode=DAT102, dato=2023-05-30, antallOppmeldte=150]
		Eksamen [emnekode=DAT108, dato=2023-06-06, antallOppmeldte=50]
		*/
		eksamener.forEach(System.out::println);


		// c)
		List<String> liste = List.of("ola", "Per", "pÅL", "ESPEN");
		UnaryOperator<String> navnefiks = s -> s.substring(0, 1)
		                                        .toUpperCase() + s.substring(1)
		                                                          .toLowerCase();
		List<String> resultat = fikse(liste, navnefiks);
		System.out.println(resultat);
		/*
		Resultat av kjøring:
		[Ola, Per, Pål, Espen]
		 */


		// d)
		List<Eksamen> juniDat108Eksamener = eksamener.stream()
		                                             .filter(e -> e.getDato()
		                                                           .getMonth() == Month.JUNE && "DAT108".equals(e.getEmnekode()))
		                                             .toList();
		eksamener.stream()
		         .map(Eksamen::getEmnekode)
		         .distinct()
		         .forEach(System.out::println);

		int gjennomsnitt = (int) juniDat108Eksamener.stream()
		                                            .mapToInt(Eksamen::getAntallOppmeldt)
		                                            .average()
		                                            .orElse(0);
		}

	public static List<String> fikse(List<String> liste, UnaryOperator<String> f) {
		return liste.stream()
		            .map(f)
		            .toList();
	}

	static class Eksamen {
		LocalDate dato;
		String emneKode;
		int antallOppmeldt;

		public Eksamen(String emnekode, LocalDate dato, int antallOppmeldt) {
			this.emneKode       = emnekode;
			this.dato           = dato;
			this.antallOppmeldt = antallOppmeldt;
		}

		public LocalDate getDato() {
			return dato;
		}

		public String getEmnekode() {
			return emneKode;
		}

		public int getAntallOppmeldt() {
			return antallOppmeldt;
		}
	}
}
