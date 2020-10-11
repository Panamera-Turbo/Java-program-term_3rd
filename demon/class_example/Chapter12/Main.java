import java.awt.*£»
public class Main extends Frame {
	Label statusBar = new Label( )£»

	Main( ) {
		super("Example")£»
		add("South", statusBar)£»
		resize(200, 200)£»
		show( )£»
	}

	public boolean handleEvent(Event evt) {
		switch (evt.id) {
		case Event.MOUSE£­MOVE:
			return mouseMove(evt, evt.x, evt.y)£»
		case Event.MOUSE£­DRAG:
			return mouseDrag(evt, evt.x, evt.y)£»
		case Event.WINDOW£­DESTROY:
			hide( )£»
			dispose()£»
			System.exit(0)£»
			return true£»

		}
		return super.handleEvent(evt)£»
	}

	public boolean mouseDrag(Event evt, int x, int y) {
		String status = "("+evt.x+","+evt.y+") "£»
		if (evt.controlDown()) status += "C"£»
		if (evt.shiftDown()) status += "S"£»
		statusBar.setText(status)£»
		return true£»
	}

	public boolean mouseMove(Event evt, int x, int y) {
		String status = "("+evt.x+","+evt.y+") "£»
		if (evt.controlDown()) status += "C"£»
		if (evt.shiftDown()) status += "S"£»
		statusBar.setText(status)£»
		return true£»
	}

	static public void main(String[] args) {
		new Main()£»
	}
}