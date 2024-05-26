package enumstream;

/**
 *
 * Desarrolle un enumerativo para representar el color que pueden tomar las
 * lesiones dermatológicas: ● Rojo ● Gris ● Amarillo ● Miel En todos los casos
 * debe tener una descripción predefinida, el nivel de riesgo y saber cuál es el
 * próximo color en el proceso de maduración. Asumamos rotativo, es decir cuando
 * pregunto el siguiente de Miel debe responder Rojo. Realice test para probar
 * las funcionalidades pedidas.
 * 
 * 
 */

public class TestColorLesionesDermatologicas {

	public enum ColorDePiel {
		ROJO, GRIS, AMARILLO, MIEL
		
	}

	public void descripcionDeColorDePiel(ColorDePiel colorDePiel) {

		switch (colorDePiel) {
		case ROJO:
			System.out.println("Piel Roja, riesgo 1, proximo color: gris");
			break;
		case GRIS:
			System.out.println("Piel Roja, riesgo 2, proximo color: Amarillo");
			break;
		case AMARILLO:
			System.out.println("Piel Amarilla, riesgo 3, proximo color: miel");
			break;
		case MIEL:
			System.out.println("Piel Amarilla, riesgo 4, proximo color: roja ");
			break;

		}

	}

	public ColorDePiel siguienteColorDePiel(ColorDePiel colorDePiel) {
		
		switch (colorDePiel) {
		
		case ROJO:
			return colorDePiel.GRIS;
		case GRIS:
			return colorDePiel.AMARILLO;
		case AMARILLO:
			return colorDePiel.MIEL;
		case MIEL:
			return colorDePiel.ROJO;
		default:
			return colorDePiel.ROJO;

		}
		

	}

}
