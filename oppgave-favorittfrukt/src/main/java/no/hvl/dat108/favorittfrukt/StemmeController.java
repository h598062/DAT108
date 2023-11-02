package no.hvl.dat108.favorittfrukt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
public class StemmeController {

	@Autowired
	private StemmeService stemmeService;

	@GetMapping("/")
	public String forside() {
		return "stemmeskjema";
	}

	@PostMapping("/stem")
	public String stemme(@RequestParam(value = "frukt", required = false) String frukt, RedirectAttributes ra) {
		if (frukt == null) {
			ra.addFlashAttribute("feilmelding", "Du må velge en frukt!");
			return "redirect:/";
		}
		stemmeService.leggTilStemme(frukt);
		return "redirect:resultat";
	}

	@GetMapping("/resultat")
	public String resultat(Model m) {
		Map<String, Integer> stemmer = stemmeService.hentStemmer();
		m.addAttribute("eple", stemmer.get("eple"));
		m.addAttribute("appelsin", stemmer.get("appelsin"));
		m.addAttribute("banan", stemmer.get("banan"));
		return "resultat";
	}

}
