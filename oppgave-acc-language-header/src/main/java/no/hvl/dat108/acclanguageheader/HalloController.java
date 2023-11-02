package no.hvl.dat108.acclanguageheader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HalloController {
	@PostMapping(value = "/hallo", produces = "text/plain")
	@ResponseBody
	public String hallo(@RequestParam("navn") String navn, @RequestHeader Map<String, String> headers) {
		String lang = headers.get("accept-language");
		System.out.println(lang); // accept-language=en-US,en;q=0.9,no;q=0.8
		for (String s : lang.split(",")) {
			if (s.contains("en")) {
				return "Hello " + navn;
			} else if (s.contains("no")) {
				return "Hallo " + navn;
			} else if (s.contains("de")) {
				return "Guten tag " + navn;
			}
		}
		return "Hello " + navn;
	}
}
