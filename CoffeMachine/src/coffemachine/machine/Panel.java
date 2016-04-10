package coffemachine.machine;

import java.util.ArrayList;
import java.util.List;

public class Panel {
	private List<Button> buttons;
	private Display display;

	public List<Button> getButtons() {
		return buttons;
	}

	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}

	public Panel() {
		List<Button> buttons = new ArrayList<Button>();
		Display display = new Display();
		this.display = display;
		this.buttons = buttons;
		Button buttonCoffe = new Button("Café");
		buttons.add(buttonCoffe);

	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

}
