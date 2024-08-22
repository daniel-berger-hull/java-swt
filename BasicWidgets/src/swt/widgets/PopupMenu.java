package swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;



public class PopupMenu {
	
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setText("Snippet 89");
		Menu menu = new Menu (shell, SWT.POP_UP);
		for (int i = 0; i < 4; i++) {
				MenuItem item = new MenuItem(menu, SWT.RADIO);
				item.setText("Item " + i);
				
				item.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
					MenuItem menuItem = (MenuItem) e.widget;
					if (menuItem.getSelection()) {
						System.out.println(menuItem + " selected");
					} else {
						System.out.println(menuItem + " unselected");
					}
				}));
			}
		shell.setMenu (menu);
		shell.setSize (300, 300);
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}

}

