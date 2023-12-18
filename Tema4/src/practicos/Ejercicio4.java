package practicos;

public class Ejercicio4 {

	public static void main(String[] args) {
		String texto = "MAYUSCULAS Y minusculas";
		System.out.println(getMayMin(texto,1));
	}
		
		public static String getMayMin(String cadena, Integer numero) {
			String palabra = "";
			if (numero ==1) {
				palabra = Ejercicio1.getMayusculas(cadena);
			}
			else if (numero ==2) {
				palabra = Ejercicio2.getMinusculas(cadena);
			}
			return palabra;
		}
	}