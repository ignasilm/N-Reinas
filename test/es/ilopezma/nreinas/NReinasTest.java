package es.ilopezma.nreinas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NReinasTest {

	@Test
	@Order(1)
	@DisplayName("Recursivo: Test basico")
	void test() {
		NReinas nreinas = new NReinas();
		assertNotNull(nreinas);
	}

}
