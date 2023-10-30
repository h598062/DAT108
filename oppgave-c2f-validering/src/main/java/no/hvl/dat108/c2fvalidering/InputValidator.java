package no.hvl.dat108.c2fvalidering;

public class InputValidator {

	public static boolean erGyldigType(String type) {
		return "fahrenheit".equalsIgnoreCase(type) || "celsius".equalsIgnoreCase(type);
	}

	public static double erGyldigCelsius(String temperatur)
	throws IllegalArgumentException {
		try {
			double temp = Double.parseDouble(temperatur);
			if (temp < -273.15) {
				throw new IllegalArgumentException("Ugyldig temperatur, må være et tall større eller likt -273.15°C");
			}
			return temp;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Ugyldig temperatur, må være et gyldig desimaltall");
		}
	}

	public static double erGyldigFahrenheit(String temperatur)
	throws IllegalArgumentException {

		try {
			double temp = Double.parseDouble(temperatur);
			if (temp < -459.67) {
				throw new IllegalArgumentException("Ugyldig temperatur, må være et tall større eller likt -459.67°F");
			}
			return temp;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Ugyldig temperatur, må være et gyldig desimaltall");
		}
	}
}
