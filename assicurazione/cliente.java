package assicurazione;

import java.time.LocalDate;

/**
 * La classe Cliente rappresenta un cliente dell'assicurazione. Contiene dati
 * anagrafici e fiscali.
 */
public class cliente {
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private LocalDate nascita;

	/**
	 * Costruttore parametrico: serve per creare un nuovo oggetto cliente
	 * inizializzandolo subito con valori.
	 *
	 * @param codiceFiscale codice fiscale univoco del cliente
	 * @param nome          nome del cliente
	 * @param cognome       cognome del cliente
	 * @param nascita       data di nascita del cliente
	 */
	public cliente(String codiceFiscale, String nome, String cognome, LocalDate nascita) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
	}

	/*
	 * Getter e Setter: Metodi pubblici per leggere (getter) e modificare (setter) i
	 * valori privati degli attributi. Sono utili per incapsulare i dati, cioè
	 * proteggere la struttura interna, consentendo accesso controllato.
	 */

	public String getCodiceFiscale() {
		return codiceFiscale; // Ritorna il codice fiscale del cliente
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale; // Imposta/modifica il codice fiscale
	}

	public String getNome() {
		return nome; // Ritorna il nome del cliente
	}

	public void setNome(String nome) {
		this.nome = nome; // Modifica il nome del cliente
	}

	public String getCognome() {
		return cognome; // Ritorna il cognome
	}

	public void setCognome(String cognome) {
		this.cognome = cognome; // Modifica il cognome
	}

	public LocalDate getNascita() {
		return nascita; // Ritorna la data di nascita
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita; // Modifica la data di nascita
	}

	/**
	 * Metodo toString: serve a definire come un oggetto cliente viene rappresentato
	 * in forma di stringa, ad esempio quando lo stampiamo a video. In questo modo
	 * vedremo i dati rilevanti in un formato leggibile.
	 */
	@Override
	public String toString() {
		return "Cliente:\n- Nome: " + nome + "\n- Cognome: " + cognome + "\n- Codice Fiscale: " + codiceFiscale
				+ "\n- Data di Nascita: " + nascita;
	}
}
