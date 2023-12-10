package no.hvl.h598062.oppg2020noe1207;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;

public class Oppg1 {
	public static void main(String[] args) {
		// a)
		Function<String, String> litenbokstav = s -> s.toLowerCase();
		List<String> navn = List.of("dfsgSDFGsdafg", "SDGgbfds", "ASNIDGasgbs", "SDTHJIESTJ");
		navn.stream()
		    .map(litenbokstav)
		    .forEach(System.out::println);
		List<Integer> tall = List.of(3, 6, 8);

		tall.stream()
		    .filter(tallmetode(3))
		    .forEach(System.out::println);

		List<String> passordlisten = Arrays.asList("qwerty",
		                                           "123",
		                                           "passord",
		                                           "peace&love",
		                                           "abc",
		                                           "12345678",
		                                           "admin",
		                                           "tomee",
		                                           "fotball",
		                                           "hei på deg");

		List<String> tiMestVanligePassord = Arrays.asList("123456",
		                                                  "123456789",
		                                                  "qwerty",
		                                                  "password",
		                                                  "1234567",
		                                                  "12345678",
		                                                  "12345",
		                                                  "iloveyou",
		                                                  "111111",
		                                                  "123123");

		List<String> greier = passordlisten.stream()
		                                   .filter(tiMestVanligePassord::contains)
		                                   .toList();
		System.out.println(greier);

		OptionalDouble gjlengdeopt = passordlisten.stream()
		                                          .mapToInt(String::length)
		                                          .average();

		double gjlengde = passordlisten.stream()
		                               .mapToInt(String::length)
		                               .average()
		                               .orElse(0);

		if (gjlengdeopt.isPresent()) {
			System.out.println("Gjennomsnitt: " + gjlengdeopt.getAsDouble());
		}

	}

	public static Predicate<Integer> tallmetode(int x) {
		return tall -> tall % x == 0;
	}
}
