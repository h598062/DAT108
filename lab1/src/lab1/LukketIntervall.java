package lab1;

public class LukketIntervall<T extends Comparable<T>> implements Intervall<T> {

	T start;
	T slutt;

	public LukketIntervall(T start, T slutt) {
		if (start == null || slutt == null) {
			throw new IllegalArgumentException("Start og slutt kan ikke være null");
		}
		this.start = start;
		this.slutt = slutt;
	}

	@Override
	public boolean erIIntervall(T verdi) {

		if (verdi == null) {
			return false;
		}

		if (verdi.compareTo(start) < 0) {
			return false;
		}
		if (verdi.compareTo(slutt) > 0) {
			return false;
		}

		return true;
	}

	@Override
	public boolean erIIntervall(Intervall<T> annetIntervall) {
		if (annetIntervall.stoerste().compareTo(start) < 0) return false;
		if (annetIntervall.minste().compareTo(slutt) > 0) return false;
		return true;
	}

	@Override
	public T minste() {
		return start;
	}

	@Override
	public T stoerste() {
		return slutt;
	}
}
