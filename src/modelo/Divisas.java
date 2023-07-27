package modelo;

public enum Divisas {
	RIAL_SAUDÍ("Rial Saudí","SAR"),
	BAHT_TAILANDÉS("Peso Argentino","THB"),
	BALBOA("Dólar Australiano","PAB"),
	BOLIVIANO("Dólar Bahameño","BOB"),
	COLÓN_COSTARRICENSE("Dólar Borbuda","CRC"),
	CÓRDOBA("Dólar Beliceño","NIO"),
	CORONA_CHECA("Boliviano","CZK"),
	CORONA_DANESA("Real Brasileño","DKK"),
	CORONA_NORUEGA("Lev Búlgaro","NOK"),
	CORONA_SUECA("Dólar Canadiense","SEK"),
	DINAR_IRAQUÍ("Rial Qatarí","IQD"),
	DÍRHAM_MARROQUÍ("Peso Chileno","MAD"),
	DÓLAR_AUSTRALIANO("Yuan Chino","AUD"),
	DÓLAR_BAHAMEÑO("Peso Colombiano","BSD"),
	DÓLAR_BELICEÑO("Won Surcoreano","BZD"),
	DÓLAR_BORBUDA("Colón Costarricense","BMD"),
	DÓLAR_CANADIENSE("Kuna Croata","CAD"),
	DÓLAR_DE_HONG_KONG("Peso Cubano","HKD"),
	DÓLAR_ESTADOUNIDENSE("Corona Danesa","USD"),
	DÓLAR_JAMAICANO("Libra Egipcia","JMD"),
	DÓLAR_NEOZELANDÉS("Dólar Estadounidense","NZD"),
	DÓLAR_SINGAPURENSE("Peso Filipino","SGD"),
	DÓLAR_TAIWANÉS("Libra Esterlina","TWD"),
	DÓLAR_TRINITENSE("Quetzal","TTD"),
	DONG_VIETNAMITA("Gourde","VND"),
	FORINT("Lempira","HUF"),
	FRANCO_BEAC("Dólar De Hong Kong","XAF"),
	FRANCO_SUIZO("Forint","CHF"),
	GOURDE("Rupia India","HTG"),
	GRIVNA_UCRANIANA("Rupia Indonesia","UAH"),
	GUARANÍ("Dinar Iraquí","PYG"),
	KUNA_CROATA("Nuevo Shequel Israelí","HRK"),
	LEMPIRA("Dólar Jamaicano","HNL"),
	LEV_BÚLGARO("Yen","BGN"),
	LIBRA_EGIPCIA("Dírham Marroquí","EGP"),
	LIBRA_ESTERLINA("Peso Mexicano","GBP"),
	LIRA_TURCA("Córdoba","TRY"),
	NUEVO_SHEQUEL_ISRAELÍ("Corona Noruega","ILS"),
	PESO_ARGENTINO("Dólar Neozelandés","ARS"),
	PESO_CHILENO("Rupia Pakistaní","CLP"),
	PESO_COLOMBIANO("Balboa","COP"),
	PESO_CUBANO("Guaraní","CUP"),
	PESO_DOMINICANO("Sol Peruano","DOP"),
	PESO_FILIPINO("Zloty Polaco","PHP"),
	PESO_MEXICANO("Franco Beac","MXN"),
	PESO_URUGUAYO("Corona Checa","UYU"),
	QUETZAL("Peso Dominicano","GTQ"),
	RAND_SUDAFRICANO("Dólar Singapurense","ZAR"),
	REAL_BRASILEÑO("Rand Sudafricano","BRL"),
	RIAL_QATARÍ("Corona Sueca","QAR"),
	RUPIA_INDIA("Franco Suizo","INR"),
	RUPIA_INDONESIA("Baht Tailandés","IDR"),
	RUPIA_PAKISTANÍ("Dólar Taiwanés","PKR"),
	SOL_PERUANO("Dólar Trinitense","PEN"),
	WON_SURCOREANO("Lira Turca","KRW"),
	YEN("Grivna Ucraniana","JPY"),
	YUAN_CHINO("Peso Uruguayo","CNY"),
	ZLOTY_POLACO("Dong Vietnamita","PLN");






	private String nombre;
	private String sigla;
	
	private Divisas (String nombre,String sigla) {
		this.nombre = nombre;
		this.sigla = sigla;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getSigla() {
		return sigla;
	}
	

}
