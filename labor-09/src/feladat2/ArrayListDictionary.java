package feladat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;

    public ArrayListDictionary() {
        this.words = readWord(DICTIONARY_FILE);
    }

    @Override
    public boolean add(String word) {
        if (!words.contains(word)) {
            words.add(word);
            //Collections.sort(words);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }

    public static ArrayList<String> readWord(String filename) {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String szo = scanner.next();
                words.add(szo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
//    DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
//    Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + service.findWord(word));
//    }
//        scanner.close();

}
