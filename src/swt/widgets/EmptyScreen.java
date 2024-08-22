package swt.widgets;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class EmptyScreen {
	
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setText("Empty SWT Screen");
		
		shell.open ();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
