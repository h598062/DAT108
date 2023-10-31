package no.hvl.dat108.cookiesautoutfylling;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class CookiesController {

	@GetMapping
	public String get(
			@CookieValue(name = "fornavn", required = false) String fornavn,
			@CookieValue(name = "etternavn", required = false) String etternavn,
			Model model) {
		if (fornavn != null) {
			model.addAttribute("fornavn", fornavn);
		}
		if (etternavn != null) {
			model.addAttribute("etternavn", etternavn);
		}
		return "cookies";
	}

	@PostMapping
	public String post(
			@RequestParam("fornavn") String fornavn,
			@RequestParam("etternavn") String etternavn,
			HttpServletResponse response) {

		Cookie cf = new Cookie("fornavn", fornavn);
		Cookie ce = new Cookie("etternavn", etternavn);
		// lagre cookies i 2 år (i sekunder)
		// 60 * 60 * 24 * 365 * 2 = 63072000
		cf.setMaxAge(63072000);
		ce.setMaxAge(63072000);
		response.addCookie(cf);
		response.addCookie(ce);
		return "redirect:/";
	}

}
