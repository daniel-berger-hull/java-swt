package swt.widgets;


/* This is an example of few events that can be handled when using aText widget */


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextEventsHandling {

	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setText("Text Field Example");
				
		Text textDemo = new Text (shell, SWT.SINGLE | SWT.BORDER);
		textDemo.setBounds (10, 85, 100, 32);
	
		//Basic focus events...
		textDemo.addListener (SWT.FocusIn, e -> System.out.println("Got focus") );
		textDemo.addListener (SWT.FocusOut, e -> System.out.println("Focus lost") );
		
		// Event object returned has a keyCode field, which is the ASCII value of the key typed
		textDemo.addListener (SWT.KeyDown, e -> System.out.println ("Key Typed:  #" + e.keyCode + ", ascii " + (char)e.keyCode) );
		
		//This other text control is only to make sure that the focus can 
		//go somewhere else, and demonstrates the focus events...
		Text otherText = new Text (shell, SWT.SINGLE | SWT.BORDER);
		otherText.setBounds (10, 125, 100, 32);
		
		 
		shell.setSize (300, 300);
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
