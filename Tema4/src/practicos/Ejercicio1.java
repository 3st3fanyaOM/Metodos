package practicos;

public class Ejercicio1 {

	public static void main(String[] args) {
	String texto = " hola que tal";
	System.out.println(getMayusculas(texto));

	}
	public static String getMayusculas(String cadena) {
	return cadena.trim().toUpperCase();	
	}

}
