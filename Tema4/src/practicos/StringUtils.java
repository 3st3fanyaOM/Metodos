package practicos;

public class StringUtils {

	public static String getMayusculas(String cadena) {
		return cadena.trim().toUpperCase();
	}

	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}

	public static String quitVocals(String cadena) {
		return cadena.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
	}

	public static String emailOK(String email) {
		Boolean error = false;

		if (!email.contains("@")) {
			error = true;
			System.out.println("Debe contener @");
		} else if (email.contains("@.")) {
			error = true;
			System.out.println("No puede contener @.");
		} else if (email.endsWith(".")) {
			error = true;
			System.out.println("No puede terminar en .");
		} else {
			error = false;
			System.out.println("Email correcto");
		}

		return email;
	}

	public static String userOK(String user) {
		Boolean error = false;

		String user1 = user.trim().toUpperCase();

		if (user1.length() < 10) {
			error = false;
			System.out.println("Error");
		} else if (user1.contains(" ")) {
			error = false;
			System.out.println("Error");
		} else {
			error = true;
			System.out.println("Su usuario es " + user1);
		}

		return user;
	}

}
