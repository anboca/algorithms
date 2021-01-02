public class BubbleSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Merge Sort Algorithm
     * Complexity: O(n^2)
     * */

    public static void main(String[] args){
        int[] array={99,88,5,2,4,6,1,3,8,7,12,500,25,100,13,21,11};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array){
        int i,j,aux;
        for (i=0;i<array.length;i++){
            for (j=array.length;j>=i+1;j--){
                if (array[j]<array[j-1]){
                    aux = array[j];
                    array[j]=array[j-1];
                    array[j-1]=aux;
                }
            }
        }
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

}
