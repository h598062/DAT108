package no.hvl.dat108.bean_validation;

import jakarta.validation.constraints.*;
import no.hvl.dat108.bean_validation.customvalidator.AfterDate;

import java.time.LocalDate;
import java.util.Objects;

public class Ansatt {

	@Pattern(regexp = "[\\p{L} -]+", message = "Fornavn kan bare inneholde bokstaver, bindestrek og mellomrom")
	@Size(min = 2, max = 12, message = "Fornavn må inneholde minst 2 tegn, og maks 12 tegn")
	@NotNull(message = "Fornavn er obligatorisk")
	private String fornavn;

	@Pattern(regexp = "[\\p{L}-]+", message = "Etternavn kan bare inneholde bokstaver og bindestrek")
	@Size(min = 2, max = 12, message = "Etternavn må inneholde minst 2 tegn, og maks 12 tegn")
	@NotNull(message = "Etternavn er obligatorisk")
	private String etternavn;

	@Past(message = "Fødselsdato kan ikke være i fremtiden")
	@NotNull(message = "Fødselsdato er obligatorisk")
	private LocalDate fdato;

	@Pattern(regexp = "[MK]", message = "Kjønn må være M eller K")
	@Size(min = 1, max = 1, message = "Kjønn må være kun én bokstav, enten M eller K")
	private String kjonn;

	// bruker en custom validator for å sjekke at startdato er etter 2020
	@AfterDate(date = "2020-12-31", message = "Startdato må være etter 31.12.2020")
	private LocalDate startdato;

	@Pattern(regexp = "Sjef|Utvikler|Økonom", message = "Stilling må være Sjef, Utvikler eller Økonom")
	private String stilling;

	@Min(value = 10000, message = "Månedslønn må være minst 10000")
	@Max(value = 200000, message = "Månedslønn kan ikke være mer enn 200000")
	private Integer maanedslonn;

	@Override
	public String toString() {
		return "Ansatt{" + "fornavn='" + fornavn + '\'' + ", etternavn='" + etternavn + '\'' + ", fdato=" + fdato + ", kjonn='" + kjonn + '\'' +
		       ", startdato=" + startdato + ", stilling='" + stilling + '\'' + ", maanedslonn=" + maanedslonn + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Ansatt ansatt = (Ansatt) o;

		if (!fornavn.equals(ansatt.fornavn)) {
			return false;
		}
		if (!etternavn.equals(ansatt.etternavn)) {
			return false;
		}
		if (!fdato.equals(ansatt.fdato)) {
			return false;
		}
		if (!Objects.equals(kjonn, ansatt.kjonn)) {
			return false;
		}
		if (!Objects.equals(startdato, ansatt.startdato)) {
			return false;
		}
		if (!Objects.equals(stilling, ansatt.stilling)) {
			return false;
		}
		return Objects.equals(maanedslonn, ansatt.maanedslonn);
	}

	@Override
	public int hashCode() {
		int result = fornavn.hashCode();
		result = 31 * result + etternavn.hashCode();
		result = 31 * result + fdato.hashCode();
		result = 31 * result + (kjonn != null ? kjonn.hashCode() : 0);
		result = 31 * result + (startdato != null ? startdato.hashCode() : 0);
		result = 31 * result + (stilling != null ? stilling.hashCode() : 0);
		result = 31 * result + (maanedslonn != null ? maanedslonn.hashCode() : 0);
		return result;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public LocalDate getFdato() {
		return fdato;
	}

	public void setFdato(LocalDate fdato) {
		this.fdato = fdato;
	}

	public String getKjonn() {
		return kjonn;
	}

	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}

	public LocalDate getStartdato() {
		return startdato;
	}

	public void setStartdato(LocalDate startdato) {
		this.startdato = startdato;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	public Integer getMaanedslonn() {
		return maanedslonn;
	}

	public void setMaanedslonn(Integer maanedslonn) {
		this.maanedslonn = maanedslonn;
	}
}
