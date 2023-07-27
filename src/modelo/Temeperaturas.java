package modelo;

public enum Temeperaturas {
	CELCIUS ("°C"),
	FAHRENHEIT ("°F"),
	KELVIN ("°K"),
	RANKINE ("°Ra");
	
	
	private String simbolo;
	
	private Temeperaturas(String simb) {
		this.simbolo=simb;
		
	}

	public String getSimbolo() {
		return simbolo;
	}
	
	
	
}
