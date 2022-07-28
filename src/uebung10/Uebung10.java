package uebung10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class Uebung10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{8, 16, 3, 12, 2, 9};
        int[] b = new int[]{15, 10, 13, 18, 4, 8};

        SortingTask sortingTask = new SortingTask();

        int[] sortedA = sortingTask.bubblesort(a);
        System.out.println("Bubblesort");
        System.out.println(Arrays.toString(sortedA));
        sortingTask.printOps();

        a = new int[]{8, 16, 3, 12, 2, 9};
        sortedA = sortingTask.bubblesortOpt(a);
        System.out.println("Bubblesort opt");
        System.out.println(Arrays.toString(sortedA));
        sortingTask.printOps();

        a = new int[]{8, 16, 3, 12, 2, 9};
        sortedA = sortingTask.insertionsort(a);
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(sortedA));
        sortingTask.printOps();

        System.out.println();

        int[] sortedB = sortingTask.bubblesort(b);

        System.out.println("Bubblesort");
        System.out.println(Arrays.toString(sortedB));
        sortingTask.printOps();

        b = new int[]{15, 10, 13, 18, 4, 8};
        sortedB = sortingTask.bubblesortOpt(b);
        System.out.println("Bubblesort opt");
        System.out.println(Arrays.toString(sortedB));
        sortingTask.printOps();

        b = new int[]{15, 10, 13, 18, 4, 8};
        sortedB = sortingTask.insertionsort(b);
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(sortedB));
        sortingTask.printOps();

        System.out.println();

        Random r = new Random();
        int[] c = r.ints().limit(10000).toArray();

        // Kommentare entfernen, um mit einer bereits sortierten Liste arbeiten
//        c = sortingTask.insertionsort(c);

        // Reihenfolge der Liste ändern (zusammen mit Sortieren ergibt sich eine umgekehrt sortierte Liste)
//        int[] d = new int[c.length];
//        for( int i = 0; i < c.length; i++ ) {
//            d[i] = c[c.length - i - 1];
//        }
//        c = d;

        // Vertauscht zufällig 10 Elementpaare. Zusammen mit Sortieren ergibt sich eine fast vollständig sortierte Liste
//        for( int i = 0; i < 10; i++) {
//            int index1 = r.nextInt(c.length);
//            int index2 = r.nextInt(c.length);
//            int temp = c[index1];
//            c[index1] = c[index2];
//            c[index2] = temp;
//        }

        int[] c2 = Arrays.copyOf(c, c.length);
        int[] c3 = Arrays.copyOf(c, c.length);

        int[] sortedC = sortingTask.bubblesort(c);

        System.out.println("Bubblesort");
        //System.out.println(Arrays.toString(sortedC));
        sortingTask.printOps();

        sortedC = sortingTask.bubblesortOpt(c2);
        System.out.println("Bubblesort opt");
        //System.out.println(Arrays.toString(sortedC));
        sortingTask.printOps();

        sortedC = sortingTask.insertionsort(c3);
        System.out.println("Insertion sort");
        //System.out.println(Arrays.toString(sortedC));
        sortingTask.printOps();
        
	}

}
