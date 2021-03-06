// Grzegorz Ko�czak, 17.08.2016
// Exercise number 14.10 page 679
// Exercise from Java:How to program 10th edition

package chapter14;

import java.util.Scanner;

public class SentenceLongestWord {

private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Input sentence and confirm with enter");
		String originalSentence = input.nextLine();
		String[] tokenizedSentence = originalSentence.split("\\s");
		
		String longestWord = tokenizedSentence[0];
		
		for (String string : tokenizedSentence) {
			if (string.length() > longestWord.length()){
				longestWord = string;
			}
		}
		
		System.out.println("Longest word is: " + longestWord);
	}
}
