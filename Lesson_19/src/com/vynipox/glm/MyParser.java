package com.vynipox.glm;

public class MyParser {

	public static String parseText(String text, String inputText)
	{
		if(text.contains(inputText))
		{
			text = text.replace(text, "");
		}
		
		return text;
	}
}
