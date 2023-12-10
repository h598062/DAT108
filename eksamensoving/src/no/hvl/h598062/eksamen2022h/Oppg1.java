package no.hvl.h598062.eksamen2022h;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Oppg1 {
	public static void main(String[] args) {
		// a)
		Consumer<String> consStr = a -> System.out.println(a); // der a er en String
		Comparator<String> compStr = (a, b) -> a.compareTo(b); // der a og b er String-er
		UnaryOperator<Integer> unarInt = a -> a * a; // der a er et heltall
		Predicate<Integer> predInt = a -> a > 0; // der a er et heltall
		BinaryOperator<Integer> binInt = (a, b) -> a + b; // der a og b er heltall


		// b)
		List<Integer> liste = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> resultat = utplukk(liste, x -> x % 3 == 0);
		System.out.println(resultat); // [3, 6, 9]


		// c)
		List<Bil> biler = List.of(
				new Bil("EK 12345", "Tesla model Y"),
				new Bil("EV 52345", "Tesla model Y"),
				new Bil("SV 12346", "Mazda 5"),
				new Bil("SU 24680", "Volvo 240"),
				new Bil("EL 24683", "Nissan Leaf"));
		List<Bil> bilerMedE = biler.stream()
		                           .filter(b -> b.getRegnr()
		                                         .startsWith("E"))
		                           .toList();


		// d)
		bilerMedE.stream()
		         .map(Bil::getModell)
		         .distinct()
		         .forEach(System.out::println);


		// e)
		List<Kundedata> kundeliste = List.of(
				new Kundedata("Arne", 1234),
				new Kundedata("Per", 2234),
				new Kundedata("Pål", 1000),
				new Kundedata("Emma", 4000),
				new Kundedata("Ine", 5234),
				new Kundedata("Tone", 1111));

		int totaltForbruk = kundeliste.stream()
		                              .mapToInt(Kundedata::getForbruk)
		                              .sum();


		// g)
		double total = beregnTotalInntekt(kundeliste, k -> 1.5 * k.getForbruk());
	}

	// f)
	private static double beregnTotalInntekt(List<Kundedata> liste, ToDoubleFunction<Kundedata> f) {
		return liste.stream()
		            .mapToDouble(f)
		            .sum();
	}

	private static List<Integer> utplukk(List<Integer> liste, Predicate<Integer> b) {
		return liste.stream()
		            .filter(b)
		            .toList();
	}

	private static class Kundedata {
		private String navn;
		private int forbruk;

		public Kundedata(String navn, int forbruk) {
			this.navn    = navn;
			this.forbruk = forbruk;
		}

		public String getNavn() {
			return navn;
		}

		public void setNavn(String navn) {
			this.navn = navn;
		}

		public int getForbruk() {
			return forbruk;
		}

		public void setForbruk(int forbruk) {
			this.forbruk = forbruk;
		}
	}

	private static class Bil {

		private String regnr;
		private String modell;

		public Bil(String regnr, String modell) {
			this.regnr  = regnr;
			this.modell = modell;
		}

		public String getRegnr() {
			return regnr;
		}

		public void setRegnr(String regnr) {
			this.regnr = regnr;
		}

		public String getModell() {
			return modell;
		}

		public void setModell(String modell) {
			this.modell = modell;
		}
	}
}
