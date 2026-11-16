package br.edu.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ConversorTest {

    @Test
    void fahrenheitParaCelsius_pontoDeCongelamento() {
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    void fahrenheitParaCelsius_pontoDeEbulicao() {
        assertEquals(100.0, Conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    void celsiusParaFahrenheit_pontoDeCongelamento() {
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0), 0.001);
    }

    @Test
    void celsiusParaFahrenheit_pontoDeEbulicao() {
        assertEquals(212.0, Conversor.celsiusParaFahrenheit(100), 0.001);
    }
}