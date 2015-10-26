package com.vynipox.glm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Manager manager = new Manager();
		String inputText ="";
		
		System.out.print("Enter the text:");
		
		inputText = scanner.nextLine();
		
		System.out.print(manager.replaceText(inputText));
	}
}
