package swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CheckboxWithEvents {

	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setText("Empty SWT Screen");
		
		
		//Check Boxes
		Button[] checkBoxs = new Button[3];
		checkBoxs[0] = new Button(shell, SWT.CHECK);
		checkBoxs[0].setSelection(true);
		checkBoxs[0].setText("Choice 1");
		checkBoxs[0].setBounds(30,25,60,30);
		checkBoxs[0].addListener(SWT.Selection , 
				e -> System.out.println("Check Boe #1 clicked: value is " + checkBoxs[0].getSelection()) 
		);
		
		checkBoxs[1] = new Button(shell, SWT.CHECK);
		checkBoxs[1].setText("Choice 2");
		checkBoxs[1].setBounds(100,25,70,30);
		checkBoxs[1].addListener(SWT.Selection ,
				e -> System.out.println("Check Box #2 clicked: value is " + checkBoxs[1].getSelection())
		);

		
		checkBoxs[2] = new Button(shell, SWT.CHECK);
		checkBoxs[2].setText("Choice 3");
		checkBoxs[2].setBounds(180,25,70,30);
		checkBoxs[2].addListener(SWT.Selection , 
				e -> System.out.println("Check Box #3 clicked: value is " + checkBoxs[2].getSelection())
		);
		
		
		shell.setSize (300, 100);
		shell.open ();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
