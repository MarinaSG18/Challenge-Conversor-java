package modelo;

public class ConversorTemperatura {

	// Celcuis

	public static double CelsiusToFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	public static double CelsiusToKelvin(double c) {
		return c + 273.15;
	}

	public static double CelsiusToRankine(double c) {
		return c * 9 / 5 + 491.67;
	}

	// Fahrenheit

	public static double FahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static double FahrenheitToKelvin(double f) {

		return (f - 32) * 5 / 9 + 273.15;
	}

	public static double FahrenheitToRankine(double f) {
		return f + 459.67;
	}

	// Kelvin

	public static double KelvinToFahrenheit(double k) {
		return k - 273.15 * 9 / 5 + 32;
	}

	public static double KelvinToCelSius(double k) {
		return k - 273.15;
	}

	public static double KelvinToRankine(double k) {
		return k * 1.8 ;
	}

	// Rankine

	public static double RankineToCelsius(double r) {
		
		return (r - 491.67) * 5 / 9;
	}

	public static double RankineToFahrenheit(double r) {
		return r - 459.67;
	}

	public static double RankineToKelvin(double r) {
		return r * 5 / 9;
	}

}
