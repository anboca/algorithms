public class MergeSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Merge Sort Algorithm
     * Complexity: O(n ln n)
     * */

    public static void main(String[] args){
        int[] array={5,2,4,6,1,3,8,7,12,11,25,100,13,21};
        printArray(array);
        sort(array,0, array.length-1);
        printArray(array);
    }

    public static void sort(int[] array, int l, int r){
        if (l<r) {
            int m = (l+r)/2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array,l,m,r);
        }
    }

    public static void merge(int [] array, int l, int m, int r){
        //merge elements of two arrays, l to m and m+1 to r
        int[] tempArray = new int[r-l+1];//array to order elements
        int i=l,j=m+1, k=0, index;
        //merge elements
        while (i<=m && j<=r){
            if (array[i]>array[j]){
                tempArray[k]=array[j];
                j++;
                k++;
            }else{
                tempArray[k]=array[i];
                i++;
                k++;
            }
        }
        //add elements left
        if (i<=m && j>r){
            for (index=i;index<=m;index++) {
                tempArray[k] = array[index];
                k++;
            }
        }
        if (j<=r && i>m){
            for (index=j;index<=r;index++) {
                tempArray[k] = array[index];
                k++;
            }
        }
        for (i=l,k=0;i<=r;i++,k++)
            array[i]=tempArray[k];
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(" "+array[i]);
        System.out.println();
    }

}
