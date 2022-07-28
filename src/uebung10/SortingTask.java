package uebung10;

public class SortingTask {

	private int[] a;
	
	private int numComparisons = 0;
	private int numMovements = 0;

	public SortingTask() {
    }

    public int[] bubblesort(int[] array) {
        this.a = array;
        int n = a.length;
        resetOps();

        for( int i = n - 1; i >= 0; i-- ) {
            for( int j = 0; j <= i-1; j++ ) {
                numComparisons++;
                if( a[j] > a[j+1] ) {
                    swap(j, j+1);
                }
            }
        }

        return a;
    }

    public int[] bubblesortOpt(int[] array) {
        this.a = array;
        int n = a.length;
        resetOps();

        boolean swapped = false;
        for( int i = n - 1; i >= 0; i-- ) {
            swapped = false;
            for( int j = 0; j <= i-1; j++ ) {
                numComparisons++;
                if( a[j] > a[j+1] ) {
                    swap(j, j+1);
                    swapped = true;
                }
            }
            if( swapped == false ) {
                break;
            }
        }

        return a;
    }

    public int[] insertionsort(int[] array) {
        this.a = array;
        int n = a.length;
        resetOps();

        for( int i = 1; i < n; i++ ) {
            numMovements++;
            int temp = a[i];
            int j = i;
            while(j > 0) {
                numComparisons++;
                if( temp < a[j-1] ) {
                    numMovements++;
                    a[j] = a[j-1];
                } else {
                    break;
                }
                j--;
            }
            numMovements++;
            a[j] = temp;
        }

        return a;
    }

    public void resetOps() {
        numComparisons = 0;
        numMovements = 0;
    }

    public void printOps() {
        System.out.println("Comparisons: " + numComparisons + ",   movements: " + numMovements);
    }

    protected void swap(int index1, int index2) {
        int temp = a[index1];
        a[index1]   = a[index2];
        a[index2]   = temp;
        numMovements += 3;
    }
	
	
}
