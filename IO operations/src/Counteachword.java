/*Write a program to count the occurrences of each word in an 
 * input file and write the word along with its corresponding count in an output file.

[Note: The words should be sorted alphabetically in the output file]

(Hint : Consider using Map Collection)

For Example, let's assume the following are the contents of inputFile.txt

Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro

D:\>Java FileWordCount inputFile.txt outputFile.txt

After Execution of the program the contents of outputFile.txt should be as below

Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.TreeMap;

public class Counteachword{
    @SuppressWarnings("boxing")
	public static void main(String[] args) throws FileNotFoundException, IOException {
 
        Scanner console = new Scanner(System.in);
        System.out.print("What is the name of the text file? ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File("C:\\Users\\Mithun\\Desktop\\prgms\\IO operations\\src\\"+fileName));

        // count occurrences
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);

            if (count >= 1) {
                System.out.println(  word+ "\t" +count);
            }
        }
        console.close();
        input.close();
    }
}