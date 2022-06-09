import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.TextArea;

/** Program on 6/6/2022 Java Abstract Window Toolkit (AWT)
 * 
 * @author s-ELAURSEN
 *
 */
public class Program {
	
	private static Frame myFrame = new Frame("Java UI Demo");
	private static Button myButton = new Button("first button");
	private static TextArea myTextArea = new TextArea();
	private static myListener myyListener = new myListener(myTextArea);
	
	private static final int _padding = 10;
	
	public static void main(String[] args) {
		System.out.println("Hello Java UI Demo");
		
		myFrame.setSize(800, 600);
		myFrame.setVisible(true);
		
		myFrame.addWindowListener(myyListener);
		myFrame.setLayout(null);
		
		Dimension d = myFrame.getSize();
		System.out.println(d);
		Insets i = myFrame.getInsets();
		System.out.println(i);
		
		myButton.setBounds(i.left+10, i.top+10, 100, 40);
		myFrame.add(myButton);
		myFrame.setBackground(Color.darkGray);
		
		myButton.setLabel("Button-red");
		myButton.setBackground(Color.red);
		//myButton.setActionCommand("Action");
		//myButton.getActionCommand();
		
		myButton.addActionListener(myyListener);
		
		int xAnchor = myButton.getX();
		int yAnchor = myButton.getY() + myButton.getHeight() + _padding;
		myTextArea.setBounds(xAnchor, yAnchor,
				myFrame.getWidth() - i.left - i.right - 2 * _padding,
				myFrame.getHeight() - yAnchor - i.bottom - _padding);
		myFrame.add(myTextArea);
		myTextArea.setBackground(Color.gray);
		myTextArea.setEditable(false);
		
		
	}

}
