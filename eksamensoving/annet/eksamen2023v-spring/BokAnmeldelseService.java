@Service
public class BokAnmeldelseService {

	@Autowired
	private BokRepo br;

	@Autowired
	private AnmeldelseRepo ar;

	public Bok finnBok(int bokId) {
		return br.findById(bokId).orElse(null);
	}

	public Anmeldelse lagreAnmeldelse(Anmeldelse amd, int bokId) {
		Bok bok = br.findById(bokId);
		bok.leggTilAnmeldelse(amd);
		ar.save(amd);
		return amd;
	}
}
