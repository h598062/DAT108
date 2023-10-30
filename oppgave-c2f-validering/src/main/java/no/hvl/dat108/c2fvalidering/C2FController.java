package no.hvl.dat108.c2fvalidering;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class C2FController {

	@GetMapping("/")
	public String getConvert() {
		return "converter";
	}

	@PostMapping("/convert")
	public String postConvert(@RequestParam String temperatur, @RequestParam String type, RedirectAttributes ra) {
		if (!InputValidator.erGyldigType(type)) {
			ra.addFlashAttribute("feilmelding", "Ugyldig temperaturtype, må være celsius eller fahrenheit");
			return "redirect:/feil";
		}
		double temp;
		double celsius;
		double fahrenheit;
		if ("celsius".equalsIgnoreCase(type)) {
			try {
				temp = InputValidator.erGyldigCelsius(temperatur);
			} catch (IllegalArgumentException e) {
				ra.addFlashAttribute("feilmelding", e.getMessage());
				return "redirect:/feil";
			}
			celsius = temp;
			fahrenheit = celsius * 9 / 5 + 32;
		} else {
			try {
				temp = InputValidator.erGyldigFahrenheit(temperatur);
			} catch (IllegalArgumentException e) {
				ra.addFlashAttribute("feilmelding", e.getMessage());
				return "redirect:/feil";
			}
			fahrenheit = temp;
			celsius = (fahrenheit - 32) * 5 / 9;
		}
		ra.addFlashAttribute("celsius", String.format("%.1f", celsius));
		ra.addFlashAttribute("fahrenheit", String.format("%.1f", fahrenheit));
		return "redirect:/resultat";
	}

	@GetMapping("/resultat")
	public String getResult() {
		return "resultat";
	}

	@GetMapping("/feil")
	public String getFeil() {
		return "feilmelding";
	}
}
