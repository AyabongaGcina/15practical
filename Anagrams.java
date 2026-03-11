//Ayabonga Gcina
//4446494
//Practical 5

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashmap;
import java.util.List;
import java.util.Map;

public class Anagrams{
    public static void main(String[]args){
        //Name of text file that will be read
        String fileName="ulysses.text";
        //Map used to store grouped anagrams
        //Key=Sorted version of the word
        //Value=list of words with the same letter
         Map<String, List<String>> anagramGroups = new HashMap<String, List<String>>();
        try{
            //Creating reader to read line by line
             BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            
        }
    
    }

}