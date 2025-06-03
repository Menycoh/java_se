package assicurazione;

/**
 * La classe Veicolo rappresenta un veicolo assicurato, associato a un cliente
 * proprietario.
 */
public class veicolo {
	private String targa; // Numero di targa del veicolo (identificativo univoco)
	private cliente proprietario; // Riferimento al cliente proprietario del veicolo
	private String marca;
	private String modello;
	private String anno;

	/**
	 * Costruttore parametrico: serve a creare un veicolo impostando targa e
	 * proprietario al momento della creazione.
	 *
	 * @param marca
	 * @param modello
	 * @param anno
	 * @param targa        Targa del veicolo
	 * @param proprietario Oggetto cliente che è proprietario del veicolo
	 *
	 */
	public veicolo(String targa, cliente proprietario, String marca, String modello, String anno) {
		this.targa = targa;
		this.proprietario = proprietario;
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	/**
	 * Metodo toString: definisce la rappresentazione a stringa del veicolo, mostra
	 * la targa e le info del cliente associato (chiamando il suo toString).
	 */
	@Override
	public String toString() {
		return "- Veicolo targa: '" + targa + "', proprietario:\n" + proprietario + "\n- Marca: " + marca + "\n- modello: "+ modello + "\n- Anno: " + anno;
	}
}
