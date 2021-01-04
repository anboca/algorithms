package strings;

public class KMPSearch {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: KMP String Search
     * Complexity: O(n)
     * */

    public static void main(String[] args){
        String text = "afdnsasdfads fsad fdsa hfdsajfk dsaf dsasfa";
        String pattern = "dsa";
        System.out.println("Text: "+text);
        System.out.println("Word: "+pattern);
        KMPMatcher(text,pattern);
    }

    public static int[] KMPLpsCalculator(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];
        int k=0;
        lps[0]=0;
        for (int q=1;q<m;q++){
            while (k>0 && pattern.charAt(k)!=pattern.charAt(q))
                k = lps[k];
            if (pattern.charAt(k)==pattern.charAt(q))
                k++;
            lps[q] = k;
        }
        return lps;
    }

    public static void KMPMatcher(String text, String pattern){
        int n=text.length();
        int m=pattern.length();
        int[] lps = KMPLpsCalculator(pattern);
        int q=0;
        for (int i=0;i<n;i++){
            while (q>0 && pattern.charAt(q)!=text.charAt(i))
                q = lps[q-1];
            if (pattern.charAt(q)==text.charAt(i)) {
                q++;
            }
            if (q==m){
                System.out.println("Pattern occurs at index: "+(i-m+1));
                q=lps[q-1];
            }
        }
    }

}
