package feladat2;

public class Main {
    public static void main(String[] args){
        IDictionary dictionary = new ArrayListDictionary();
        System.out.println(dictionary.size());
        System.out.println(dictionary.find("abalone"));
        dictionary.add("ab");
    }
}
