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

            //Read file until there are no more lines
             while ((currentLine = fileReader.readLine()) != null) {

                // Break the line into words using spaces
                String[] wordList = currentLine.split("\\s+");
                for (String rawWord : wordList) {

                    // Remove punctuation and special characters
                    String processedWord = cleanWord(rawWord);

                    // Ignore empty results
                    if (processedWord.isEmpty()) {
                        continue;
                    }
                    //Generate the sorted version of the word
                    String sortedKey = getSignature(processedWord);
                    // If the key does not exist yet, create a new list
                    if (!anagramGroups.containsKey(sortedKey)) {
                        anagramGroups.put(sortedKey, new ArrayList<String>());
                    }
                    // Add the word to its matching anagram group
                    anagramGroups.get(sortedKey).add(processedWord);
                }
            }
             // Close the reader when finished
            fileReader.close();
            System.out.println("Finished reading file: " + fileName);
            } catch (IOException error) {
            System.err.println("Error reading file: " + error.getMessage());
            return;
        }

        // Display the anagram groups found in the file
        printAnagrams(anagramGroups);
    }
    
     // Removes punctuation, digits, and special characters.
     // Only letters (a–z, A–Z) are kept and converted to lowercase.
     public static String cleanWord(String originalWord) {

        // Remove all characters that are not alphabet letters
        String cleanedWord = originalWord.replaceAll("[^a-zA-Z]", "");

        // Convert the result to lowercase
        return cleanedWord.toLowerCase();
    }
            
        }
    
    }

}