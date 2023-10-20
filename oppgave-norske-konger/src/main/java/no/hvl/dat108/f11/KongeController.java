package no.hvl.dat108.f11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class KongeController {
	@GetMapping(value = "getkonge")
	public String getKonge(Model model, @RequestParam String aar) {
		Optional<Konge> konge = Konger.norske.stream()
		                          .filter(k -> k.getKongeFraAar() <= Integer.parseInt(aar) && k.getKongeTilAar() >= Integer.parseInt(aar))
		                          .findFirst();
		if (konge.isPresent()) {
			model.addAttribute("konge", konge.get());
		} else {
			model.addAttribute("konge", Konge.DEFAULT);
		}
		return "konge"; // Navnet på viewet. Se application.properties
						// for hvilket filnavn dette mappes til.
	}
}
