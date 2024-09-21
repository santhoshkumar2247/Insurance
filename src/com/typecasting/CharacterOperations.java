package com.typecasting;

public class CharacterOperations {
	
	private void printVowels(String sentance) {
		char[] word = sentance.toLowerCase().toCharArray();
		
		for(int i=0;i<word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
				if(word[i] == word[j]) {
					System.out.println(word[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		CharacterOperations characterOperations = new CharacterOperations();
		String word = "Selenium Automation";
		characterOperations.printVowels(word);
	}

}
