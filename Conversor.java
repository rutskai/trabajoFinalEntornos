package conversion;

public class Conversor {

	//Para pasar de km a millas multiplicamos por la siguiente constante.
	private final static double KM_A_MILLAS= 0.62;
	private final static double MB_A_ATM= 0.00098;
	private final static double KAL_A_JULIOS= 4.184;
	
	//Redondea.
		static double redondear(double num){

			return Math.round(num*100)/100.0;
			
		}
	
		//De kilómetros a millas.
	public double millas(double km) {
		return redondear(km*KM_A_MILLAS);
	}
	

		//De millas a kilómetros.
	public double km(double millas) {
		return redondear(millas/KM_A_MILLAS);
		
	}
	

}
