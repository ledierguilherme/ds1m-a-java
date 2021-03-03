package conversor_temperatura;

public class ConversorCelsiusParaFahrenheit {

	public static void main(String[] args) { 
		
		float celsius;
		float fahrenheit;
		
		celsius = 27;
		
		fahrenheit = (9 * celsius + 160)/5;
		
		System.out.print("O resultado da sua conversão é " + fahrenheit + " graus fahrenheit");
		
		
	}
}

