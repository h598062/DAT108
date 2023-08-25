package oppg3;

import java.util.Arrays;

public class oppg3 {
	/**
	 * Metoden endrer på strengen som kommer inn v.hj.a. Stringfunksjon format,
	 * og skriver deretter resultatet ut på skjermen (med System.out.print).
	 */
	private static void skrivUtFormatert(String inn, Stringfunksjon format) {
		// Her mangler litt kode - Oppgave 1a)
		String s = format.anvend(inn);
		System.out.println(s);
	}

	public static void main(String[] args) {
		String s = "Java";

		Stringfunksjon skrivUtSomCaps  = a -> a.toUpperCase();
		Stringfunksjon skrivUtMedRamme = a -> '[' + a + ']';
		Stringfunksjon skrivUtMedSpredning = a -> {
			String b = "";
			for (int i = 0; i < a.length(); i++) {
				b += a.charAt(i) + " ";
			}
			return b.trim();
		};
		skrivUtFormatert(s, skrivUtSomCaps);
		skrivUtFormatert(s, skrivUtMedRamme);
		skrivUtFormatert(s, skrivUtMedSpredning);
	}
}

@FunctionalInterface
interface Stringfunksjon {
	String anvend(String inn);
}
