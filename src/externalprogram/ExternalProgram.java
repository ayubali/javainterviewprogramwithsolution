package externalprogram;

public class ExternalProgram {

	public static void runExternProcess(String processName) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(processName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runExternProcess("notepad.exe");

	}

}
