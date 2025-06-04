package conversion;

public class Conversor {

	
	private final static double KM_A_MILLAS = 0.62;

	private final static double MB_A_ATM = 0.00098;
	private final static double KAL_A_JULIOS = 4.184;

	public Conversor() {
	}

//Atmosferas a milibares
	public static double atmosferas(double milibares) {

		return redondear(milibares * MB_A_ATM) ;
	}
	
//Milibares a Atmosferas
	public static double milibares(double atmosferas) {

		return redondear( atmosferas / MB_A_ATM) ;
	}

	
	

	public static double redondear(double num) {

		return Math.round(num * 100) / 100.0;
	}
}
