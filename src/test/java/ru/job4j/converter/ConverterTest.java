package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void whenConvert420RblThen6Euro() {
        float inForEuro = 420;
        float expectedForEuro = 6;
        float outForEuro = Converter.rubleToEuro(inForEuro);
        float eps = 0.0001f;
        assertThat(outForEuro).isEqualTo(expectedForEuro, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen3dot3333Dlr() {
        float inForDollar = 200;
        float expectedForDollar = 3.3333f;
        float outForDollar = Converter.rubleToDollar(inForDollar);
        float eps = 0.0001f;
        assertThat(outForDollar).isEqualTo(expectedForDollar, withPrecision(eps));
    }
}