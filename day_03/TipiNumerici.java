package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabili di tipo intero
		byte numeroByte = 122; // in binario: 01111010 (8 Bit)
		short numeroShort = numeroByte; // in binario: 00000000 01111010 (16 Bit)
		int numeroInt = numeroShort; // 00000000 00000000 00000000 01111010 (32 Bit)
		long numeroLong = numeroInt; // 00000000 00000000 00000000 00000000 01111010 (64 Bit)
		float numeroFloat = numeroLong; // Sempre 32 bit
		double numeroDouble = numeroFloat; // 64 Bit
		System.out.println("numeroDouble: "+ numeroDouble);
	
	}

}
