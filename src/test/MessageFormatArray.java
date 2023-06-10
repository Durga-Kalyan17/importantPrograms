package test;

import java.text.MessageFormat;

public class MessageFormatArray {

	public static void main(String[] args) {
		int fileCount = 1200;
		String diskName = "MyDisk";
		Object [] testArgs = {new Long(fileCount), diskName};
		
		MessageFormat form = new MessageFormat("The disk {1} contains {0} files.");
		
		System.out.println(form.format(testArgs));

	}

}
