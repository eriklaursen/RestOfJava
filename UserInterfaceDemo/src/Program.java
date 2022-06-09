import java.awt.Frame;

/** Program on 6/6/2022 Java Abstract Window Toolkit (AWT)
 * 
 * @author s-ELAURSEN
 *
 */
public class Program {

	public static void main(String[] args) {
		System.out.println("Hello Java UI Demo");
		
		Frame myFrame = new Frame("Java UI Demo");
		myFrame.setSize(800, 600);
		myFrame.setVisible(true);
		myListener myyListener = new myListener();
		myFrame.addWindowListener(myyListener);
		
		//System.out.println("Goodbye!");
	}

}
