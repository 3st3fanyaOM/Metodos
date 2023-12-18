package practicos;

public class Ejercicio2 {

	public static void main(String[] args) {
	String texto = "  HOLA QUE TAL  ";
	System.out.println(getMinusculas(texto));

	}
	
	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}

}
