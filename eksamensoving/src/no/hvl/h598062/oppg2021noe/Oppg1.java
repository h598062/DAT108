package no.hvl.h598062.oppg2021noe;

import java.util.Arrays;

public class Oppg1 {

	public static void main(String[] args) {
		skrivUtFormatert("java", String::toUpperCase);
		skrivUtFormatert("java", a -> "[" + a + "]");
		skrivUtFormatert("java", s -> {
			String u = "";
			for (int i = 0; i < s.length(); i++) {
				u += s.charAt(i) + " ";
			}
			return u;
		});
		skrivUtFormatert("java", a -> String.join(" ", a.split("")));

	}

	/**
	 * Metoden endrer på strengen som kommer inn v.hj.a. Stringfunksjon format,
	 * og skriver deretter resultatet ut på skjermen (med System.out.print).
	 */
	private static void skrivUtFormatert(String inn, Stringfunksjon format) {
		inn = format.anvend(inn);
		System.out.println(inn);
	}

	@FunctionalInterface
	interface Stringfunksjon {
		String anvend(String inn);
	}

}
