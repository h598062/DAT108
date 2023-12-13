@Service
public class AnsattValidator {

	@Autowired
	private AnsattDbService adbs;

	public boolean validerAnsatt(Ansatt a) {
		if(a == null) return false;
		if (a.getFornavn() == null || a.getFornavn().length() < 2) {
			return false;
		}
		if (a.getEtternavn() == null || a.getEtternavn().length() < 2) {
			return false;
		}
		if (a.getMndlonn() == null || a.getMndlonn() < 0 || a.getMndlonn() > 100000) {
			return false;
		}
		if (a.getStilling() == null) {
			return false;
		}
		List<String> stillinger = adbs.finnStillinger();
		if (!stillinger.contains(a.getStilling())) {
			return false;
		}
		return true;
	}
}