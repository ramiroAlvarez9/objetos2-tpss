package enumstream;

public enum ColorPielLesionesDermatologicas {
	
	ROJO("Descripcion de ROJO", 1, "GRIS"), 
	GRIS("Descripcion de GRIS", 2, "AMARILLO"),
	AMARILLO("Descripcion de AMARILLO", 3, "MIEL"),
	MIEL("Descripcion de MIEL", 4, "ROJO");

	private final String descripcion;
	private final int nivelDeRiesgo;
	private final String siguienteColor;

	ColorPielLesionesDermatologicas(String descripcion, int nivelDeRiesgo, String siguienteColor) {
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
		this.siguienteColor = siguienteColor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public String getSiguienteColor() {
		return siguienteColor;
	}

	public static ColorPielLesionesDermatologicas siguienteColor(ColorPielLesionesDermatologicas color) {
		switch (color) {
			case ROJO:
				return GRIS;
			case GRIS:
				return AMARILLO;
			case AMARILLO:
				return MIEL;
			case MIEL:
				return ROJO;
			default:
				return ROJO;
		}
	}
}
