package practicos;

public class Ejercicio3 {

	public static void main(String[] args) {
	String texto = "MAYUSCULAS Y minusculas";
	System.out.println(getMayMin(texto,2));

	}
	public static String getMayMin(String cadena, Integer numero) {
		String palabra = "";
		if (numero ==1) {
			palabra = cadena.toUpperCase();
		}
		else if (numero ==2) {
			palabra = cadena.toLowerCase();
		}
		return palabra;
	}

}
