
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class Parcial_test {
    private Parcial parcial;

    @BeforeEach
    public void setUp() {
        this.parcial = new Parcial();
    }
    
    @Test
    public void testRaicesDistintas() throws Exception {
        double[] resultado = this.parcial.resolverEcuacion(1, -3, 2); 
        assertEquals(2.0, resultado[0], 0.0001); 
        assertEquals(1.0, resultado[1], 0.0001); 
    }

    @Test
    public void testRaicesIguales() throws Exception {
        double[] resultado = this.parcial.resolverEcuacion(1, -2, 1); 
        assertEquals(1.0, resultado[0], 0.0001); 
        assertEquals(1.0, resultado[1], 0.0001);
    }
    @Test
    public void testExcepcionCoeficienteCero() {
        Exception e = assertThrows(Exception.class, () -> this.parcial.resolverEcuacion(0, -3, 2));
        assertEquals("El coeficiente 'a' no puede ser cero", e.getMessage());
    }

    @Test
    public void testExcepcionDiscriminanteNegativo() {
        Exception e = assertThrows(Exception.class, () -> this.parcial.resolverEcuacion(1, 2, 5));
        assertEquals("El discriminante es negativo (raíces complejas)", e.getMessage());
    }

    @Test
    public void testRaicesRealesDistintasConDuracion() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            double[] resultado = this.parcial.resolverEcuacion(1, -3, 2); 
            assertEquals(2.0, resultado[0], 0.0001);
            assertEquals(1.0, resultado[1], 0.0001);
        });
    }
}


