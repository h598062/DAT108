package no.hvl.dat108.favorittfrukt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.util.Map;


@Controller
public class StemmeController {

	@Autowired
	private StemmeService stemmeService;

	@Value("${app.frukter}")
	private String frukter;

	@GetMapping("/")
	public String forside(Model m) {
		m.addAttribute("frukter", frukter.split(","));
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
		m.addAttribute("stemmer", stemmeService.hentStemmer());
		return "resultat";
	}

	@GetMapping("/test")
	public String testGet(@RequestHeader Map<String, String> headers, @RequestBody(required = false) String request) {
		System.out.println(request);
		System.out.println(headers);
		return "redirect:/";
	}

	@PostMapping("/test")
	public String testPost(@RequestHeader Map<String, String> headers, @RequestBody(required = false) String request) {
		System.out.println(request);
		System.out.println(headers);
		return "redirect:/";
	}

}
