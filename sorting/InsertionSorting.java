public class InsertionSorting {

    /*
    * Created by: Andrés Botía Carreño
    * Year: 2021
    * Licence: GNU V3
    * Description: Insertion Sorting Algorithm
    * Complexity: O(n^2)
    * */

    public static void main(String[] args){
        int[] array={5,2,4,6,1,3};
        printArray(array);
        array = insertionSorting(array);
        printArray(array);
    }

    public static int[] insertionSorting(int[] array){
        int i, j, key;
        for (i=1;i< array.length;i++){
            key = array[i];
            j = i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
    }
    
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
}
