package modelo;

import javax.swing.JOptionPane;

public class MenuTemperatura {
	
	
	public static double menuDeOpciones (String entrada, String salida, String cantidadEntrada) {
		
		double resultado = 0.0;
		Double cantidad = Double.valueOf(0);
		
		
		try {
		cantidad = Double.parseDouble(cantidadEntrada);
		}catch (NumberFormatException  e) {
			System.out.println("Error: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Ingresa alguna cantidad");
		}
		String opt = entrada+"_"+salida;
		
		
		switch (opt) {
		case "CELCIUS_FAHRENHEIT":
			resultado = ConversorTemperatura.CelsiusToFahrenheit(cantidad);
			break;
		case "CELCIUS_KELVIN":
			resultado = ConversorTemperatura.CelsiusToKelvin(cantidad);
			break;
		case "CELCIUS_RANKINE":
			resultado = ConversorTemperatura.CelsiusToRankine(cantidad);
			break;
		case "FAHRENHEIT_CELCIUS":
			resultado = ConversorTemperatura.FahrenheitToCelsius(cantidad);
			break;
		case "FAHRENHEIT_KELVIN":
			resultado = ConversorTemperatura.FahrenheitToKelvin(cantidad);
			break;
		case "FAHRENHEIT_RANKINE":
			resultado = ConversorTemperatura.FahrenheitToRankine(cantidad);
			break;
		case "KELVIN_CELCIUS":
			resultado = ConversorTemperatura.KelvinToCelSius(cantidad);
			break;
		case "KELVIN_FAHRENHEIT":
			resultado = ConversorTemperatura.KelvinToFahrenheit(cantidad);
			break;
		case "KELVIN_RANKINE":
			resultado = ConversorTemperatura.KelvinToRankine(cantidad);
			break;
		case "RANKINE_CELCIUS":
			resultado = ConversorTemperatura.RankineToCelsius(cantidad);
			break;
		case "RANKINE_FAHRENHEIT":
			resultado = ConversorTemperatura.RankineToFahrenheit(cantidad);
			break;
		case "RANKINE_KELVIN":
			resultado = ConversorTemperatura.RankineToKelvin(cantidad);
			break;
		case "CELCIUS_CELCIUS":
		case "FAHRENHEIT_FAHRENHEIT":
		case "KELVIN_KELVIN":
		case "RANKINE_RANKINE":
		default:
			resultado = cantidad;
			break;

		
			
		}
		
		return resultado;
		
		
	}

	
}
