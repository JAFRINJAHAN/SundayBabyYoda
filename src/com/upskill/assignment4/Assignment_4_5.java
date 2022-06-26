package com.upskill.assignment4;

import java.util.Arrays;

/* 5. Check whether two strings are anagram of each other from an array? */
public class Assignment_4_5 {

	public static void main(String[] args) {
		areAnagrams("night", "thing");
	}

	public static boolean areAnagrams(String word1, String word2) {

		// convert the 2 words passed into char arrays
		char[] String1 = word1.toCharArray();
		char[] String2 = word2.toCharArray();

		// sort the arrays
		Arrays.sort(String1);
		Arrays.sort(String2);

		// keep track of the length of words
		int StringLength1 = String1.length;
		int StringLength2 = String2.length;

		// check if the length of each string is equal or not
		if (StringLength1 != StringLength2) {
			System.out.println("These 2 words are not anagrams!");
			return false;
		}

		// for loop will compare each char in the sorted char array
		for (int i = 0; i < StringLength1; i++) {

			// compare the letters of each word to determine if they are
			// anagrams
			if (String1[i] != String2[i]) {
				System.out.println("These 2 words are not anagrams!");
				return false;
			}
		}
		System.out.println("These 2 words are anagrams!");
		return true;
	}
}
