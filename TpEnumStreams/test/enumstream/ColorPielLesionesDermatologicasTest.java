package enumstream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ColorPielLesionesDermatologicasTest {

    @Test
    public void testDescripcion() {
        assertEquals("Descripcion de ROJO", ColorPielLesionesDermatologicas.ROJO.getDescripcion());
        assertEquals("Descripcion de GRIS", ColorPielLesionesDermatologicas.GRIS.getDescripcion());
        assertEquals("Descripcion de AMARILLO", ColorPielLesionesDermatologicas.AMARILLO.getDescripcion());
        assertEquals("Descripcion de MIEL", ColorPielLesionesDermatologicas.MIEL.getDescripcion());
    }

    @Test
    public void testNivelDeRiesgo() {
        assertEquals(1, ColorPielLesionesDermatologicas.ROJO.getNivelDeRiesgo());
        assertEquals(2, ColorPielLesionesDermatologicas.GRIS.getNivelDeRiesgo());
        assertEquals(3, ColorPielLesionesDermatologicas.AMARILLO.getNivelDeRiesgo());
        assertEquals(4, ColorPielLesionesDermatologicas.MIEL.getNivelDeRiesgo());
    }

    @Test
    public void testSiguienteColor() {
        assertEquals("GRIS", ColorPielLesionesDermatologicas.ROJO.getSiguienteColor());
        assertEquals("AMARILLO", ColorPielLesionesDermatologicas.GRIS.getSiguienteColor());
        assertEquals("MIEL", ColorPielLesionesDermatologicas.AMARILLO.getSiguienteColor());
        assertEquals("ROJO", ColorPielLesionesDermatologicas.MIEL.getSiguienteColor());
    }

    @Test
    public void testSiguienteColorEnum() {
        assertEquals(ColorPielLesionesDermatologicas.GRIS, ColorPielLesionesDermatologicas.siguienteColor(ColorPielLesionesDermatologicas.ROJO));
        assertEquals(ColorPielLesionesDermatologicas.AMARILLO, ColorPielLesionesDermatologicas.siguienteColor(ColorPielLesionesDermatologicas.GRIS));
        assertEquals(ColorPielLesionesDermatologicas.MIEL, ColorPielLesionesDermatologicas.siguienteColor(ColorPielLesionesDermatologicas.AMARILLO));
        assertEquals(ColorPielLesionesDermatologicas.ROJO, ColorPielLesionesDermatologicas.siguienteColor(ColorPielLesionesDermatologicas.MIEL));
    }
}
