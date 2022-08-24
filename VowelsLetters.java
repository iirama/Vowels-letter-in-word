package vowelsletters;

import java.util.Scanner;

public class VowelsLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the word : ");
        String word = sc.nextLine();
        System.out.println(first_n_vowels(word));
    }

    public static String first_n_vowels(String phrase) {
        int count = 0; // initialize varible to count all number of vowels letters in word 
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e'
                    || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E'
                    || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'O'
                    || phrase.charAt(i) == 'U') {
                count = count + 1;
            }
        }
        char[] vowelarray = new char[count];// initialize array have length as vowels number exist in word
        int k = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e'
                    || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E'
                    || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'O'
                    || phrase.charAt(i) == 'U') {

                vowelarray[k] = phrase.charAt(i); // add vowel letter in array
                k++;
            }
        }
        String theVowels = String.valueOf(vowelarray); // convert array to word
        return theVowels;

    }
}
