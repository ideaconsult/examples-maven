package net.idea.examples.examples_maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.idea.examples.examples_maven.MainApp._option;

/**
 * The class that does the work.
 * @author nina
 *
 */
public class BreadWinner {
	private final static Logger LOGGER = Logger.getLogger(BreadWinner.class.getName());
	protected File file;
	/**
	 * 
	 * @return
	 */
	public File getFile() {
		return file;
	}
	/**
	 * 
	 * @param file
	 */
	public void setFile(File file) {
		this.file = file;
	}
	/**
	 * 
	 * @param option
	 * @param argument
	 * @throws Exception
	 */
	public void setOption(_option option, String argument) throws Exception {
		if (argument!=null) argument = argument.trim();
		switch (option) {
		case file: {
			if ((argument==null) || "".equals(argument.trim())) return;
			setFile(new File(argument));
			break;
		}
		default: {
			LOGGER.log(Level.INFO, String.format("Unsupported option %s %s ",option,argument));
		}
		}
	}
	/**
	 * TODO Do something real here
	 * @return
	 * @throws Exception
	 */
	public int doWork() throws Exception {
		if (file==null) throw new Exception("File not assigned! Use -f command line option.");
		if (!file.exists()) throw new FileNotFoundException(file.getAbsolutePath());
		System.out.println(file.getAbsolutePath());
		return 0;
	}
}
