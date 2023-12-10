package no.hvl.h598062.oppg2019noe;

public class Film {
	private String tittel;
	private String regissor;
	private int utgivelsesaar;
	private double imdbRating;

	public Film(String tittel, String regissor, int utgivelsesaar, double imdbRating) {
		this.tittel = tittel;
		this.regissor = regissor;
		this.utgivelsesaar = utgivelsesaar;
		this.imdbRating = imdbRating;
	}

	@Override
	public String toString() {
		return "Film{" + "tittel='" + tittel + '\'' + ", regissor='" + regissor + '\'' + ", utgivelsesaar=" + utgivelsesaar + ", imdbRating=" +
		       imdbRating + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Film film = (Film) o;

		if (utgivelsesaar != film.utgivelsesaar) {
			return false;
		}
		if (Double.compare(imdbRating, film.imdbRating) != 0) {
			return false;
		}
		if (!tittel.equals(film.tittel)) {
			return false;
		}
		return regissor.equals(film.regissor);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = tittel.hashCode();
		result = 31 * result + regissor.hashCode();
		result = 31 * result + utgivelsesaar;
		temp   = Double.doubleToLongBits(imdbRating);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public String getRegissor() {
		return regissor;
	}

	public void setRegissor(String regissor) {
		this.regissor = regissor;
	}

	public int getUtgivelsesaar() {
		return utgivelsesaar;
	}

	public void setUtgivelsesaar(int utgivelsesaar) {
		this.utgivelsesaar = utgivelsesaar;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	//Du kan anta at nødvendige konstruktører, set- og get-metoder,
	//og toString finnes.

}
