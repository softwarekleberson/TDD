import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class ReajusteSalarioTest {
	
	@Test
	void reajusteSalarioFuncionarioTresPoncentoDesempenhoADesejar() {
		ReajusteSalario r1 = new ReajusteSalario();
		Funcionario f1 = new Funcionario("jose", LocalDate.now(), new BigDecimal("1000.00"));
		
		r1.concederReajuste(f1, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), f1.getSalario());
	}
}
