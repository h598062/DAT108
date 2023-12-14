@Controller
public class AnsattListeController {

	@Autowired
	private AnsattDbService adbs;

	@GetMapping("/ansattliste")
	public String getAnsattliste(Model model) {
		List<Ansatt> al = adbs.finnAlleAnsatte();
		model.addAttribute("ansatte", al);
		return "ansattliste";
	}
}