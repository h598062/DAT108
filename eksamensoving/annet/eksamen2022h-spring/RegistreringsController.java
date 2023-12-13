@Controller
public class RegistreringsController {

	@Autowired
	private AnsattDbService adbs;

	@Autowired
	private LogginnService ls;

	@Autowired
	private AnsattValidator av;

	@GetMapping("nyansatt")
	public String getNyansatt(Model model) {
		List<String> sl = adbs.finnStillinger();
		model.addAttribute("stillinger", sl);
		return "nyansattskjema";
	}

	@PostMapping("nyansatt")
	public String postNyansatt(
			@RequestParam("fornavn") String fornavn,
			@RequestParam("etternavn") String etternavn,
			@RequestParam("stilling") String stilling,
			@RequestParam("mndlonn") Integer mndlonn,
			RedirectAttributes ra,
			HttpServletRequest request) {
		if (!ls.erLoggetInn(request)) {
			return "redirect:innlogging.html"
		}
		if (fornavn == null || etternavn == null || stilling == null || mndlonn == null) {
			ra.addAttribute("feilmelding", "Data mangler i registreringsskjema");
			return "redirect:nyansatt";
		}
		Ansatt a = new Ansatt(fornavn, etternavn, stilling, mndlonn);
		if (!av.validerAnsatt(a)) {
			ra.addAttribute("feilmelding", "Ugyldig data for ansatt");
			return "redirect:nyansatt";
		}
		ra.addAttribute("nyansatt", a);
		return "redirect:nyansatt";
	}
}