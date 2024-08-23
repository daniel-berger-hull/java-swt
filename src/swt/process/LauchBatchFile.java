package swt.process;


/* Example that runs a batch file, start Notepad and quit. 
 * Note: The program will blink and exit very quickly! (And Notepad will be open) */

import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Display;

public class LauchBatchFile {

	public static void main(String[] args) {
		Display display = new Display ();
				
		Program.launch("C:\\data\\workspaces\\Java\\GUI\\SWT\\SWTBasics\\test.bat");
		
		// You can launch executable also! 
		//Program.launch("notepad.exe");
		
		display.dispose ();
	}
	
}
