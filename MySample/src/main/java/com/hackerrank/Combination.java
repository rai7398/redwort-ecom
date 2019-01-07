package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Combinations
{
    // Iterative function to find all possible combinations of words
    // formed from mobile keypad
    public static void findCombinations(List<List<Character>> keypad, int[] input)
    {
        // list to store combinations of all possible words
        List<String> outputList = new ArrayList<>();

        // push all character associated with first digit into the output list
        for (Character ch: keypad.get(input[0])) {
            outputList.add(String.valueOf(ch));
        }

        // start from second digit
        for (int i = 1; i < input.length; i++)
        {
            // create a temporary list and clear contents of output list
            List<String> prevList = new ArrayList<>(outputList);
            outputList.clear();

            // for each character associated with current digit in the keypad
            for (Character ch: keypad.get(input[i]))
            {
                // append current character to each word in the output list
                for (String s: prevList) {
                    outputList.add(s + ch);
                }
            }

            // list now contains all possible combinations of words
            // until current digit
        }

        // print output list containing all combinations of words possible
        System.out.println(outputList);
    }
    static TreeSet<String> generatePermutations(int[] input) {
		TreeSet<String> allPermutations=new TreeSet<String>(); // I want unique sorted permutations

	     List<List<Character>> keypad = Arrays.asList(
                 // 0 and 1 digit don't have any characters associated
                 Arrays.asList(),
                 Arrays.asList(),
                 Arrays.asList( 'A', 'B', 'C' ),
                 Arrays.asList( 'D', 'E', 'F' ),
                 Arrays.asList( 'G', 'H', 'I' ),
                 Arrays.asList( 'J', 'K', 'L' ),
                 Arrays.asList( 'M', 'N', 'O' ),
                 Arrays.asList( 'P', 'R', 'S'),
                 Arrays.asList( 'T', 'U', 'V' ),
                 Arrays.asList( 'W', 'X', 'Y')
		);
      // your code goes here 
	     List<String> outputList = new ArrayList<>();

	        // push all character associated with first digit into the output list
	        for (Character ch: keypad.get(input[0])) {
	            outputList.add(String.valueOf(ch));
	        }

	        // start from second digit
	        for (int i = 1; i < input.length; i++)
	        {
	            // create a temporary list and clear contents of output list
	            List<String> prevList = new ArrayList<>(outputList);
	            outputList.clear();

	            // for each character associated with current digit in the keypad
	            for (Character ch: keypad.get(input[i]))
	            {
	                // append current character to each word in the output list
	                for (String s: prevList) {
	                    outputList.add(s + ch);
	                }
	            }

	            // list now contains all possible combinations of words
	            // until current digit
	        }
      
      	return allPermutations;
    }

    // main function
    public static void main(String[] args)
    {
   

        // input number in the form of an array (number can't start from 0 or 1)
        int[] input = { 2, 3, 4 };

        // find all combinations
        generatePermutations( input);
    }
}