package coffemachine.machine;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	private Panel panel;
	private SafeBox safeBox;
	private List<Ingredient> ingredients;

	public Machine() {
		SafeBox safeBox = new SafeBox();
		Panel panel = new Panel();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		this.ingredients = ingredients;
		this.panel = panel;
		this.safeBox = safeBox;
		Ingredient cup = new Ingredient("Copo", 1);
		Ingredient water = new Ingredient("Água", 50);
		Ingredient coffePowder = new Ingredient("Café", 10);
		Ingredient sugar = new Ingredient("Açucar", 5);
		this.ingredients.add(cup);
		this.ingredients.add(water);
		this.ingredients.add(coffePowder);
		this.ingredients.add(sugar);
	}

	public SafeBox getSafeBox() {
		return safeBox;
	}

	public void setSafeBox(SafeBox safeBox) {
		this.safeBox = safeBox;
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public String coffeIsReady() {
		panel.getDisplay().setMessage("Pronto");
		return panel.getDisplay().getMessage();
	}
	
	public void setMessageInDisplay(String message) {
		panel.getDisplay().setMessage(message);
	}
	
	public String showMessageInDisplay() {
		return panel.getDisplay().getMessage();
	}

	public void newMoeda10() {
		Coin coin10 = new Coin();
		coin10.setValue(0.10);
		this.safeBox.depositCoin(coin10);
	}

	public void newMoeda25() {
		Coin coin25 = new Coin();
		coin25.setValue(0.25);
		this.safeBox.depositCoin(coin25);
	}

	public Double checkAmountOfCoinsValue() {
		return this.safeBox.checkAmountOfCoins();
	}	

	public String pressButtonCoffe() {
		setMessageInDisplay(this.panel.getButtons().get(0).getOption());
		return showMessageInDisplay();
	}

}
