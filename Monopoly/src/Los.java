import java.util.ArrayList;

public class Los extends Feld {

	private int betrag = 400; 

	public Los() {
		super();
	}
	/**
	 * Spieler erh�lt 400 �
	 * Geld beim Spieler hinzuf�gen
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println (spieler.getName() + " hat das Feld 'Los' betreten und erh�lt 400 �");
		spieler.setGeld(spieler.getGeld() + betrag);
	}
}
