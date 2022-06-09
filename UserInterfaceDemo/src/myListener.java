import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;

public class myListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed");
		System.out.println("Goodbye!");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing");
		((Frame)arg0.getSource()).dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened");
	}

}
