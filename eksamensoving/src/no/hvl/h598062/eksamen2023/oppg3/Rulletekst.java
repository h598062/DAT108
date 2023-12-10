package no.hvl.h598062.eksamen2023.oppg3;

public class Rulletekst extends Thread {
	private final Banner banner;

	public Rulletekst(String tekst) {
		this.banner = new Banner(tekst);
	}

	@Override
	public void run() {
		while (true) {
			banner.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	public void oppdaterTekst(String s) {
		banner.setText(s);
	}

	private class Banner {
		String tekst;

		Banner(String s) {
			this.tekst = s;
		}

		public void setText(String tekst) {
			this.tekst = tekst;
		}

		public void repaint() {
		}
	}
}
