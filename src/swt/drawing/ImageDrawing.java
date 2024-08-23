package swt.drawing;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ImageDrawing {
	
	public static void main(String[] args) {
		Display display = new Display();
		//define a pattern on an image
		final Image image = new Image(display, 1000, 1000);
		Color blue = display.getSystemColor(SWT.COLOR_BLUE);
		Color yellow = display.getSystemColor(SWT.COLOR_YELLOW);
		Color white = display.getSystemColor(SWT.COLOR_WHITE);
		GC gc = new GC(image);
		gc.setBackground(white);
		gc.setForeground(yellow);
		gc.fillGradientRectangle(0, 0, 1000, 1000, true);
		for (int i=-500; i<1000; i+=10) {
			gc.setForeground(blue);
			gc.drawLine(i, 0, 500 + i, 1000);
			gc.drawLine(500 + i, 0, i, 1000);
		}
		gc.dispose();
		final Pattern pattern;
		try {
			pattern = new Pattern(display, image);
		} catch (SWTException e) {
			//Advanced Graphics not supported.
			//This new API requires the Cairo Vector engine on GTK and GDI+ on Windows.
			System.out.println(e.getMessage());
			display.dispose();
			return;
		}

		Shell shell = new Shell(display);
		shell.setText("Snippet 200");
		shell.setLayout(new FillLayout());
		Composite c = new Composite(shell, SWT.DOUBLE_BUFFERED);
		c.addListener(SWT.Paint, event -> {
			Rectangle r = ((Composite)event.widget).getClientArea();
			GC gc1 = event.gc;
			gc1.setBackgroundPattern(pattern);
			gc1.fillOval(5, 5, r.width - 10, r.height - 10);
		});
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		image.dispose();
		pattern.dispose();
		display.dispose();
	}

}
