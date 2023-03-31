package org.launchcode.java.studios.countingCharacters;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CharCounterIII {
    public static void main(String[] args) {
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String phrase;
        Scanner input;
        //String alpha = "abcdefghijklmnopqrstuvwxyz";

        input = new Scanner(System.in);
        System.out.println("Please enter a phrase.");
        phrase = input.nextLine();
        input.close();

        phrase = phrase.toLowerCase();


        char[] phraseArray = phrase.toCharArray();
        HashMap<Character, Integer> phraseHash = new HashMap<>();

        for (char i: phraseArray){
            if (!phraseHash.containsKey(i)){
                phraseHash.put(i,1);
            } else {
                phraseHash.put(i, phraseHash.get(i) + 1);
            }
        }
        //System.out.println(phraseHash);

        for (char i : phraseHash.keySet()){
            System.out.println(i +" "+ phraseHash.get(i));
        }
    }
}
