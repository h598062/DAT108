@Controller
public class BokAnmeldelseController {

	@Autowired
	private BokAnmeldelseService bas;

	@GetMapping("anmelde")
	public String getAnmelde(@RequestParam String bok_id, Model model) {
	 	int id;
	 	try {
	 		id = Integer.parseInt(bok_id);
	 	} catch (Exception e) {
	 		return "feilmelding"
	 	}
		Bok bok = bas.finnBok(id);
		if (bok == null) {
			return "redirect:feilmelding";
		}
		model.addAttribute("bok", bok);
		return "anmelde";
	}

	@PostMapping("anmelde")
	public String postAnmelde(@RequestParam Integer bok_id, @RequestParam String amd_tekst, @RequestParam String navn, @RequestParam Integer rating, RedirectAttributes ra) {
		if (bok_id == null || rating == null || amd_tekst == null || rating < 1 || rating > 5 || amd_tekst.length() == 0) {
			return "redirect:feilmelding";
		}
		Bok bok = bas.finnBok(bok_id);
		if (bok == null) {
			return "redirect:feilmelding";
		}

		if (navn == null || navn.length() == 0) {
			navn = "Anonym";
		}

		Anmeldelse a = new Anmeldelse(amd_tekst, navn, rating);
		bas.leggTilAnmeldelse(a, bok_id);
		ra.addAttribute("bok_id", bok_id);
		return "redirect:bokanmeldelser"
	}
}