package uebung05;

public interface Seminare {

	// Interfaces dürfen hier keine ausvormulierten Methoden haben

	public void anmelden(String nachname);

	public boolean pruefen(String nachname);

	public int anzahl();

}
