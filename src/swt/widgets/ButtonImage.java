package swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonImage {
	
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setText("SWT Buttons");
		
		Image image = display.getSystemImage(SWT.ICON_QUESTION);
		
		//Classic Push Button...
		Button pushButton = new Button(shell, SWT.PUSH);
		pushButton.setBounds(10, 25, 120, 45);
		pushButton.setText("Push Button");
		pushButton.setImage(image);
		pushButton.addListener(SWT.Selection , e -> System.out.println("Push button clicked") );

		shell.setSize (160, 120);
		shell.open ();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
