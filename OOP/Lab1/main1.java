public class Main1{
    public static void main(String[] args){
        // System.out.println("Hello world!");
        // Fuggveny();
        fel3();

    }
    public static void Fuggveny(){
    String str = "alma,korte,narancs";
        String [] words =str.split(",");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i].trim()) ; 
        }  
    } 
    public static void fel2(){
        String name = "Teompa Krisztian";
        // System.out.println(name.charAt(0));
        String[] words = name.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i].trim());
        }
    }
    public static void fel3(){
        String name = "tree";
        for(int i=1;i<=name.length();i++){
        System.out.println(name.substring(0,i));
        }
    }
//    public static byte getBit(int number, int order){
////        let n=13;
//
//    }
    
}