package com.vynipox.glm;

public class Manager {
	
	public String replaceText(String inputText)
	{
		FileReaderClass file = new FileReaderClass();
		String text = file.fileReaderMeth();
		
		return MyParser.parseText(text, inputText);
	}
	
}
