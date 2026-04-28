package feladat2;

public interface IDictionary {
    static final String DICTIONARY_FILE="dict.txt";
    boolean find(String o);
    boolean add(String o);
    int size();
}
