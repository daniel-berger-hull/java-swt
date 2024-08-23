package swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RadioButtonsWithEvents {
	
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setText("Empty SWT Screen");
		
		
		// Radio Button
		// Note: When a radio is clicked, not only the clicked button will have a click event,
		//       but the radio button currently having the focus (and will lose it) also receive an click event...
		Button[] radioButtons = new Button[3];
		radioButtons[0] = new Button(shell, SWT.RADIO);
		radioButtons[0].setSelection(true);
		radioButtons[0].setText("Choice 1");
		radioButtons[0].setBounds(30,25,60,30);
		radioButtons[0].addListener(SWT.Selection , 
				e -> System.out.println("Radio Button #1 clicked: value is " + radioButtons[0].getSelection()) 
		);
		
		radioButtons[1] = new Button(shell, SWT.RADIO);
		radioButtons[1].setText("Choice 2");
		radioButtons[1].setBounds(100,25,70,30);
		radioButtons[1].addListener(SWT.Selection ,
				e -> System.out.println("Radio Button #2 clicked: value is " + radioButtons[1].getSelection())
		);

		
		radioButtons[2] = new Button(shell, SWT.RADIO);
		radioButtons[2].setText("Choice 3");
		radioButtons[2].setBounds(180,25,70,30);
		radioButtons[2].addListener(SWT.Selection , 
				e -> System.out.println("Radio Button #3 clicked: value is " + radioButtons[2].getSelection())
		);
		
		
		shell.setSize (300, 100);
		shell.open ();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}
