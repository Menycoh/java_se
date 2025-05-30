package assicurazione;

/**
 * La classe Veicolo rappresenta un veicolo assicurato, associato a un cliente
 * proprietario.
 */
public class veicolo {
	private String targa; // Numero di targa del veicolo (identificativo univoco)
	private cliente proprietario; // Riferimento al cliente proprietario del veicolo

	/**
	 * Costruttore parametrico: serve a creare un veicolo impostando targa e
	 * proprietario al momento della creazione.
	 *
	 * @param targa        Targa del veicolo
	 * @param proprietario Oggetto cliente che è proprietario del veicolo
	 */
	public veicolo(String targa, cliente proprietario) {
		this.targa = targa;
		this.proprietario = proprietario;
	}

	/*
	 * Getter e Setter: Permettono di leggere o modificare targa e proprietario,
	 * mantenendo gli attributi privati per incapsulamento.
	 */

	public String getTarga() {
		return targa; // Ritorna la targa del veicolo
	}

	public void setTarga(String targa) {
		this.targa = targa; // Imposta/modifica la targa
	}

	public cliente getProprietario() {
		return proprietario; // Ritorna il riferimento al cliente proprietario
	}

	public void setProprietario(cliente proprietario) {
		this.proprietario = proprietario; // Modifica il proprietario
	}

	/**
	 * Metodo toString: definisce la rappresentazione a stringa del veicolo, mostra
	 * la targa e le info del cliente associato (chiamando il suo toString).
	 */
	@Override
	public String toString() {
		return "Veicolo targa: '" + targa + "', proprietario:\n" + proprietario;
	}
}
