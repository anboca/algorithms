package sorting;

public class CountingSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Counting Sort Algorithm
     * Complexity: O(n)
     * */

    public static void main(String[] args){
        int[] array={2,5,3,0,2,3,0,3};
        printArray(array);
        printArray(countingSort(array,5));
    }

    public static int[] countingSort(int[] array, int k){
        int[] b= new int[array.length];
        int[] c= new int[k+1];
        int i,j;
        /*for (i=0;i<c.length;i++)//set all elements of c to zero, java does it automatically.
            c[i]=0;*/
        for (i=0;i<array.length;i++)
            c[array[i]]=c[array[i]]+1;
        for (i=1;i<=k;i++)
            c[i]=c[i]+c[i-1];
        for (j=array.length-1;j>=0;j--){
            b[c[array[j]]-1]=array[j];
            c[array[j]]--;
        }
        return b;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

}
