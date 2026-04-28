package lab10_1;

public class Main {
    public static void main(String[] args){
        SortingDemo demo = new SortingDemo("fruits.txt");
        demo.sortAlphabetically();
        demo.printFruits();
    }
}
