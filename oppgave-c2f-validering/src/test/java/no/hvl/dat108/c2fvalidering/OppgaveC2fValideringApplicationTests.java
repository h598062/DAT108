package no.hvl.dat108.c2fvalidering;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OppgaveC2fValideringApplicationTests {

	@Test
	void testErGyldigType() {
		assertTrue(InputValidator.erGyldigType("celsius"));
		assertTrue(InputValidator.erGyldigType("fahrenheit"));
		assertTrue(InputValidator.erGyldigType("ceLsius"));
		assertTrue(InputValidator.erGyldigType("fahreNheit"));
		assertFalse(InputValidator.erGyldigType("celk"));
		assertFalse(InputValidator.erGyldigType("franh"));
	}

	@Test
	void testErGyldigCelsius() {
		assertDoesNotThrow(() -> InputValidator.erGyldigCelsius("-273.15"));
		assertDoesNotThrow(() -> InputValidator.erGyldigCelsius("-50.2"));
		assertDoesNotThrow(() -> InputValidator.erGyldigCelsius("0"));
		assertDoesNotThrow(() -> InputValidator.erGyldigCelsius("50.2"));
		assertThrows(IllegalArgumentException.class, () -> InputValidator.erGyldigCelsius("-280"));
		assertThrows(IllegalArgumentException.class, () -> InputValidator.erGyldigCelsius("abc"));
	}

	@Test
	void testErGyldigFahrenheit() {
		assertDoesNotThrow(() -> InputValidator.erGyldigFahrenheit("-459.67"));
		assertDoesNotThrow(() -> InputValidator.erGyldigFahrenheit("-50.2"));
		assertDoesNotThrow(() -> InputValidator.erGyldigFahrenheit("0"));
		assertDoesNotThrow(() -> InputValidator.erGyldigFahrenheit("50.2"));
		assertThrows(IllegalArgumentException.class, () -> InputValidator.erGyldigFahrenheit("-470"));
		assertThrows(IllegalArgumentException.class, () -> InputValidator.erGyldigFahrenheit("abc"));
	}

}
