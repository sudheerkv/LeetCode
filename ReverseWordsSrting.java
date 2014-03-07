mport java.util.*;
public class Solution {
    public String reverseWords(String s) {
        StringBuffer result= new StringBuffer();
        int i=0;
        final StringTokenizer parser = new StringTokenizer(s," ");
        while (parser.hasMoreTokens()) {
            final String currentWord = parser.nextToken();
            if(i==0)
                result.insert(0,currentWord);
            else
                result.insert(0,currentWord+" ");
            i++;
        }
        return result.toString();

    }
}
