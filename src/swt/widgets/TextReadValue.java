package swt.widgets;

/* This is an example of handling the value of a Text widget*/

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class TextReadValue {

	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setText("Text Field Example");
				
		Text textDemo = new Text (shell, SWT.SINGLE | SWT.BORDER);
		textDemo.setBounds (10, 15, 130, 32);
		
		Button readButton = new Button(shell, SWT.PUSH);
		readButton.setText("Read Text!");
		readButton.setBounds (10, 55, 65, 35);
		readButton.addListener(SWT.Selection , e -> System.out.println(textDemo.getText()) );

		Button clearButton = new Button(shell, SWT.PUSH);
		clearButton.setText("Clear");
		clearButton.setBounds (80, 55, 65, 35);
		clearButton.addListener(SWT.Selection , e -> textDemo.setText("") );
		
		shell.setSize (165, 145);
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	
	
	}

}
