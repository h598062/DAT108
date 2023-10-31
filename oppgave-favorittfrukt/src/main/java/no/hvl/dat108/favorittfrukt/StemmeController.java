package no.hvl.dat108.favorittfrukt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StemmeController {

	@GetMapping("/")
	public String forside() {
		return "stemmeskjema";
	}

	@PostMapping("/stem")
	public String stemme(@RequestParam("frukt") String frukt, RedirectAttributes ra) {

		return "redirect:/";
	}

}
