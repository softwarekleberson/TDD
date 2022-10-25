import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BonusServiceTest {

	@Test
	void testaSalarioFuncionarioValorAltoDevolveBonusZero() {
		
		BonusService servico = new BonusService();
		//assertThrows(IllegalArgumentException.class,
				//() -> servico.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
		
		try {
			
			servico.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			fail("Não gerou excecão");
			
		}catch(Exception ex){
			assertEquals("Você não pode receber o bonus", ex.getMessage());
		}
		
	}
	
	@Test
	void testaSalarioFuncionarioComBonusDezPorcento() {
		
		BonusService servico = new BonusService();
		BigDecimal bonus = servico.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoSalario10000() {
		
		BonusService servico = new BonusService();
		BigDecimal bonus = servico.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	

}
