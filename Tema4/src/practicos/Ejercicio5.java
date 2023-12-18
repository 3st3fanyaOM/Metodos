package practicos;

public class Ejercicio5 {

	public static void main(String[] args) {
	Integer resultado = sumar(3,3);
	System.out.println("El resultado de 3 + 3 es :"+resultado);
	Integer division = calculadora.dividir(12, 3);
	System.out.println("12 / 3 = "+division);
	Integer calculo = calculadora.calcular("add", 5, 5);
	System.out.println(calculo);

	}
	public static Integer sumar (Integer num1,Integer num2) {
		return num1+num2;
	}

}
