package no.hvl.dat108.beanvalidation;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistreringController {

	@GetMapping("/skjema")
	public String ansattskjema() {
		return "ansattskjema";
	}

	@PostMapping("/registrerAnsatt")
	public String registrerAnsatt(
			@Valid @ModelAttribute("ansatt") Ansatt ansatt, BindingResult bindingResult, RedirectAttributes ra) {
		ra.addFlashAttribute(ansatt);
		if (bindingResult.hasErrors()) {
			String feilmeldinger = bindingResult.getAllErrors()
			                                    .stream()
			                                    .map(e -> e.getDefaultMessage())
			                                    .reduce("", (f, e) -> f + e + "<br>");
			ra.addFlashAttribute("feilmeldinger", feilmeldinger);
			ra.addFlashAttribute("feilmelding", "Feil i skjema");
			return "redirect:skjema";
		}
		return "redirect:kvittering";
	}

	@GetMapping("/kvittering")
	public String ansattKvittering() {
		return "ansattkvittering";
	}
}
