package com.company;

/**
 * Created by bb222 on 10/15/18.
 */
public class encryption {
    String userPhrase = "";\
    
    public encryption(String x){
        userPhrase = x;
    }
    int[] userPhraseArray = new int[userPhrase.length()];
    private String encryptMethod(){
        for(int i = 0; i <=userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userPhraseArray[i] = ASCIIchar;
        }




    }

}
