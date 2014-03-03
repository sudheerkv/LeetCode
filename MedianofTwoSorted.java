public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
    /*solution with O(m+n) not O(log(m+n))*/
        int m=A.length, n =B.length;
        int[] c = new int[m+n];
        int i=0,j=0,k=0;
        
        while(i<m || j<n) {
            if(i>0 && j>0){
                if(A[i]<B[j])
                    c[k++]=A[i++];
                else
                    c[k++]=B[j++];
            }
        }
        
        while(i<m)
            c[k++]=A[i++];
        while(j<n)
         c[k++]=B[j++];
        return (double)c[m+n/2];
    }
}
