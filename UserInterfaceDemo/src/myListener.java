import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class myListener implements WindowListener, ActionListener{

	private TextArea textArea;
	
	public myListener(TextArea textArea) {
		this.textArea = textArea;
	}
	
	private void printToText(String text) {
		String currentText = textArea.getText();
		String nextText = currentText + "\n" + text;
		textArea.setText(nextText);
		textArea.setCaretPosition(0);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		printToText("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		printToText("windowClosed");
		printToText("Goodbye!");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		printToText("windowClosing");
		((Frame)arg0.getSource()).dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		printToText("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		printToText("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		printToText("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		printToText("windowOpened");
	}
	public void actionPerformed(ActionEvent arg0) {
		Button button = (Button)arg0.getSource();
		printToText(button.getLabel());
	}

}
