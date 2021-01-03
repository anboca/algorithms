package sorting;

public class HeapSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Heap Sort Algorithm
     * Complexity: O(n ln n)
     * */

    public static void main (String[] args){
        int[] array={4,1,3,2,16,9,10,14,8,7};
        printArray(array);
        heapSort(array);
        printArray(array);
    }

    public static void heapSort(int[] array){
        buildMaxHeap(array);
        int i,aux,heapSize=array.length;
        for (i=array.length-1;i>=1;i--){
            aux = array[0];
            array[0]=array[i];
            array[i]=aux;
            heapSize--;
            maxHeapify(array,0,heapSize);
        }
    }

    public static void buildMaxHeap(int[] array){
        int size = array.length;
        for (int i=size/2-1;i>=0;i--)
            maxHeapify(array,i,size);
    }
    /*
     * Parent floor((i-1)/2)
     * Left 2i+1
     * Right 2(i+1)
     * */
    public static void maxHeapify(int[] array, int i, int heapSize){
        int l, r, largest, aux;
        l = 2*i+1;
        r = 2*(i+1);
        if (l< heapSize && array[l]>array[i])
            largest = l;
        else
            largest = i;
        if (r < heapSize && array[r]>array[largest])
            largest = r;
        if (largest!=i){
            aux = array[i];
            array[i] = array[largest];
            array[largest] = aux;
            maxHeapify(array,largest,heapSize);
        }
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(" "+array[i]);
        System.out.println();
    }

}
