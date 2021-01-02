public class MergeSort {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Merge Sort Algorithm
     * Complexity: O(n ln n)
     * */

    public static void main(String[] args){
        int[] array={5,2,4,6,1,3,8,7,12,500,25,100,13,21,11};
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
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        int [] left = new int[n1+1];
        int [] right = new int[n2+1];
        for (i=0;i<n1;i++)
            left[i] = array[l + i];
        for (j=0;j<n2;j++)
            right[j] = array[m + j + 1];
        left[n1]=Integer.MAX_VALUE;
        right[n2]=Integer.MAX_VALUE;
        i=0;
        j=0;
        for (k=l;k<=r;k++){
            if (left[i]<=right[j]){
                array[k]=left[i];
                i++;
            }else{
                array[k]=right[j];
                j++;
            }
        }
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(" "+array[i]);
        System.out.println();
    }

}
