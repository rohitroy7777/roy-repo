package com.roy.practice;

public class ConsecutiveDuplicates {

	public static void main(String[] args) {

		System.out.println("Result String -> " + resultString("AAAAABBCCCDA")); // Output should be A2B2C3D2A3

	}

	static String resultString(String str) {

		char ch[] = str.toCharArray();
		String output = "";
		int i;
		for (i = 0; i < str.length(); i++) {
			int count = 1;
			while (i + 1 < str.length() && ch[i] == ch[i + 1]) {
				count += 1;
				i += 1;
			}
			output += ch[i] + String.valueOf(count);
		}

		return output;
	}

}
