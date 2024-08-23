package swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonsWithEvents {

	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setText("SWT Buttons");
		
		//Classic Push Button...
		Button pushButton = new Button(shell, SWT.PUSH);
		pushButton.setBounds(20, 25, 100, 30);
		pushButton.setText("Push Button");
		pushButton.addListener(SWT.Selection , e -> System.out.println("Push button clicked") );

		
		//Toggle Button
		Button toggleButton = new Button(shell, SWT.TOGGLE);
		toggleButton.setSelection(false);
		toggleButton.setBounds(20, 65, 100,30);
		toggleButton.setText("Toggle Button");
		toggleButton.addListener(SWT.Selection , 
				e -> System.out.println("Toggle button clicked: State is " + toggleButton.getSelection())
		);
		
		
		
		shell.setSize (160, 150);
		shell.open ();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
