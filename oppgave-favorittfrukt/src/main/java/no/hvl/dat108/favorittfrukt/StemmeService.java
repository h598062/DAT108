package no.hvl.dat108.favorittfrukt;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StemmeService {

	private final Map<String, Integer> stemmer = new HashMap<>();

	public void leggTilStemme(String frukt) {
		stemmer.put(frukt, stemmer.getOrDefault(frukt, 0) + 1);
	}

	public Map<String, Integer> hentStemmer() {
		return stemmer;
	}
}
