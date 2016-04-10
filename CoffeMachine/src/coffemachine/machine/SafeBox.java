package coffemachine.machine;

import java.util.ArrayList;
import java.util.List;

public class SafeBox {
	private List<Coin> coins = new ArrayList<>();
	
	public Double checkAmountOfCoins() {
		double amount = 0.00;
		for (Coin coin : coins) {
			amount = amount + coin.getValue();
		}
		return amount;
	}

	public void depositCoin(Coin coin) {
		coins.add(coin);
	}
	public Boolean chestIsEmpty() {
		return coins.isEmpty();
	}
}
