package br.com.zup.device.ju;

//import br.com.cursoemvideo.sobrecarga.cls.Laptop
import org.junit.jupiter.api.Test;

import br.com.zup.device.cls.Laptop;

import static org.junit.jupiter.api.Assertions.*;


public class TestJu {

    // Teste de exce��o que funciona em qualquer vers�o do JUnit
    @Test
    public void testParamStorageThrowException() {
        try {
            Laptop lap = new Laptop(1,"UFS","i3", 8);

            fail("O argumento storage n�o soltou a exce��o");
        } catch (IllegalArgumentException ex) {
            assertEquals("ERRO: preencha o campo de armazenamento corretamente", ex.getMessage());
        }
    }

    //Teste de excec�o com JUnit 5
    @Test
    public void testParamProcessorThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                Laptop lap = new Laptop(1, "SSD", "i10", 8);
        });

        assertEquals("ERRO: preencha o campo de processador corretamente", exception.getMessage());
    }
}