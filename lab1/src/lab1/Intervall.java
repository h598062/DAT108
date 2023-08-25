package lab1;

public interface Intervall<T extends Comparable<T>> {

	/**
	 * Sjekker om en verdi er innen for dette Intervallet
	 *
	 * @param verdi Verdien som skal sjekkes
	 *
	 * @return Boolean True / False om den gitte verdien er i Intervallet
	 */
	boolean erIIntervall(T verdi);

	/**
	 * Sjekker om to intervaller kolliderer
	 *
	 * @param annetIntervall Det andre intervallet som skal sjekkes
	 *
	 * @return Boolean True / False om det gitte Intervaller kolliderer
	 */
	boolean erIIntervall(Intervall<T> annetIntervall);

	T minste();

	T stoerste();
}
