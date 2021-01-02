package sorting;

public class QuickSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Quick Sort Algorithm
     * Complexity: O(n ln n)
     * */

    public static void main(String[] args){
        int[] array={99,88,5,2,4,6,1,3,8,7,12,500,25,100,13,21,11};
        printArray(array);
        quickSort(array,0, array.length-1);
        printArray(array);
    }

    public static void quickSort(int[] array,int l, int r){
        if (l<r){
            int q = partition(array,l,r);
            quickSort(array,l,q-1);
            quickSort(array,q+1,r);
        }
    }

    public static int partition(int[] array, int l, int r){
        int x = array[r];
        int i=l-1;
        int aux;
        for (int j=l;j<=r-1;j++){
            if (array[j]<=x){
                i++;
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        aux = array[i+1];
        array[i+1]=array[r];
        array[r]=aux;
        return i+1;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

}
