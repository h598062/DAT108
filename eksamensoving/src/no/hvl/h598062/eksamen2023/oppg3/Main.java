package no.hvl.h598062.eksamen2023.oppg3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rulletekst rulletekst = new Rulletekst("Hei");
		rulletekst.start();
		while (true) {
			System.out.print("Skriv inn ny melding til rulleteksten: ");
			String nyMelding = sc.nextLine();
			rulletekst.oppdaterTekst(nyMelding);
		}
	}
}
