package feladat1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        iQueue queue = new ArrayListQueue(5); // new CircularQueue( 5 );
        Random rnd = new Random();
        for (int i = 0; i < 100; ++i) {
            int value = rnd.nextInt(100);
            if (value < 50) {
                System.out.println("Add: " + i);
                queue.qnQueue(i);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Cannot delete from an empty queue");
                } else {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }}
//        iQueue q1 = new ArrayListQueue(5);
//        iQueue q2 = new ArrayListQueue(10);
//        for( int i=0; i<5; ++i){
//            q1.qnQueue( i );
//            q2.qnQueue( i );
//        }
//        System.out.println( q1.equals( q2 ));
//    }
}

