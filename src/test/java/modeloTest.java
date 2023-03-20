import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class modeloTest {
    @Test
    public void TesteRetornoNomeCliente(){
      modelo.getInicializar().setNomeCliente("Robson");
        assertEquals("Robson", modelo.getInicializar().getNomeCliente());
    }
}