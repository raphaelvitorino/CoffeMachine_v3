package coffemachine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import coffemachine.machine.Button;
import coffemachine.machine.SafeBox;
import coffemachine.machine.Coin;
import coffemachine.machine.Display;
import coffemachine.machine.Ingredient;
import coffemachine.machine.Machine;
import coffemachine.machine.Panel;

public class TestCoffeeMachine {

	@Test
	public void depositCoinTest() {
		Machine machine = new Machine();
		machine.newMoeda10();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		assertEquals("0.10", machine.showMessageInDisplay());
		machine.newMoeda25();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		assertEquals("0.35", machine.showMessageInDisplay());
	}

	@Test
	public void pressButtonCoffe() {
		Machine machine = new Machine();
		assertEquals("Café", machine.pressButtonCoffe());
	}

	@Test
	public void combineIngredients() {
		Machine machine = new Machine();
		assertEquals("Pronto", machine.coffeIsReady());
	}

	@Test
	public void pressButtonCoffeWithoutMoney() {
		Machine machine = new Machine();
		if (machine.checkAmountOfCoinsValue() < 0.35) {
			machine.setMessageInDisplay("Valor insuficiente");
			assertEquals("Valor insuficiente", machine.showMessageInDisplay());
		}

	}

}
